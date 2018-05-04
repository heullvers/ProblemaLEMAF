
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
    public double taxarMeioDeSemanaRegular(Carro c) {
        
        CarroSUVs cs = (CarroSUVs)c;
        double valorAluguel = taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * cs.getTaxa());
        return valorAluguel;
    }

    @Override
    public double taxarFimDeSemanaRegular(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        double valorAluguel = taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * cs.getTaxa());
        return valorAluguel;
    }
    
    @Override
    public double taxarMeioDeSemanaFidelidade(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        double valorAluguel =  taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * cs.getTaxa());
        return valorAluguel;
    }

    @Override
    public double taxarFimDeSemanaFidelidade(Carro c) {
        CarroSUVs cs = (CarroSUVs)c;
        double valorAluguel = taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * cs.getTaxa());  
        return valorAluguel;  
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
            
            System.out.println("Modelo:" + cn.getModelo());
            
        }
    
    }

    @Override
    public void exibirCarrosPremium() {
        
        for (CarroSUVs cn : carrosPremium) {
            
            System.out.println("Modelo:" + cn.getModelo());
            
        }
        
    }
    
    
}
