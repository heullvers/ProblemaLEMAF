/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoras;


import automovel.Carro;
import automovel.CarroCompacto;
import java.util.ArrayList;


public class LocadoraSouthCar extends Locadora{
    
    private ArrayList<CarroCompacto> carrosNormais;
    private ArrayList<CarroCompacto> carrosPremium;

    public LocadoraSouthCar(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, 
            double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
        super(taxaMeioDeSemanaRegular, taxaFimDeSemanaRegular, taxaMeioDeSemanaFidelidade, taxaFimDeSemanaFidelidade);
        carrosNormais = new ArrayList<>();
        carrosPremium = new ArrayList<>();
    }

    @Override
    public double taxarMeioDeSemanaRegular(Carro c) {
        
        CarroCompacto cc = (CarroCompacto)c;
        double valorAluguel = taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * cc.getTaxa());
        return valorAluguel;
    }

    @Override
    public double taxarFimDeSemanaRegular(Carro c) {
        CarroCompacto cc = (CarroCompacto)c;
        double valorAluguel = taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * cc.getTaxa());
        return valorAluguel;
    }
    
    @Override
    public double taxarMeioDeSemanaFidelidade(Carro c) {
        CarroCompacto cc = (CarroCompacto)c;
        double valorAluguel =  taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * cc.getTaxa());
        return valorAluguel;
    }

    @Override
    public double taxarFimDeSemanaFidelidade(Carro c) {
        CarroCompacto cc = (CarroCompacto)c;
        double valorAluguel = taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * cc.getTaxa());  
        return valorAluguel;
    }

    public ArrayList<CarroCompacto> getCarrosNormais() {
        return carrosNormais;
    }

    public ArrayList<CarroCompacto> getCarrosPremium() {
        return carrosPremium;
    }

    public void setCarrosNormais(ArrayList<CarroCompacto> carrosNormais) {
        this.carrosNormais = carrosNormais;
    }

    public void setCarrosPremium(ArrayList<CarroCompacto> carrosPremium) {
        this.carrosPremium = carrosPremium;
    }
    
    public void exibirCarrosNormais(){
        
        for (CarroCompacto cn : carrosNormais) {
            
            System.out.println("Modelo:" + cn.getModelo());
            
        }
    
    }

    @Override
    public void exibirCarrosPremium() {
        
        for (CarroCompacto cn : carrosPremium) {
            
            System.out.println("Modelo:" + cn.getModelo());
            
        }
        
    }
    
    


   
    
}
