import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExemploPreparedStatement {
    
    private Connection con = null;
    private String usuario = null;
    private String senha = null;
    private String urlConexao = null;
    private String driverJDBC = null;
    
    public ExemploPreparedStatement() {
        driverJDBC = "org.apache.derby.jdbc.ClientDriver";
        urlConexao = "jdbc:derby://localhost:1527/ead-br";
        usuario = "ead";
        senha = "ead";
        
        this.conectarBanco();
        this.executarPreparedStatement();
        this.desconectarBanco();
        
    }
    
    public static void main(String[] args) {
        new ExemploPreparedStatement();
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

    private void executarPreparedStatement() {
        String sql = "INSERT INTO EAD.PRODUTO (ID, DESCRICAO) VALUES (?, ?)";
        try {
            PreparedStatement stmtProdutos = con.prepareStatement(sql);
            stmtProdutos.setInt(1, 2000);
            stmtProdutos.setString(2, "DESCRICAO DO PRODUTO 2000");
            int qtdRegistrosInseridos = stmtProdutos.executeUpdate();
            String saida = "Quantidade de registros inseridos: " + 
                qtdRegistrosInseridos;
            JOptionPane.showMessageDialog(null, saida, 
                "Registro Inserido com Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                    "Erro ao inserir registro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
