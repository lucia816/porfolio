import org.openqa.selenium.By;
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

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.phonehouse.es");

        System.out.println("¿Que marca?");
        System.out.println("1- Samsung");
        System.out.println("2- Xiaomi");
        System.out.println("3- iphone");
        int marca = teclado.nextInt();

        if (marca == 1){
            driver.get("https://www.phonehouse.es/moviles-y-telefonia/moviles/samsung.html");
            String samsung = driver.findElement(By.xpath("//*[@id=\"productsList1\"]")).getText();
            System.out.println(samsung);

        }
        if (marca == 2){
            driver.get("https://www.phonehouse.es/moviles-y-telefonia/moviles/xiaomi.html");
            String xiaomi= driver.findElement(By.xpath("//*[@id=\"productsList1\"]")).getText();
            System.out.println(xiaomi);

                       /* WebElement elementoActual, navegacion;*/
            /*int j=1;
            for (int i=0; i<listaElementos.size();i++){
                elementoActual = listaElementos.get(i);
                navegacion =elementoActual.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/main/section[2]/section/form/div/div/div[1]/div/div[1]" + j +  "]"+"/html/body/div[3]/div/div[2]/div[2]/main/section[2]/section/form/div/div/div[1]/div/div[2]"));
                System.out.println(j + " " +navegacion.getText());
                j++;
            }*/
        }
        if (marca == 3){
            driver.get("https://www.phonehouse.es/moviles-y-telefonia/moviles/apple.html");
            String Iphone = driver.findElement(By.xpath("//*[@id=\"productsList1\"]")).getText();
            System.out.println(Iphone);
        }
    }

}
