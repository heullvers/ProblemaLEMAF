
package dao;

import arquivo.Leitor;
import automovel.CarroCompacto;
import automovel.CarroEsportivo;
import automovel.CarroSUVs;
import java.util.ArrayList;
import locadoras.LocadoraNorthCar;
import locadoras.LocadoraSouthCar;
import locadoras.LocadoraWestCar;


public final class LocadoraDAO {
    
    private Leitor leitura;

    public LocadoraDAO(LocadoraSouthCar lsc, LocadoraWestCar lwc, LocadoraNorthCar lnc) {
        this.lsc = lsc;
        this.lwc = lwc;
        this.lnc = lnc;
        leitura = new Leitor();
        
        //CARROS INSERIDOS NO SISTEMA
        
        //CARROS NORMAIS DA SOUTHCAR
        CarroCompacto cc = new CarroCompacto("Compacto", 3, 0.19);
        CarroCompacto cc2 = new CarroCompacto("Compacto 2", 3, 0.2);
        CarroCompacto cc3 = new CarroCompacto("Compacto 3", 3, 0.16);
        CarroCompacto cc4 = new CarroCompacto("Compacto 4", 4, 0.13);
        CarroCompacto cc5 = new CarroCompacto("Compacto 5", 4, 0.14);
        
        cadastrarCarroNormalSouthCar(cc);
        cadastrarCarroNormalSouthCar(cc2);
        cadastrarCarroNormalSouthCar(cc3);
        cadastrarCarroNormalSouthCar(cc4);
        cadastrarCarroNormalSouthCar(cc5);
        
        //CARROS PREMIUM DA SOUTHCAR
        CarroCompacto cc6 = new CarroCompacto("Compacto 6", 3, 0.32);
        CarroCompacto cc7 = new CarroCompacto("Compacto 7", 3, 0.28);
        CarroCompacto cc8 = new CarroCompacto("Compacto 8", 3, 0.35);
        CarroCompacto cc9 = new CarroCompacto("Compacto 9", 4, 0.5);
        CarroCompacto cc10 = new CarroCompacto("Compacto 10", 4, 0.29);
        
        cadastrarCarroPremiumSouthCar(cc6);
        cadastrarCarroPremiumSouthCar(cc7);
        cadastrarCarroPremiumSouthCar(cc8);
        cadastrarCarroPremiumSouthCar(cc9);
        cadastrarCarroPremiumSouthCar(cc10);
        
        //CARROS NORMAIS DA WESTCAR
        CarroEsportivo ce = new CarroEsportivo("Esportivo", 2, 0.18);
        CarroEsportivo ce2 = new CarroEsportivo("Esportivo 2", 1, 0.15);
        CarroEsportivo ce3 = new CarroEsportivo("Esportivo 3", 2, 0.17);
        CarroEsportivo ce4 = new CarroEsportivo("Esportivo 4", 1, 0.13);
        CarroEsportivo ce5 = new CarroEsportivo("Esportivo 5", 2, 0.19);
        
        cadastrarCarroNormalWestCar(ce);
        cadastrarCarroNormalWestCar(ce2);
        cadastrarCarroNormalWestCar(ce3);
        cadastrarCarroNormalWestCar(ce4);
        cadastrarCarroNormalWestCar(ce5);
        
        //CARROS PREMIUM DA WESTCAR
        CarroEsportivo ce6 = new CarroEsportivo("Esportivo 6", 2, 0.32);
        CarroEsportivo ce7 = new CarroEsportivo("Esportivo 7", 1, 0.4);
        CarroEsportivo ce8 = new CarroEsportivo("Esportivo 8", 2, 0.31);
        CarroEsportivo ce9 = new CarroEsportivo("Esportivo 9", 1, 0.52);
        CarroEsportivo ce10 = new CarroEsportivo("Esportivo 10", 2, 0.35);
        
        cadastrarCarroPremiumWestCar(ce6);
        cadastrarCarroPremiumWestCar(ce7);
        cadastrarCarroPremiumWestCar(ce8);
        cadastrarCarroPremiumWestCar(ce9);
        cadastrarCarroPremiumWestCar(ce10);
        
        //CARROS NORMAIS DA NORTHCAR
        CarroSUVs cs = new CarroSUVs("SUV", 5, 0.12);
        CarroSUVs cs2 = new CarroSUVs("SUV 2", 6, 0.09);
        CarroSUVs cs3 = new CarroSUVs("SUV 3", 7, 0.07);
        CarroSUVs cs4 = new CarroSUVs("SUV 4", 5, 0.06);
        CarroSUVs cs5 = new CarroSUVs("SUV 5", 7, 0.02);
        
        cadastrarCarroNormalNorthCar(cs);
        cadastrarCarroNormalNorthCar(cs2);
        cadastrarCarroNormalNorthCar(cs3);
        cadastrarCarroNormalNorthCar(cs4);
        cadastrarCarroNormalNorthCar(cs5);
        

        //CARROS PREMIUM DA NORTHCAR
        CarroSUVs cs6 = new CarroSUVs("SUV 6", 5, 0.38);
        CarroSUVs cs7 = new CarroSUVs("SUV 7", 6, 0.7);
        CarroSUVs cs8 = new CarroSUVs("SUV 8", 7, 0.5);
        CarroSUVs cs9 = new CarroSUVs("SUV 9", 5, 0.35);
        CarroSUVs cs10 = new CarroSUVs("SUV 10", 7, 0.3);
        
        cadastrarCarroPremiumNorthCar(cs6);
        cadastrarCarroPremiumNorthCar(cs7);
        cadastrarCarroPremiumNorthCar(cs8);
        cadastrarCarroPremiumNorthCar(cs9);
        cadastrarCarroPremiumNorthCar(cs10);
        
    }

    private final LocadoraSouthCar lsc; 
    private final LocadoraWestCar lwc; 
    private final LocadoraNorthCar lnc; 
    
    
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
                System.out.println("NORMAL ESPORTIVO");
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
                
                System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+": WestCar");
                System.out.println("Preço regular:" + menorSemFidelidade);       
                System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+": WestCar");
                System.out.println("Preço com fidelidade:" + menorComFidelidade);
   
            }
            
            else
                if (tipo.equalsIgnoreCase("premium")) {
                    System.out.println("PREMIUM ESPORTIVO");
                    double soma = 0;
                    double menorSemFidelidade = Integer.MAX_VALUE;
                    double menorComFidelidade = Integer.MAX_VALUE;
                    CarroEsportivo carroMenorCustoSemFidelidade = new CarroEsportivo();
                    CarroEsportivo carroMenorCustoComFidelidade = new CarroEsportivo();

                    //sem fidelidade
                    for (CarroEsportivo ce: lwc.getCarrosPremium()) {

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

                    for (CarroEsportivo ce: lwc.getCarrosPremium()) {

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

                    System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+": WestCar");
                    System.out.println("Preço regular:" + menorSemFidelidade);       
                    System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+": WestCar");
                    System.out.println("Preço com fidelidade:" + menorComFidelidade);      
            }
            else{
                
                    System.out.println("Tipo de carro não encontrado");
                
            }
        }
        else
            if(qntPassageiros <= 4){
                
            //Compactos
                if (tipo.equalsIgnoreCase("normal")) {
                    System.out.println("NORMAL COMPACTO");
                    double soma = 0;
                    double menorSemFidelidade = Integer.MAX_VALUE;
                    double menorComFidelidade = Integer.MAX_VALUE;
                    CarroCompacto carroMenorCustoSemFidelidade = new CarroCompacto();
                    CarroCompacto carroMenorCustoComFidelidade = new CarroCompacto();

                    //sem fidelidade
                    for (CarroCompacto ce: lsc.getCarrosNormais()) {

                        for (int i = 0; i < diasUteis; i++) {
                            soma += lsc.taxarMeioDeSemanaRegular(ce);
                        }
                        for (int i = 0; i < diasFDS; i++) {
                            soma += lsc.taxarFimDeSemanaRegular(ce);
                        }
                        System.out.println(ce.getModelo() + " " + soma);
                        if (soma < menorSemFidelidade) {
                            menorSemFidelidade = soma;
                            carroMenorCustoSemFidelidade = ce;
                        }
                        soma = 0;   
                    }

                    //com fidelidade

                    for (CarroCompacto ce: lsc.getCarrosNormais()) {

                        for (int i = 0; i < diasUteis; i++) {
                            soma += lsc.taxarMeioDeSemanaFidelidade(ce);
                        }
                        for (int i = 0; i < diasFDS; i++) {
                            soma += lsc.taxarFimDeSemanaFidelidade(ce);
                        }
                        if (soma < menorComFidelidade) {
                            menorComFidelidade = soma;
                            carroMenorCustoComFidelidade = ce;

                        }
                        soma = 0;
                    }

                    System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+": SouthCar");
                            System.out.println("Preço regular:" + menorSemFidelidade);       
                            System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+": SoutthCar");
                            System.out.println("Preço com fidelidade:" + menorComFidelidade);
                    
                }
                else
                    if (tipo.equalsIgnoreCase("premium")) {
                        System.out.println("PREMIUM COMPACTO");
                        double soma = 0;
                        double menorSemFidelidade = Integer.MAX_VALUE;
                        double menorComFidelidade = Integer.MAX_VALUE;
                        CarroCompacto carroMenorCustoSemFidelidade = new CarroCompacto();
                        CarroCompacto carroMenorCustoComFidelidade = new CarroCompacto();

                        //sem fidelidade
                        for (CarroCompacto ce: lsc.getCarrosPremium()) {

                            for (int i = 0; i < diasUteis; i++) {
                                soma += lsc.taxarMeioDeSemanaRegular(ce);
                            }
                            for (int i = 0; i < diasFDS; i++) {
                                soma += lsc.taxarFimDeSemanaRegular(ce);
                            }
                            System.out.println(ce.getModelo() + " " + soma);
                            if (soma < menorSemFidelidade) {
                                menorSemFidelidade = soma;
                                carroMenorCustoSemFidelidade = ce;
                            }
                            soma = 0;   
                        }

                        //com fidelidade

                        for (CarroCompacto ce: lsc.getCarrosPremium()) {

                            for (int i = 0; i < diasUteis; i++) {
                                soma += lsc.taxarMeioDeSemanaFidelidade(ce);
                            }
                            for (int i = 0; i < diasFDS; i++) {
                                soma += lsc.taxarFimDeSemanaFidelidade(ce);
                            }
                            if (soma < menorComFidelidade) {
                                menorComFidelidade = soma;
                                carroMenorCustoComFidelidade = ce;

                            }
                            soma = 0;
                        }

                        System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+": SouthCar");
                            System.out.println("Preço regular:" + menorSemFidelidade);       
                            System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+": SouthCar");
                            System.out.println("Preço com fidelidade:" + menorComFidelidade);
                    }
                else{
                
                    System.out.println("Tipo de carro não encontrado");
                
                }
            }
            else 
                if(qntPassageiros <= 7){
                    
                 //SUVs
                    if (tipo.equalsIgnoreCase("normal")) {
                        System.out.println("NORMAL SUV");
                        double soma = 0;
                        double menorSemFidelidade = Integer.MAX_VALUE;
                        double menorComFidelidade = Integer.MAX_VALUE;
                        CarroSUVs carroMenorCustoSemFidelidade = new CarroSUVs();
                        CarroSUVs carroMenorCustoComFidelidade = new CarroSUVs();

                        //sem fidelidade
                        for (CarroSUVs ce: lnc.getCarrosNormais()) {

                            for (int i = 0; i < diasUteis; i++) {
                                soma += lnc.taxarMeioDeSemanaRegular(ce);
                            }
                            for (int i = 0; i < diasFDS; i++) {
                                soma += lnc.taxarFimDeSemanaRegular(ce);
                            }
                            System.out.println(ce.getModelo() + " " + soma);
                            if (soma < menorSemFidelidade) {
                                menorSemFidelidade = soma;
                                carroMenorCustoSemFidelidade = ce;
                            }
                            soma = 0;   
                        }

                        //com fidelidade

                        for (CarroSUVs ce: lnc.getCarrosNormais()) {

                            for (int i = 0; i < diasUteis; i++) {
                                soma += lnc.taxarMeioDeSemanaFidelidade(ce);
                            }
                            for (int i = 0; i < diasFDS; i++) {
                                soma += lnc.taxarFimDeSemanaFidelidade(ce);
                            }
                            if (soma < menorComFidelidade) {
                                menorComFidelidade = soma;
                                carroMenorCustoComFidelidade = ce;

                            }
                            soma = 0;
                        }

                        System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+": NorthCar");
                        System.out.println("Preço regular:" + menorSemFidelidade);       
                        System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+": NorthCar");
                        System.out.println("Preço com fidelidade:" + menorComFidelidade);
                     }
                    else
                        if (tipo.equalsIgnoreCase("premium")) {
                            System.out.println("PREMIUM SUV");
                            
                            double soma = 0;
                            double menorSemFidelidade = Integer.MAX_VALUE;
                            double menorComFidelidade = Integer.MAX_VALUE;
                            CarroSUVs carroMenorCustoSemFidelidade = new CarroSUVs();
                            CarroSUVs carroMenorCustoComFidelidade = new CarroSUVs();

                            //sem fidelidade
                            for (CarroSUVs ce: lnc.getCarrosPremium()) {

                                for (int i = 0; i < diasUteis; i++) {
                                    soma += lnc.taxarMeioDeSemanaRegular(ce);
                                }
                                for (int i = 0; i < diasFDS; i++) {
                                    soma += lnc.taxarFimDeSemanaRegular(ce);
                                }
                                System.out.println(ce.getModelo() + " " + soma);
                                if (soma < menorSemFidelidade) {
                                    menorSemFidelidade = soma;
                                    carroMenorCustoSemFidelidade = ce;
                                }
                                soma = 0;   
                            }

                            //com fidelidade

                            for (CarroSUVs ce: lnc.getCarrosPremium()) {

                                for (int i = 0; i < diasUteis; i++) {
                                    soma += lnc.taxarMeioDeSemanaFidelidade(ce);
                                }
                                for (int i = 0; i < diasFDS; i++) {
                                    soma += lnc.taxarFimDeSemanaFidelidade(ce);
                                }
                                if (soma < menorComFidelidade) {
                                    menorComFidelidade = soma;
                                    carroMenorCustoComFidelidade = ce;

                                }
                                soma = 0;
                            }

                            System.out.println("Carro:" + carroMenorCustoSemFidelidade.getModelo()+": NorthCar");
                            System.out.println("Preço regular:" + menorSemFidelidade);       
                            System.out.println("Carro:" + carroMenorCustoComFidelidade.getModelo()+": NorthCar");
                            System.out.println("Preço com fidelidade:" + menorComFidelidade);
                        }
                        else{
                        
                            System.out.println("Tipo de carro não encontrado");
                        }
            
                }
        else{
                
                    System.out.println("Quantidade de passageiros não permitida.");
            }
        }
}

