
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
        cs.setValorAluguelTotal(cs.getValorAluguelTotal() + taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaRegular(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(cs.getValorAluguelTotal() + taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * c.getTaxa()));
    }
    
    @Override
    public void taxarMeioDeSemanaFidelidade(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(cs.getValorAluguelTotal() + taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaFidelidade(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        cs.setValorAluguelTotal(cs.getValorAluguelTotal() + taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * c.getTaxa()));  
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
    
    public void exibirCarrosNormais(){
        
        for (CarroSUVs cn : carrosNormais) {
            
            System.out.println("Modelo:" + cn.getModelo() + ", " + cn.getValorAluguelTotal());
            
        }
    
    }

    @Override
    public void exibirCarrosPremium() {
        
        for (CarroSUVs cn : carrosPremium) {
            
            System.out.println("Modelo:" + cn.getModelo() + ", " + cn.getValorAluguelTotal());
            
        }
        
    }
    
    
}
