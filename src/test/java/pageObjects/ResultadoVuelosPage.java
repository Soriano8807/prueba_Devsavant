package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class ResultadoVuelosPage extends BasePage {

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/main[1]/div[1]/avail-page[1]/div[1]/div[1]/avail-cont[1]/avail-pres[1]/modify-search-container[1]/modify-search-presenter[1]/expander-elem[1]/div[1]/div[1]/span[1]")
    private WebElement lblSalida;

    //Constructor
    public ResultadoVuelosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void listaDeVuelos() {
        waitInMs(20000);
        elementDisplayed(lblSalida);
    }
}
