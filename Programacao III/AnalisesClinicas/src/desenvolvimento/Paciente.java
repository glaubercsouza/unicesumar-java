package desenvolvimento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Paciente {

    private int codigo;
    private String nome;
    private String endereco;
    private String CEP;
    private String telefone;
    private Date dataNascimento;
    private String RG;
    private String CPF;
    private Cidade cidade = new Cidade();

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCEP() {
        return this.CEP;
    }
    
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getRG() {
        return this.RG;
    }
    
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public String getCPF() {
        return this.CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void cadastrar() throws ParseException {
        Scanner tec = new Scanner(System.in);
        System.out.println("INFORME OS DADOS DO PACIENTE");
        System.out.print("Nome: ");
        this.setNome(tec.nextLine());
        System.out.print("Endereço: ");
        this.setEndereco(tec.nextLine());
        System.out.print("CEP: ");
        this.setCEP(tec.nextLine());
        System.out.print("Telefone: ");
        this.setTelefone(tec.nextLine());
        System.out.print("Data de Nascimento [DD/MM/AAAA]: ");
        String dataRecebida = tec.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dataRecebida);
        this.setDataNascimento(dt);
        System.out.print("RG: ");
        this.setRG(tec.nextLine());
        System.out.print("CPF: ");
        this.setCPF(tec.nextLine());
        cidade.cadastra();
    }
    
    public void imprimePaciente() {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String stringData = formataData.format(this.getDataNascimento());
        System.out.println("Paciente: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("CEP: " + this.getCEP());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Data de Nascimento: " + stringData);
        System.out.println("RG: " + this.getRG());
        System.out.println("CPF: " + this.getCPF());
        cidade.imprimirCidade();
    }
}
