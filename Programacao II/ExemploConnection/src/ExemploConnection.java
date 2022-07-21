
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExemploConnection {
    
    private Connection con = null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    
    public ExemploConnection() {
        urlConexao = "jdbc:derby://localhost:1527/ead-br";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        
        this.desconectarBanco();
    }
    
    public static void main(String[] args) {
        new ExemploConnection();
    }
    
    private void conectarBanco() {
        String saida = "";
        try {
            //Class.forName(org.apache.derby.jdbc.ClientDriver);
            con = DriverManager.getConnection(urlConexao, usuario, senha);
            
            saida += "Informações de Conexão";
            saida += "\nFabricante SGBD: " + 
                    con.getMetaData().getDatabaseProductName();
            saida += "\nVersão SGBD: " + 
                    con.getMetaData().getDatabaseProductVersion();
            saida += "\nDriver SGBD: " +
                    con.getMetaData().getDriverName();
            saida += "\nVersão Driver SGBD: " +
                    con.getMetaData().getDriverVersion();
            saida += "\nUrl de Conexão: " + 
                    con.getMetaData().getURL();
            saida += "Usuário: " +
                    con.getMetaData().getUserName();
            
            JTextArea saidaArea = new JTextArea();
            saidaArea.setText(saida);
            
            JOptionPane.showMessageDialog(null, saidaArea, 
                    "Conexão realizada com sucesso", 
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex){
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
    
}
