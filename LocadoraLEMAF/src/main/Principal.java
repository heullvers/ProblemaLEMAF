
package main;

import arquivo.Leitor;
import automovel.Carro;
import automovel.CarroCompacto;
import automovel.CarroEsportivo;
import automovel.CarroSUVs;
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
    
        /*
        //CARROS WESTCAR
        CarroEsportivo ce = new CarroEsportivo("Esportivo", 2, 0.1);
        CarroEsportivo ce2 = new CarroEsportivo("Esportivo2", 1, 0.2);
        CarroEsportivo ce3 = new CarroEsportivo("Esportivo3", 2, 0.15);
        CarroEsportivo ce4 = new CarroEsportivo("Esportivo4", 1, 0.16);
        CarroEsportivo ce5 = new CarroEsportivo("Esportivo5", 2, 0.14);

        //CADASTRO CARROS PREMIUM WESTCAR
        ld.cadastrarCarroPremiumWestCar(ce);
        ld.cadastrarCarroPremiumWestCar(ce2);
        ld.cadastrarCarroPremiumWestCar(ce3);
        ld.cadastrarCarroPremiumWestCar(ce4);
        ld.cadastrarCarroPremiumWestCar(ce5);

        //CADASTRO CARROS NORMAIS WESTCAR
        ld.cadastrarCarroNormalWestCar(ce);
        ld.cadastrarCarroNormalWestCar(ce2);
        ld.cadastrarCarroNormalWestCar(ce3);
        ld.cadastrarCarroNormalWestCar(ce4);
        ld.cadastrarCarroNormalWestCar(ce5);
        */
        

        /*
        //CARROS SOUTHCAR
        CarroCompacto cc = new CarroCompacto("Compacto", 3, 0.1);
        CarroCompacto cc2 = new CarroCompacto("Compacto2", 3, 0.2);
        CarroCompacto cc3 = new CarroCompacto("Compacto3", 3, 0.15);
        CarroCompacto cc4 = new CarroCompacto("Compacto4", 4, 0.16);
        CarroCompacto cc5 = new CarroCompacto("Compacto5", 4, 0.14);
        
        //CADASTRO CARROS NORMAIS SOUTHCAR
        ld.cadastrarCarroNormalSouthCar(cc);
        ld.cadastrarCarroNormalSouthCar(cc2);
        ld.cadastrarCarroNormalSouthCar(cc3);
        ld.cadastrarCarroNormalSouthCar(cc4);
        ld.cadastrarCarroNormalSouthCar(cc5);
        
        //CADASTRO CARROS PREMIUM SOUTHCAR
        ld.cadastrarCarroPremiumSouthCar(cc);
        ld.cadastrarCarroPremiumSouthCar(cc2);
        ld.cadastrarCarroPremiumSouthCar(cc3);
        ld.cadastrarCarroPremiumSouthCar(cc4);
        ld.cadastrarCarroPremiumSouthCar(cc5);
        */
        
        /*
        //CARROS NORTHCAR
        CarroSUVs cs = new CarroSUVs("SUV", 5, 0.1);
        CarroSUVs cs2 = new CarroSUVs("SUV", 6, 0.2);
        CarroSUVs cs3 = new CarroSUVs("SUV", 7, 0.15);
        CarroSUVs cs4 = new CarroSUVs("SUV", 5, 0.16);
        CarroSUVs cs5 = new CarroSUVs("SUV", 7, 0.14);
        
        //CADASTRO CARROS NORMAIS NORTHCAR
        ld.cadastrarCarroNormalNorthChar(cs);
        ld.cadastrarCarroNormalNorthCar(cs2);
        ld.cadastrarCarroNormalNorthCar(cs3);
        ld.cadastrarCarroNormalNorthCar(cs4);
        ld.cadastrarCarroNormalNorthCar(cs5);
        
        //CADASTRO CARROS PREMIUM NORTHCAR
        ld.cadastrarCarroPremiumNorthCar(cs);
        ld.cadastrarCarroPremiumNorthCar(cs2);
        ld.cadastrarCarroPremiumNorthCar(cs3);
        ld.cadastrarCarroPremiumNorthCar(cs4);
        ld.cadastrarCarroPremiumNorthCar(cs5);

        */
        
        //dados do arquivo
        /*
        String tipo = "premium";
        int qntPassageiros = 5;
        int diasUteis = 3;
        int diasFDS = 1;
        
        ld.escolherOpcao(tipo, qntPassageiros, diasUteis, diasFDS);
        */
        
        //Tipo do carro - NORMAL OU PREMIUM
        //Quantidade de passageiros
        //Datas
        Leitor l = new Leitor();
        l.lerArquivo();
        
        
    }
    
}
