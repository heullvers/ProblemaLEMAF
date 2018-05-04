
package main;

import automovel.Carro;
import automovel.CarroCompacto;
import automovel.CarroEsportivo;
import dao.LocadoraDAO;
import java.util.ArrayList;
import locadoras.LocadoraNorthCar;
import locadoras.LocadoraSouthCar;
import locadoras.LocadoraWestCar;


public class Principal {
    
    public static void main(String[] args) {
        
        LocadoraSouthCar lsc = new LocadoraSouthCar(1.1, 2.2, 3.3, 4.4);
        LocadoraWestCar lwc = new LocadoraWestCar(5.5, 6.6, 7.7, 8.8);
        LocadoraNorthCar lnc = new LocadoraNorthCar(9.9, 10.1, 11.1, 12.1);
        
        LocadoraDAO ld = new LocadoraDAO(lsc, lwc, lnc);
        
        CarroCompacto cc = new CarroCompacto("Ferrari", 2, 0.1);
        CarroCompacto cc2 = new CarroCompacto("Molinete", 3, 0.2);
        
        ld.cadastrarCarroNormalSouthCar(cc);
        ld.cadastrarCarroNormalSouthCar(cc2);
        lsc.exibirCarrosNormais();
        
    }
    
}
