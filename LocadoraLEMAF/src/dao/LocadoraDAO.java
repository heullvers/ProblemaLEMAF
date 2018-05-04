
package dao;

import automovel.CarroCompacto;
import automovel.CarroEsportivo;
import automovel.CarroSUVs;
import java.util.ArrayList;
import locadoras.LocadoraNorthCar;
import locadoras.LocadoraSouthCar;
import locadoras.LocadoraWestCar;


public class LocadoraDAO {

    public LocadoraDAO(LocadoraSouthCar lsc, LocadoraWestCar lwc, LocadoraNorthCar lnc) {
        this.lsc = lsc;
        this.lwc = lwc;
        this.lnc = lnc;
    }

    private LocadoraSouthCar lsc; 
    private LocadoraWestCar lwc; 
    private LocadoraNorthCar lnc; 
    
    public void cadastrarCarroNormalSouthCar(CarroCompacto cc){
        
        ArrayList<CarroCompacto> acc = new ArrayList<>();
        acc = lsc.getCarrosNormais();
        acc.add(cc);
        lsc.setCarrosNormais(acc);
    }
    
    public void cadastrarCarroPremiumSouthCar(CarroCompacto cc){
    
        ArrayList<CarroCompacto> acc = new ArrayList<>();
        acc = lsc.getCarrosPremium();
        acc.add(cc);
        lsc.setCarrosPremium(acc);
    }
    
    public void cadastrarCarroNormalWestCar(CarroEsportivo ce){
    
        ArrayList<CarroEsportivo> ace = new ArrayList<>();
        ace = lwc.getCarrosNormais();
        ace.add(ce);
        lwc.setCarrosNormais(ace);
        
    }
    
    public void cadastrarCarroPremiumWestCar(CarroEsportivo ce){
    
        ArrayList<CarroEsportivo> ace = new ArrayList<>();
        ace = lwc.getCarrosNormais();
        ace.add(ce);
        lwc.setCarrosPremium(ace);
    }
    
    public void cadastrarCarroNormalNorthCar(CarroSUVs cs){
    
        ArrayList<CarroSUVs> acs = new ArrayList<>();
        acs = lnc.getCarrosNormais();
        acs.add(cs);
        lnc.setCarrosNormais(acs);
    }
    
    public void cadastrarCarroPremiumNorthCar(CarroSUVs cs){
    
        ArrayList<CarroSUVs> acs = new ArrayList<>();
        acs = lnc.getCarrosPremium();
        acs.add(cs);
        lnc.setCarrosPremium(acs);
    }
    
}
