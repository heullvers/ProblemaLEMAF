/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoras;


import automovel.CarroCompacto;
import java.util.ArrayList;


public class LocadoraSouthCar extends Locadora{
    
    private ArrayList<CarroCompacto> carrosNormais;
    private ArrayList<CarroCompacto> carrosPremium;

    public LocadoraSouthCar(double taxaMeioDeSemanaRegular, double taxaFimDeSemanaRegular, 
            double taxaMeioDeSemanaFidelidade, double taxaFimDeSemanaFidelidade) {
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
    
    
    


   
    
}
