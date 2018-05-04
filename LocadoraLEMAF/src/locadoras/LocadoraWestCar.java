
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
    public double taxarMeioDeSemanaRegular(Carro c) {
        
        CarroEsportivo ce = (CarroEsportivo)c;
        double valorAluguel = taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * ce.getTaxa());
        return valorAluguel;
    }

    @Override
    public double taxarFimDeSemanaRegular(Carro c) {
        CarroEsportivo ce = (CarroEsportivo)c;
        double valorAluguel = taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * ce.getTaxa());
        return valorAluguel;
    }
    
    @Override
    public double taxarMeioDeSemanaFidelidade(Carro c) {
        CarroEsportivo ce = (CarroEsportivo)c;
        double valorAluguel =  taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * ce.getTaxa());
        return valorAluguel;
    }

    @Override
    public double taxarFimDeSemanaFidelidade(Carro c) {
        CarroEsportivo ce = (CarroEsportivo)c;
        double valorAluguel = taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * ce.getTaxa());  
        return valorAluguel;
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
    
    public void exibirCarrosNormais(){
        
        for (CarroEsportivo cn : carrosNormais) {
            
            System.out.println("Modelo:" + cn.getModelo() + ", " + cn.getValorAluguelTotal());
            
        }
    
    }

    @Override
    public void exibirCarrosPremium() {
        
        for (CarroEsportivo cn : carrosPremium) {
            
            System.out.println("Modelo:" + cn.getModelo() + ", " + cn.getValorAluguelTotal());
            
        }
        
    }
    
}
