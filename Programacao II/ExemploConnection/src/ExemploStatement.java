import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ExemploStatement {
    
    private Connection con = null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driverJDBC = null;
    
    public ExemploStatement() {
        driverJDBC = "org.apache.derby.jdbc.ClientDriver";
        urlConexao = "jdbc:derby://localhost:1527/ead-br";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        this.executarStatement();
        this.desconectaBanco();
        
    }
    
    public static void main(String[] args) {
        new ExemploStatement();
    }

    private void conectarBanco() {
        try {
            Class.forName(driverJDBC);
            con = DriverManager.getConnection(urlConexao, usuario, senha);
        }catch(ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Erro ao conectar no banco", JOptionPane.ERROR_MESSAGE);
        } 
    }

    private void desconectaBanco() {
        try {
            if (!con.isClosed()){
                con.close();
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "Erro ao desconectar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void executarStatement() {
        try {
            String sql = "";
            Statement stmt = con.createStatement();
            int qtdRegistrosInseridos = stmt.executeUpdate(sql);
            String saida = "Quantidade de registros inseridos:" + 
                qtdRegistrosInseridos;
            JOptionPane.showMessageDialog(null, saida, 
                "Registro Inserido com Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Erro ao inserir registro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
