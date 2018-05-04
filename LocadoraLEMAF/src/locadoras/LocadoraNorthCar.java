
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
    public void taxarMeioDeSemanaRegular(Carro c) {
        
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaRegular(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * c.getTaxa()));
    }
    
    @Override
    public void taxarMeioDeSemanaFidelidade(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaFidelidade(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * c.getTaxa()));  
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
