package utils;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static ResultadoVuelosPage resultadoVuelosPage;
    protected static MenuPage menuPage;
    protected static HorariosVuelosPage horariosVuelosPage;
    protected static ResultadoHorariosVuelosPage resultadoHorariosVuelosPage;

    public static void abrirDriver(){

        //encontrar archivo exe de chromedriver
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

        //crea opciones sobre el driver
        ChromeOptions options = new ChromeOptions();
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

        //nueva instancia de ChromeDriver
        driver = new ChromeDriver(options);

        //Ventana navegador maximizada
        driver.manage().window().maximize();

        //define tiempo de espera
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        inicializaPaginas(driver);
    }

    protected static void inicializaPaginas(WebDriver driver){

        homePage = new HomePage(driver);
        resultadoVuelosPage = new ResultadoVuelosPage(driver);
        menuPage = new MenuPage(driver);
        horariosVuelosPage = new HorariosVuelosPage(driver);
        resultadoHorariosVuelosPage = new ResultadoHorariosVuelosPage(driver);
    }

    public static void cerrarDriver() {
        //Cerrar ventana, apagar driver
        driver.quit();
    }
}
