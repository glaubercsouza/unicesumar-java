
package peixes;

public class Peixe {
    // Atributos
    private String tipoPele;
    private int numDentes;
    
    // Métodos
    
    public void nadar() {
        System.out.println("Mexer as barbatanas");
    }
    
    public void comer() {
        System.out.println("Procurar comida e comer");
    }
    
    public String getTipoPele() {
        return this.tipoPele;
    }
    
    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }
    
    public int getNumDentes() {
        return this.numDentes;
    }
    
    public void setNumDentes(int numDentes) {
        this.numDentes = numDentes;
    }
}
