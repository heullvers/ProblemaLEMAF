
package main;

import automovel.Carro;
import automovel.CarroCompacto;
import automovel.CarroEsportivo;
import java.util.ArrayList;
import locadoras.LocadoraNorthCar;


public class Principal {
    
    public static void main(String[] args) {
        
        //Arrays da locadora SouthCar
        ArrayList<CarroCompacto> scn = new ArrayList<>(); // carros normais
        ArrayList<CarroCompacto> scp = new ArrayList<>(); // carros premium
        
        //Array da locadora WestCar
        ArrayList<CarroEsportivo> wcn = new ArrayList<>(); // carros normais
        ArrayList<CarroEsportivo> wcp = new ArrayList<>(); //
        
        //LocadoraNorthCar nc = new LocadoraNorthCar(carrosNormais, carrosPremium, 0, 0, 0, 0)
        
        
        Carro c1 = new CarroCompacto("Modelo 1", 2);
        
    }
    
}
