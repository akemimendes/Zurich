package supporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class web {



    public static WebDriver createChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/robertinho/drivers/chromedriver");
        WebDriver navegador=null;
        try {
             navegador = new ChromeDriver();
        }catch (Exception e){

        }
        navegador.get("https://espacoparceiros.zurich.com.br/");
        Thread.sleep(500);
        navegador.manage().window().maximize();
        return navegador;
    }

}
