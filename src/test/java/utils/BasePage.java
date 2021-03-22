package utils;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;

public class BasePage {

    public static WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void writeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void typeKeys(WebElement element, String key) {

        if (key == "DOWN") {
            element.sendKeys(Keys.ARROW_DOWN);
        } else if (key == "UP") {
            element.sendKeys(Keys.ARROW_UP);
        } else if (key == "ENTER") {
            element.sendKeys(Keys.ENTER);
        }
    }

    public static void elementDisplayed(WebElement element) {
        element.isDisplayed();
    }

    public void click(WebElement element) {
        element.click();
    }

    public static void waitInMs(Integer milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
        }
    }

    public void clickDiaCalendario(By calendario, String dia) {
        ArrayList<WebElement> diasCalendario = (ArrayList<WebElement>) driver.findElement(calendario).findElements(By.tagName("td"));

        for (Iterator iterator = diasCalendario.iterator(); iterator.hasNext(); ) {
            WebElement dias = (WebElement) iterator.next();

            String row = dias.getText();
            if (row.equals(dia)) {
                dias.click();
                break;
            }
        }
    }
}
