import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExemploResultSet {
    
    private Connection con = null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driverJDBC = null;
    
    public ExemploResultSet() {
        driverJDBC = "org.apache.derby.jdbc.ClientDriver";
        urlConexao = "jdbc:derby://localhost:1527/ead-br";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        this.recuperarResultSet();
        this.desconectarBanco();
    }
    
    public static void main(String[] args) {
        new ExemploResultSet();
    }

    private void conectarBanco() {
        try {
            Class.forName(driverJDBC);
            con = DriverManager.getConnection(urlConexao, usuario, senha);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "Erro ao conectar no banco", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void desconectarBanco() {
        try {
            if (!con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "Erro ao desconectar", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void recuperarResultSet() {
        String saida = "";
        String sql = "SELECT ID, DESCRICAO FROM EAD.PRODUTO";
        try {
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet dados = stmt.executeQuery(sql);
            if (!dados.next()) {
                saida = "Nenhum registro cadastrado";
            } else {
                saida = "Recuperando pelo índice da coluna";
                saida += "\nCódigo\tDescrição";
                dados.first();
                while(!dados.isAfterLast()) {
                    saida += "\n" + dados.getInt(1) + "\t" + 
                            dados.getString(2);
                    dados.next();
                }
                saida += "\n\nRecuperando pelo nome da coluna";
                saida += "\nCódigo\tDescrição";
                dados.first();
                while(!dados.isAfterLast()) {
                    saida += "\n" + dados.getInt("ID") + "\t" + 
                            dados.getString("DESCRICAO");
                    dados.next();
                }
            }
            JTextArea saidaArea = new JTextArea();
            saidaArea.setText(saida);
            JOptionPane.showMessageDialog(null, saidaArea, 
                    "Recuperando com ResultSet", 
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "Erro ao recuperar registros", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}
