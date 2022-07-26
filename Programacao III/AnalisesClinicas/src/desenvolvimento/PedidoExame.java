package desenvolvimento;

import static desenvolvimento.Programa.c;
import static desenvolvimento.Programa.m;
import static desenvolvimento.Programa.p;
import static desenvolvimento.Programa.contC;
import static desenvolvimento.Programa.contM;
import static desenvolvimento.Programa.contP;

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
        System.out.println("    Rela�?o de Pacientes");
        System.out.println(" C�digo |   CPF   |  Nome  ");
        for(int i = 0; i < contP; i++) {
            System.out.print("  " + i);
            p[i].listarPaciente();
            System.out.println();
        }
        System.out.println("Escolha um Paciente");
        codPaciente = cad.nextInt();
        this.setPaciente(p[codPaciente]);
        cad.nextLine();
        
        System.out.println("----------------------------");
        System.out.println("     Rela�?o de M�dicos");
        System.out.println(" C�digo |   CRM   |  Nome  ");
        for(int i = 0; i < contM; i++) {
            System.out.print("  " + i);
            m[i].listarMedico();
            System.out.println();
        }
        System.out.println("Escolha um M�dico");
        codMedico = cad.nextInt();
        this.setMedico(m[codMedico]);
        cad.nextLine();
        
        System.out.println("----------------------------");
        System.out.println("    Rela�?o de Conv�nio");
        System.out.println("C�digo | Nome");
        for(int i = 0; i < contC; i++) {
            System.out.print("  " + i);
            c[i].imrpimirConvenio();
            System.out.println();
        }
        System.out.println("Escolha um conv�nio");
        codConvenio = cad.nextInt();
        this.setConvenio(c[codConvenio]);
        cad.nextLine();
    }
    
    public void imprimirPedidoExame() {
        System.out.println("M�dico: " + this.getMedico());
        System.out.println("Conv�nio: " + this.getConvenio());
        System.out.println("Paciente: " + this.getPaciente());
    }
}
