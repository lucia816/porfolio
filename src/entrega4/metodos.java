package entrega4;

import  entrega4.Main;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public class metodos {

    private static Object WebElement;
    private static FirefoxDriver driver = null;
    private static Object List;

    public static String getTitle() {
        return driver.getTitle();
    }

    public static List<org.openqa.selenium.WebElement> findElements(String by) {
        return driver.findElements(ByAll.id("productsList1"));
    }

    public static void findElements() {
    }
}


