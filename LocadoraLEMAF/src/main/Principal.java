
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
        
        CarroEsportivo ce = new CarroEsportivo("Ferrari", 2, 0.1);
        CarroEsportivo ce2 = new CarroEsportivo("Molinete", 1, 0.2);
        CarroEsportivo ce3 = new CarroEsportivo("Tey Tey", 2, 0.15);
        CarroEsportivo ce4 = new CarroEsportivo("Pow Pow", 1, 0.16);
        CarroEsportivo ce5 = new CarroEsportivo("Repeation", 2, 0.14);
        
        ld.cadastrarCarroNormalWestCar(ce);
        ld.cadastrarCarroNormalWestCar(ce2);
        ld.cadastrarCarroNormalWestCar(ce3);
        ld.cadastrarCarroNormalWestCar(ce4);
        ld.cadastrarCarroNormalWestCar(ce5);
        
        //dados do arquivo
        String tipo = "normal";
        int qntPassageiros = 2;
        int diasUteis = 3;
        int diasFDS = 1;
        
        ld.escolherOpcao(tipo, qntPassageiros, diasUteis, diasFDS);
        
        
        //Tipo do carro - NORMAL OU PREMIUM
        //Quantidade de passageiros
        //Datas
        
        
    }
    
}
