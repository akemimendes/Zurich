package supporte;

import java.io.File;

public class GerenciaNrCotacao {
    public static boolean VerificaCotacao(){
        boolean existenrcotacao;
        File file = new File("/home/robertinho/zurich_rd/cotacao/nrcotacao.txt");
        existenrcotacao = file.exists() || file.isFile();
        return  existenrcotacao;
    }

    public static boolean VerificaMatriz(){
        boolean existenrcotacao;
        File file = new File("/home/robertinho/zurich_rd/cotacao/matriz.txt");
        existenrcotacao = file.exists() || file.isFile();
        return  existenrcotacao;
    }
}
