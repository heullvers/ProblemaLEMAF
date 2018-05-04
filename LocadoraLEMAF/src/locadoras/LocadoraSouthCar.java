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
    public void taxarMeioDeSemanaRegular(Carro c) {
        
        CarroCompacto cc = (CarroCompacto)c;
        cc.setValorAluguelTotal(taxaMeioDeSemanaRegular + (taxaMeioDeSemanaRegular * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaRegular(Carro c) {
        CarroCompacto cc = (CarroCompacto)c;
        cc.setValorAluguelTotal(taxaFimDeSemanaRegular + (taxaFimDeSemanaRegular * c.getTaxa()));
    }
    
    @Override
    public void taxarMeioDeSemanaFidelidade(Carro c) {
        CarroCompacto cc = (CarroCompacto)c;
        cc.setValorAluguelTotal(taxaMeioDeSemanaFidelidade + (taxaMeioDeSemanaFidelidade * c.getTaxa()));
    }

    @Override
    public void taxarFimDeSemanaFidelidade(Carro c) {
        CarroCompacto cc = (CarroCompacto)c;
        cc.setValorAluguelTotal(taxaFimDeSemanaFidelidade + (taxaFimDeSemanaFidelidade * c.getTaxa()));  
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
            
            System.out.println(cn.getModelo());
            
        }
    
    }


   
    
}
