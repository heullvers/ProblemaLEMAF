
package locadoras;

import automovel.Carro;
import java.util.ArrayList;


public abstract class Locadora {
    
    private double taxaMeioDeSemanaRegular;
    private double taxaFimDeSemanaRegular;
    private double taxaMeioDeSemanaFidelidade;
    private double taxaFimDeSemanaFidelidade;
    
    public abstract void taxarMeioDeSemana();
    public abstract void taxarFimDeSemana();

    public Locadora(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
        this.taxaMeioDeSemanaRegular = taxaMeioDeSemanaRegular;
        this.taxaFimDeSemanaRegular = taxaFimDeSemanaRegular;
        this.taxaMeioDeSemanaFidelidade = taxaMeioDeSemanaFidelidade;
        this.taxaFimDeSemanaFidelidade = taxaFimDeSemanaFidelidade;
    }
    
    



    
    
    
}
