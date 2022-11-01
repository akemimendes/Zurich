package supporte;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerenciaLogar extends Variaveis {
    public GerenciaLogar(WebDriver navegador) {
        super(navegador);
    }
    public static PrintWriter CriarArquivoLogar() throws IOException {
        FileWriter arq = new FileWriter("/home/robertinho/sompo_rd/status/logar.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.flush();
        gravarArq.close();
        return gravarArq;
    }
    public static boolean VerificaLogar(){
        boolean existelogar;
        File file = new File("/home/robertinho/sompo_rd/status/logar.txt");
        if(file.exists() && file.isFile()){
            return existelogar=true;
        }
        else
        {
            return existelogar=false;
        }
    }

    public static File DeletarArquivoLogar(){
        File deletararqlogar = new File("/home/robertinho/sompo_rd/status/logar.txt");
        if(deletararqlogar.exists() && deletararqlogar.isFile()) {
            deletararqlogar.delete();
        }
        return deletararqlogar;
    }

    public static boolean VerificaErro(){
        boolean existelogar;
        File file = new File("/home/robertinho/sompo_rd/status/erro.txt");
        if(file.exists() && file.isFile()){
            return existelogar=true;
        }
        else
        {
            return existelogar=false;
        }
    }

    public static File DeletarArquivoErro(){
        File deletararqlogar = new File("/home/robertinho/sompo_rd/status/erro.txt");
        if(deletararqlogar.exists() && deletararqlogar.isFile()) {
            deletararqlogar.delete();
        }
        return deletararqlogar;
    }

    public static File DeletarNrcotacao(){
        File deletararqlogar = new File("/home/robertinho/sompo_rd/cotacao/nrcotacao.txt");
        if(deletararqlogar.exists() && deletararqlogar.isFile()) {
            deletararqlogar.delete();
        }
        return deletararqlogar;
    }
}
