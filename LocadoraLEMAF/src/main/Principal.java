
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
        
        Leitor l = new Leitor();
        l.lerArquivo();
        String tipo = l.getTipo();
        int qntPassageiros = l.getQntPassageiros();
        int diasUteis = l.getDiasUteis();
        int diasFDS = l.getDiasFDS();
        
        ld.escolherOpcao(tipo, qntPassageiros, diasUteis, diasFDS);
        
        
    }
    
}
