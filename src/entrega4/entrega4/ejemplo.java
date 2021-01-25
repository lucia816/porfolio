package entrega4.entrega4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.Scanner;

public class ejemplo {
    public static void main (String[] args){

    Scanner teclado = new Scanner(System.in);

    String exePath = "C:\\Users\\HP\\Downloads\\geckodriver.exe";
    System.setProperty("webdriver.gecko.driver", exePath);

    WebDriver pagina1 = new FirefoxDriver();
    WebDriver pagina2 = new FirefoxDriver();

    pagina1.get("https://www.pccomponentes.com");
    pagina2.get("http://www.phonehouse.es");

    System.out.println("¿Que desea buscar?");
    String Busqueda = teclado.nextLine();

   try {
       WebElement ventanaCookies = pagina1.findElement(By.id("onetrust-banner-sdk"));
       if (ventanaCookies != null) {
           System.out.println("Detectado caja de cookies");
           ventanaCookies.click();
       }
       WebElement ventanasCookies = pagina2.findElement(By.xpath("/html/body/div[6]"));
       if (ventanaCookies != null) {
           System.out.println("Detectado caja de cookies");
           ventanaCookies.click();
       }

   }catch (Exception e) {
   }

    WebElement cajaBusqueda = pagina1.findElement(By.xpath("/html/body/header/div[3]/div[1]/div/div[2]/div/form/input"));
    cajaBusqueda.sendKeys(Busqueda);
    cajaBusqueda.submit();

    WebElement cajaBusqueda2 = pagina2.findElement(new By.ById("searcher"));
    cajaBusqueda2.sendKeys(Busqueda);
    cajaBusqueda2.submit();

   String resultados1 = pagina1.findElement(By.xpath("//*[@id=\"pcc-search-api--hits\"]/div[2]/ol")).getText();
    System.out.println(resultados1);

        System.out.println("--------------------------------");

    String resultados= pagina2.findElement(By.xpath("//*[@id=\"productsList1\"]")).getText();
    System.out.println(resultados);

    }

}
