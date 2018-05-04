
package arquivo;

import java.io.FileOutputStream;
import java.io.PrintWriter;


public class Escritor {
    
    public void escreverArquivo(String[] vetor){
    
        try {
            
            FileOutputStream arquivo = new FileOutputStream("arquivodesaida.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(vetor[0]);
            pr.println(vetor[1]);
            pr.println(vetor[2]);
            pr.println(vetor[3]);
       
            pr.close();
            arquivo.close();
            
        } catch (Exception e) {
            
            System.err.println("Erro ao escrever no arquivo");
        }
    
    }
    
}
