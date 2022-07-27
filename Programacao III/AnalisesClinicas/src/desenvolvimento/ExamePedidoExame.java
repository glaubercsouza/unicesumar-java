package desenvolvimento;

import static desenvolvimento.Programa.contEx;
import static desenvolvimento.Programa.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExamePedidoExame {
    private Date dataRealizacaoExame;
    private Date dataPronto;
    private Exame examePedido = new Exame();
    private Date horaRealizacaoExame;
    private Date horaPronto;
    private String resultado;
    
    public Date getDataRealizacaoExame() {
        return this.dataRealizacaoExame;
    }
    
    public void setDataRealizacaoExame(Date dataRealizacaoExame) {
        this.dataRealizacaoExame = dataRealizacaoExame;
    }
    
    public Date getDataPronto() {
        return this.dataPronto;
    }
    
    public void setDataPronto(Date dataPronto) {
        this.dataPronto = dataPronto;
    }
    
    public Exame getExamePedido() {
        return this.examePedido;
    }
    
    public void setExamePedido(Exame examePedido) {
        this.examePedido = examePedido;
    }
    
    public Date getHoraRealizacaoExame() {
        return this.horaRealizacaoExame;
    }
    
    public void setHoraRealizacaoExame(Date horaRealizacaoExame) {
        this.horaRealizacaoExame = horaRealizacaoExame;
    }
    
    public Date getHoraPronto() {
        return this.horaPronto;
    }
    
    public void setHoraPronto(Date horaPronto) {
        this.horaPronto = horaPronto;
    }
    
    public String getResultado() {
        return this.resultado;
    }
    
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public void cadastrar() throws ParseException {
        Scanner cad = new Scanner(System.in);
        int codE;
        
        System.out.println("--------------------------");
        System.out.println("Relaç?o de Exames");
        System.out.println("Cód | Descriç?o | Valor");
        for(int i = 0; i < contEx; i++) {
            System.out.print("   " + i);
            ex[i].listarExame();
            System.out.println();
        }
        System.out.println("Escolha um Exame: ");
        codE = cad.nextInt();
        this.setExamePedido(ex[codE]);
        cad.nextLine();
        
        System.out.print("Data Realizaç?o exame Ex: [02/12/1982]: ");
        String dataRealizarExame = cad.nextLine();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = sdf1.parse(dataRealizarExame);
        this.setDataRealizacaoExame(dt1);
        
        System.out.print("Data exame pronto Ex: [02/12/1982]: ");
        String dataRetirarExame = cad.nextLine();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt2 = sdf2.parse(dataRetirarExame);
        this.setDataPronto(dt2);
        
        System.out.print("Hora Realizaç?o exame Ex: [10:12]: ");
        String horaRealizarExame = cad.nextLine();
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm");
        Date dth1 = sdf3.parse(horaRealizarExame);
        this.setHoraRealizacaoExame(dth1);
        
        System.out.print("Hora exame pronto Ex: [10:12]: ");
        String horaRetirarExame = cad.nextLine();
        SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm");
        Date dth2 = sdf4.parse(horaRetirarExame);
        this.setHoraPronto(dth2);
        
        System.out.print("Valor: " + this.getValor());
    }

    public void imprimir() {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String dataRealizarExame = formataData.format(this.getDataRealizacaoExame());
        System.out.println("Data do Exame: " + dataRealizarExame);
        
        SimpleDateFormat formataHora = new SimpleDateFormat("HH:mm");
        String horaRealizarExame = formataHora.format(this.getHoraRealizacaoExame());
        System.out.println("Horário do Exame: " + horaRealizarExame);
        
        String dataRetirarExame = formataData.format(this.getDataPronto());
        System.out.println("Data para retirar o Exame: " + dataRetirarExame);
        
        String stringData13 = formataHora.format(this.getHoraPronto());
        System.out.println("Horário para retirar o Exame: " + stringData13);
    }
}
