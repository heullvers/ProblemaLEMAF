
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
    
    //Tipo do carro - NORMAL OU PREMIUM (string)
    //Quantidade de passageiros (int)
    //Datas
    
    public void escolherOpcao(String tipo, int qntPassageiros, int diasUteis, int diasFDS){
        
        if (qntPassageiros <= 2) {
            //Esportivo
            if (tipo.equalsIgnoreCase("normal")) {
                double soma = 0;
                double menorSemFidelidade = Integer.MAX_VALUE;
                double menorComFidelidade = Integer.MAX_VALUE;
                CarroEsportivo carroMenorCustoSemFidelidade = new CarroEsportivo();
                CarroEsportivo carroMenorCustoComFidelidade = new CarroEsportivo();
                
                //sem fidelidade
                for (CarroEsportivo ce: lwc.getCarrosNormais()) {
                    
                    for (int i = 0; i < diasUteis; i++) {
                        soma += lwc.taxarMeioDeSemanaRegular(ce);
                    }
                    for (int i = 0; i < diasFDS; i++) {
                        soma += lwc.taxarFimDeSemanaRegular(ce);
                    }
                    System.out.println(ce.getModelo() + " " + soma);
                    if (soma < menorSemFidelidade) {
                        menorSemFidelidade = soma;
                        carroMenorCustoSemFidelidade = ce;
                    }
                    soma = 0;   
                }
                
                //com fidelidade

                for (CarroEsportivo ce: lwc.getCarrosNormais()) {
                    
                    for (int i = 0; i < diasUteis; i++) {
                        soma += lwc.taxarMeioDeSemanaFidelidade(ce);
                    }
                    for (int i = 0; i < diasFDS; i++) {
                        soma += lwc.taxarFimDeSemanaFidelidade(ce);
                    }
                    if (soma < menorComFidelidade) {
                        menorComFidelidade = soma;
                        carroMenorCustoComFidelidade = ce;
                   
                    }
                    soma = 0;
                }
                
                System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+" Preço regular:" + menorSemFidelidade);
                System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+" Preço com fidelidade:" + menorComFidelidade);
   
            }
            else{
            
            }
        }
        else
            if(qntPassageiros <= 4){
            //Compactos
                if (tipo.equalsIgnoreCase("normal")) {

                }
                else{

                }
            }
            else 
                if(qntPassageiros <= 7){
                 //SUVs
                    if (tipo.equalsIgnoreCase("normal")) {

                     }
                    else{

                    }
                }
        else{
             //Não há automóveis disponíveis com mais de 7 lugares
        
        }
    
    }
}
