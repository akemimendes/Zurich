package supporte;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Distribuir {
    private String nomevm;
    private static File pastaarquivos;
    private static File pastaapdf;
    private static File pastaprontos;
    private static File pastatxt;
    private static File pastaerro;
    private static File pastastatus;
    private static File pastacotacao;
    private static File pastaimage;
    private static PrintWriter gravarArq;
    private boolean existenrcotacao;

    public void distribuirArquivos() throws IOException {
        File destpastamae = new File("/home/robertinho/zurich_rd");
        destpastamae.mkdir();
        pastaarquivos = CriarPastas.criarPastaArquivos();
        pastaapdf = CriarPastas.criarPastaPdf();
        pastaprontos = CriarPastas.criarPastaProntos();
        pastatxt = CriarPastas.criarPastaTxt();
        pastaerro = CriarPastas.criarPastaErro();
        pastastatus = CriarPastas.criarPastaStatus();
        pastacotacao = CriarPastas.criarPastacotacao();
        pastaimage = CriarPastas.criarPastaimage();
        existenrcotacao = GerenciaNrCotacao.VerificaMatriz();
        if (!existenrcotacao) {
            System.out.println("vou pegar o link de distribuir");
            //diretorio de onde vai copiar a pasta mae
            //File sourcefreenaspastamae = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/Macro certa/selenium/outros/ferramentas");
           /* File sourcefreenaspastamae = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/rd/result/SOMPO/PRONTOS/mover");
            //diretorio de onde vai copiar a pasta na vm
            destpastamae = new File("/home/robertinho/ferramentas/mover");
            destpastamae.delete();
            destpastamae.mkdir();
            FileUtils.copyDirectory(sourcefreenaspastamae, destpastamae);*/
        }


        //cria arquivo com o nome da vm caso nao exista
        gravarArq = PegarNomeVm.CriarNomeVM();
        //ler o nome da vm
        nomevm = PegarNomeVm.NomeVm(nomevm);
        // caminho de onde ira pegar os arquivos
        File diretorio = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/rd/result/zurich/PRONTOS/distribuir/" + nomevm + "/");
        File destino = new File("/home/robertinho/zurich_rd/arquivos/");
//distribui os arquivos para a vm
        if (diretorio.exists()) {
            FileUtils.copyDirectory(diretorio, destino);
            FileUtils.deleteDirectory(diretorio);
        }
        if (!existenrcotacao) {
            File directoryresumo = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/rd/result/zurich/PRONTOS/cotacao/");
            File destresumo = new File("/home/robertinho/zurich_rd/cotacao/");
            destresumo.mkdir();
            FileUtils.copyDirectory(directoryresumo, destresumo);
            File directoryimage = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/rd/result/zurich/PRONTOS/image/");
            File destimage = new File("/home/robertinho/zurich_rd/image/");
            destimage.mkdir();
            FileUtils.copyDirectory(directoryimage, destimage);
        }
    }
}
