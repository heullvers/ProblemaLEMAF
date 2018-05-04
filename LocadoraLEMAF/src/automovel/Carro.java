
package automovel;


public class Carro {
    
    private String modelo;
    private int qntPassageiros;
    private double taxa;
    protected double valorAluguelTotal;

    public Carro(String modelo, int qntPassageiros, double taxa) {
        this.modelo = modelo;
        this.qntPassageiros = qntPassageiros;
        this.taxa = taxa;
        valorAluguelTotal = 0;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getModelo() {
        return modelo;
    }
    

    
    
    
}
