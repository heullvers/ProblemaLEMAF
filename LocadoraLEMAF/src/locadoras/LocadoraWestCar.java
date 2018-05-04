
package locadoras;

import automovel.Carro;
import automovel.CarroEsportivo;
import java.util.ArrayList;


public class LocadoraWestCar extends Locadora{

    private ArrayList<CarroEsportivo> carrosNormais;
    private ArrayList<CarroEsportivo> carrosPremium;

    public LocadoraWestCar(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
        super(taxaMeioDeSemanaRegular, taxaFimDeSemanaRegular, taxaMeioDeSemanaFidelidade, taxaFimDeSemanaFidelidade);
        carrosNormais = new ArrayList<>();
        carrosPremium = new ArrayList<>();
    }

    @Override
    public void taxarMeioDeSemana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void taxarFimDeSemana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public ArrayList<CarroEsportivo> getCarrosNormais() {
        return carrosNormais;
    }

    public void setCarrosNormais(ArrayList<CarroEsportivo> carrosNormais) {
        this.carrosNormais = carrosNormais;
    }

    public ArrayList<CarroEsportivo> getCarrosPremium() {
        return carrosPremium;
    }

    public void setCarrosPremium(ArrayList<CarroEsportivo> carrosPremium) {
        this.carrosPremium = carrosPremium;
    }
    
    
    
}
