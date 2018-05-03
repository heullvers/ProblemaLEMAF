
package locadoras;

import automovel.Carro;
import automovel.CarroEsportivo;
import java.util.ArrayList;


public class LocadoraWestCar extends Locadora{

    private ArrayList<CarroEsportivo> carrosNormais;
    private ArrayList<CarroEsportivo> carrosPremium;

    public LocadoraWestCar(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
        super(taxaMeioDeSemanaRegular, taxaFimDeSemanaRegular, taxaMeioDeSemanaFidelidade, taxaFimDeSemanaFidelidade);
    }

    @Override
    public void taxarMeioDeSemana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void taxarFimDeSemana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
