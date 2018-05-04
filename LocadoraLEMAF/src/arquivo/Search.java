
package arquivo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Search {
    
    private int diasUteis;
    private int diasFDS;

    public Search() {
        diasUteis = 0;
        diasFDS = 0;
    }
    
    public void buscarPalavra(String linha){
 
        Search sr = new Search();
        linha = linha.replaceAll("[,.]", "");
        linha = linha.trim();
        String[] palavras = linha.split(" ");
        for (String palavra : palavras) {
            if (palavra.equals("(seg)") || palavra.equals("(ter)") || palavra.equals("(qua)") 
                    || palavra.equals("(qui)") || palavra.equals("(sex)")) {
                diasUteis += sr.countExpressao(linha, palavra);
            }
            if (palavra.equals("(sab)") || palavra.equals("(dom)")) {
                diasFDS += sr.countExpressao(linha, palavra);
            }
        }
    
    }
    
    private int countExpressao(String texto, String valor){
    
        int count = 0;
        if (texto != null) {
            Pattern pattern = Pattern.compile(valor);
            Matcher matcher = pattern.matcher(texto);
            while (matcher.find()) {                
                count++;
            }
        }
        return count;
    }

    public int getDiasUteis() {
        return diasUteis;
    }

    public int getDiasFDS() {
        return diasFDS;
    }
    
    
    
    
}
