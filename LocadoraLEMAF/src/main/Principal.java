
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
        
        LocadoraSouthCar lsc = new LocadoraSouthCar(210, 200, 150, 90);
        LocadoraWestCar lwc = new LocadoraWestCar(530, 200, 150, 90);
        LocadoraNorthCar lnc = new LocadoraNorthCar(630, 600, 580, 590);
        
        LocadoraDAO ld = new LocadoraDAO(lsc, lwc, lnc);
        
        CarroCompacto cc = new CarroCompacto("Ferrari", 2, 0.1);
        CarroCompacto cc2 = new CarroCompacto("Molinete", 3, 0.2);
        
        ld.cadastrarCarroNormalSouthCar(cc);
        //ld.cadastrarCarroNormalSouthCar(cc2);
        double resultado = lsc.taxarFimDeSemanaRegular(cc) + lsc.taxarFimDeSemanaRegular(cc);
        lsc.taxarFimDeSemanaRegular(cc);
        //lsc.taxarMeioDeSemanaFidelidade(cc2);
        //System.out.println(resultado);
        
    }
    
}
