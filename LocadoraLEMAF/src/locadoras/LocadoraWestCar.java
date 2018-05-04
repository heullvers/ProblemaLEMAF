
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
    public void taxarMeioDeSemanaRegular(Carro c) {
        
        CarroEsportivo ce = (CarroEsportivo)c;
        ce.setValorAluguelTotal(taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaRegular(Carro c) {
        CarroEsportivo ce = (CarroEsportivo)c;
        ce.setValorAluguelTotal(taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * c.getTaxa()));
    }
    
    @Override
    public void taxarMeioDeSemanaFidelidade(Carro c) {
        CarroEsportivo ce = (CarroEsportivo)c;
        ce.setValorAluguelTotal(taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaFidelidade(Carro c) {
        CarroEsportivo ce = (CarroEsportivo)c;
        ce.setValorAluguelTotal(taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * c.getTaxa()));  
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
