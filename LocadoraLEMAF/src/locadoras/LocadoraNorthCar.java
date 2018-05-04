
package locadoras;

import automovel.Carro;
import automovel.CarroSUVs;
import java.util.ArrayList;


public class LocadoraNorthCar extends Locadora{

    private ArrayList<CarroSUVs> carrosNormais;
    private ArrayList<CarroSUVs> carrosPremium;

    public LocadoraNorthCar(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, 
            double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
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

    public ArrayList<CarroSUVs> getCarrosNormais() {
        return carrosNormais;
    }

    public void setCarrosNormais(ArrayList<CarroSUVs> carrosNormais) {
        this.carrosNormais = carrosNormais;
    }

    public ArrayList<CarroSUVs> getCarrosPremium() {
        return carrosPremium;
    }

    public void setCarrosPremium(ArrayList<CarroSUVs> carrosPremium) {
        this.carrosPremium = carrosPremium;
    }
    
    
    
}
