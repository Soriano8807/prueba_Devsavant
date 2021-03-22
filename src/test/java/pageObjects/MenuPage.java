package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class MenuPage extends BasePage {

    //Localizadores
    @FindBy(partialLinkText = "Horari")
    private WebElement lnkHorariosVuelos;

    //Constructor
    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickHorariosVuelo() {
        click(lnkHorariosVuelos);
    }
}
