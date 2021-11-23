package BaseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class Base {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    /*
        //Va a la URL y maximiza
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        //Imprime por consola el título de la página
        System.out.println(driver.getTitle());

        //Busca cuantos enlaces hay y me devuelve el número
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //Hace click en el enlace 'Inpunts'
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
    */

        //driver.quit();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
