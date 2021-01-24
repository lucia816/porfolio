package entrega4.entrega4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class ejemplo {
    public static void main (String[] args){
try {
    Scanner teclado = new Scanner(System.in);

    String exePath = "C:\\Users\\HP\\Downloads\\geckodriver.exe";
    System.setProperty("webdriver.gecko.driver", exePath);

    WebDriver pagina1 = new FirefoxDriver();
    WebDriver pagina2 = new FirefoxDriver();

    pagina1.get("http://www.fnac.es");
    pagina2.get("http://www.phonehouse.es");

    System.out.println("¿Que desea buscar?");
    String Busqueda = teclado.nextLine();

  /*  WebElement ventanaCookies =  pagina1.findElement(By.xpath("/html/body/aside/div/button"));
    if (ventanaCookies !=null){
        System.out.println("Detectado caja de cookies");
    ventanaCookies.click();
    }*/

    WebElement cajaBusqueda = pagina1.findElement(By.id("Fnac_Search"));
    cajaBusqueda.sendKeys(Busqueda);
    cajaBusqueda.submit();

    WebElement cajaBusqueda2 = pagina2.findElement(new By.ById("searcher"));
    cajaBusqueda2.sendKeys(Busqueda);
    cajaBusqueda2.submit();

    String resultados1 = pagina1.findElement(By.xpath("//*[@id=\"dontTouchThisDiv\"]")).getText();
    System.out.println(resultados1);

    String resultados2 = pagina2.findElement(By.xpath("//*[@id=\"flexboxgrid\"]")).getText();
    System.out.println(resultados2);


}catch (Exception e){
    System.out.println("error");
}
    }

}
