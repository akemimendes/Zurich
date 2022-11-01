package supporte;

import java.io.File;

public class CriarPastas {
    public static File criarPastaArquivos(){
        File pastaarquivos = new File("/home/robertinho/zurich_rd/arquivos");
        pastaarquivos.mkdir();
        return pastaarquivos;
    }
    public static File criarPastaPdf(){
        File pastaapdf = new File("/home/robertinho/zurich_rd/pdf");
        pastaapdf.mkdir();
        return pastaapdf;
    }
    public static File criarPastaProntos(){
        File pastaprontos = new File("/home/robertinho/zurich_rd/prontos");
        pastaprontos.mkdir();
        return pastaprontos;
    }
    public static File criarPastaTxt(){
        File pastatxt = new File("/home/robertinho/zurich_rd/txt");
        pastatxt.mkdir();
        return pastatxt;
    }
    public static File criarPastaErro(){
        File pastaerro = new File("/home/robertinho/zurich_rd/erro");
        pastaerro.mkdir();
        return pastaerro;
    }
    public static File criarPastaStatus(){
        File pastaerro = new File("/home/robertinho/zurich_rd/status");
        pastaerro.mkdir();
        return pastaerro;
    }
    public static File criarPastacotacao(){
        File pastacotacao = new File("/home/robertinho/zurich_rd/cotacao");
        pastacotacao.mkdir();
        return pastacotacao;
    }
    public static File criarPastaimage(){
        File pastaimage = new File("/home/robertinho/zurich_rd/image");
        pastaimage.mkdir();
        return pastaimage;
    }
}
