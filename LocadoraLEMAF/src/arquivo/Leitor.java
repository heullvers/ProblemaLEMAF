
package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Leitor {
    
    private Search procura;

    public Leitor() {
        procura = new Search();
    }
    
    
    public void lerArquivo(){
    
        try {
            
            FileInputStream arquivo = new FileInputStream("/home/heuller/Documentos/LEMAF/ProblemaLEMAF/LocadoraLEMAF/arquivo.txt");
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
            
            String tipo = palavras[0];
            int qntPassageiros = Integer.parseInt(palavras[1]);
            procura.buscarPalavra(palavras[2]);
            int diasUteis = procura.getDiasUteis();
            int diasFDS = procura.getDiasFDS();
            System.out.println("Dias Uteis: " + diasUteis);
            System.out.println("Dias FDS: " + diasFDS);
            
            
            arquivo.close();
        } catch (Exception e) {
            
            System.out.println("Erro ao ler arquivo");
        }
    
    }
    
}
