
package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Leitor {
    
    private Search procura;
    private String tipo;
    private int qntPassageiros;
    private int diasUteis;
    private int diasFDS;

    public Leitor() {
        procura = new Search();
        tipo = "";
        qntPassageiros = 0;
        diasUteis = 0;
        diasFDS = 0;
    }
    
    
    public void lerArquivo(){
    
        try {
            
            FileInputStream arquivo = new FileInputStream("/home/heuller/Documentos/LEMAF/ProblemaLEMAF/Arquivos/arquivodeentrada.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            String palavras[] = null;
            do {                
                linha = br.readLine();
                if (linha != null) {
                    
                    palavras = linha.split(":");
                    //System.out.println("Novinha linha-----");
                    for (int i = 0; i < palavras.length; i++) {
                        //System.out.println("Palavra lida = " + palavras[i]);
                    }
                }
                
            } while (linha != null);
            
            tipo = palavras[0];
            qntPassageiros = Integer.parseInt(palavras[1]);
            procura.buscarPalavra(palavras[2]);
            diasUteis = procura.getDiasUteis();
            diasFDS = procura.getDiasFDS();            
            arquivo.close();
        } catch (Exception e) {
            
            System.out.println("Erro ao ler arquivo");
        }
    
    }

    public int getDiasUteis() {
        return diasUteis;
    }

    public int getDiasFDS() {
        return diasFDS;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }
    
    
    
    
}
