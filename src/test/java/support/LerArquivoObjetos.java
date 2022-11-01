package supporte;

import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoObjetos extends Variaveis {
    private List<Variaveis> listaPessoa;
    private String nrlinha;

    public LerArquivoObjetos(WebDriver navegador) {
        super(navegador);
    }

    public List<Variaveis> lerArquivoNr(String nrlinha) throws IOException {
        this.nrlinha = nrlinha;
        Variaveis v = new Variaveis(navegador);

        File file = new File("/home/robertinho/sompo_rd/arquivos/" + nrlinha);
        System.out.println(file);
        if (file.exists()) {
            Scanner ler = new Scanner("/home/robertinho/sompo_rd/arquivos/" + nrlinha);
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            listaPessoa = new ArrayList<Variaveis>();
            v.setCpf(lerArq.readLine());
            v.setNome(lerArq.readLine());
            v.setTipores(lerArq.readLine());
            v.setTipocons(lerArq.readLine());
            v.setUso(lerArq.readLine());
            v.setCep(lerArq.readLine());
            v.setTiposeguro(lerArq.readLine());
            v.setComissao(lerArq.readLine());
            v.setAss24(lerArq.readLine());
            lerArq.readLine();
            v.setIncendio(lerArq.readLine());
            lerArq.readLine();
            v.setRc(lerArq.readLine());
            lerArq.readLine();
            v.setDmorais(lerArq.readLine());
            lerArq.readLine();
            v.setDeletricos(lerArq.readLine());
            lerArq.readLine();
            v.setEquipbaixa(lerArq.readLine());
            lerArq.readLine();
            v.setImpacto(lerArq.readLine());
            lerArq.readLine();
            v.setAluguel(lerArq.readLine());
            lerArq.readLine();
            v.setVidros(lerArq.readLine());
            lerArq.readLine();
            v.setRoubo(lerArq.readLine());
            lerArq.readLine();
            v.setVazamento(lerArq.readLine());
            lerArq.readLine();
            v.setVendaval(lerArq.readLine());
            lerArq.readLine();
            v.setDesmoronamento(lerArq.readLine());
            lerArq.readLine();
            v.setTumulto(lerArq.readLine());
            lerArq.readLine();
            v.setDocumentos(lerArq.readLine());
            lerArq.readLine();
            v.setRccond(lerArq.readLine());
            lerArq.readLine();
            v.setPortoes(lerArq.readLine());
            lerArq.readLine();
            v.setAlagamento(lerArq.readLine());
            lerArq.readLine();
            v.setRcgrg(lerArq.readLine());
            lerArq.readLine();
            v.setVida(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            v.setSompoatvd(lerArq.readLine());
            lerArq.readLine();
            v.setElevador(lerArq.readLine());
            lerArq.readLine();
            v.setDespesas(lerArq.readLine());
            lerArq.readLine();
            v.setRcempregad(lerArq.readLine());
            lerArq.readLine();
            v.setEquiport(lerArq.readLine());
            lerArq.readLine();
            v.setLuminosos(lerArq.readLine());
            lerArq.readLine();
            v.setSprinklers(lerArq.readLine());
            lerArq.readLine();
            v.setDemolicao(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            v.setDespesasnovolocal(lerArq.readLine());
            lerArq.readLine();
            v.setDeterioracao(lerArq.readLine());
            lerArq.readLine();
            v.setEquipestacionario(lerArq.readLine());
            lerArq.readLine();
            v.setSinistro(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            v.setRcpatios(lerArq.readLine());
            lerArq.readLine();
            v.setRoubohosp(lerArq.readLine());
            v.setCongenere(lerArq.readLine());
            v.setBonus(lerArq.readLine());
            lerArq.readLine();
            v.setValornovo(lerArq.readLine());
            lerArq.readLine();
            v.setIncendioco(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
          
            v.setValorint(lerArq.readLine());
            lerArq.readLine();
            v.setElevador(lerArq.readLine());
            lerArq.readLine();
            v.setIdade(lerArq.readLine());
            lerArq.readLine();
            v.setAndar(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            v.setRoubohosp(lerArq.readLine());
            lerArq.readLine();
            v.setFusao(lerArq.readLine());
            lerArq.readLine();
            v.setTremor(lerArq.readLine());
            lerArq.readLine();
            v.setMovimentacaao(lerArq.readLine());
        }

        listaPessoa.add(v);

        return listaPessoa;

    }
}
