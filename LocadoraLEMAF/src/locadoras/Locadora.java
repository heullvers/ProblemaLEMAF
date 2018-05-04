
package locadoras;

import automovel.Carro;
import java.util.ArrayList;


public abstract class Locadora {
    
    protected double taxaMeioDeSemanaRegular;
    protected double taxaFimDeSemanaRegular;
    protected double taxaMeioDeSemanaFidelidade;
    protected double taxaFimDeSemanaFidelidade;
    
    public abstract double taxarMeioDeSemanaRegular(Carro c);
    public abstract double taxarFimDeSemanaRegular(Carro c);
    public abstract double taxarMeioDeSemanaFidelidade(Carro c);
    public abstract double taxarFimDeSemanaFidelidade(Carro c);
    public abstract void exibirCarrosNormais();
    public abstract void exibirCarrosPremium();

    public Locadora(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
        this.taxaMeioDeSemanaRegular = taxaMeioDeSemanaRegular;
        this.taxaFimDeSemanaRegular = taxaFimDeSemanaRegular;
        this.taxaMeioDeSemanaFidelidade = taxaMeioDeSemanaFidelidade;
        this.taxaFimDeSemanaFidelidade = taxaFimDeSemanaFidelidade;
    }
    
    



    
    
    
}
