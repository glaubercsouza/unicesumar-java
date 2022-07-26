package desenvolvimento;

import java.util.Scanner;

public class PedidoExame {
    private int codigo;
    private Paciente paciente = new Paciente();
    private Medico medico = new Medico();
    private Convenio convenio = new Convenio();    
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCondigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public Convenio getConvenio() {
        return this.convenio;
    }
    
    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
    
    public void cadastrar() {
        Scanner cad = new Scanner(System.in);
        int codPaciente, codMedico, codConvenio;
        System.out.println("----------------------------");
        System.out.println(" Código |   CPF   |  Nome  ");
    }
}
