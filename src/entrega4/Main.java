package entrega4;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.*;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;

public class Main {


    private static FirefoxDriver driver;

    public static void main(String[] args) {

        try {
          Scanner teclado = new Scanner(System.in);
          System.out.println("Que desea buscar?");
          String movil = teclado.nextLine();
          System.out.println("¿Que filtros desea aplicar?");
          String filtros = teclado.nextLine();

            Firefox();

          WebElement cajaBusqueda = driver.findElement(By.id("searcher"));
WebElement
          cajaBusqueda.sendKeys(movil);
          cajaBusqueda.submit();
            WebElement ventanaCookies = driver.findElement(By.xpath("/html/body/aside/div/button"));
          if (ventanaCookies != null) {
              System.out.println("Detectado caja de cookies");
              ventanaCookies.click();
          }

            List<WebElement> listaElementos =  driver.findElements(By.xpath("//*[contains(@class, 'Article-itemGroup')]"));
            System.out.println("Número de elementos de la lista: " + listaElementos.size());


            WebElement elementoActual, navegacion;
            int j = 1;
            for (int i = 0; i < listaElementos.size(); i++) {
                elementoActual = listaElementos.get(i);
                navegacion = elementoActual.findElement(By.xpath("/html/body/div[3]/div/div[7]/div" + j + "]" + "/div/div[2]/div/p[1]/a"));
                System.out.println(j + " " + navegacion.getText());
                j++;
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
    public static void Firefox() {

        String exePath = "C:\\Users\\HP\\Downloads\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);
        driver = new FirefoxDriver();
        driver.get("https://www.phonehouse.es");
        driver.manage().window().maximize();
    }


}
