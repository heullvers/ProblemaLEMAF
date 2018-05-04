
package locadoras;

import automovel.Carro;
import java.util.ArrayList;


public abstract class Locadora {
    
    protected double taxaMeioDeSemanaRegular;
    protected double taxaFimDeSemanaRegular;
    protected double taxaMeioDeSemanaFidelidade;
    protected double taxaFimDeSemanaFidelidade;
    
    public abstract void taxarMeioDeSemanaRegular(Carro c);
    public abstract void taxarFimDeSemanaRegular(Carro c);
    public abstract void taxarMeioDeSemanaFidelidade(Carro c);
    public abstract void taxarFimDeSemanaFidelidade(Carro c);

    public Locadora(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
        this.taxaMeioDeSemanaRegular = taxaMeioDeSemanaRegular;
        this.taxaFimDeSemanaRegular = taxaFimDeSemanaRegular;
        this.taxaMeioDeSemanaFidelidade = taxaMeioDeSemanaFidelidade;
        this.taxaFimDeSemanaFidelidade = taxaFimDeSemanaFidelidade;
    }
    
    



    
    
    
}
