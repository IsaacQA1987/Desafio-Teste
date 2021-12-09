import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.ref.Cleaner;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class TesteDesafioProduto {

@Test
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    driver.get("https:www.mercadolivre.com.br/");

    WebElement caixadePesquisa = driver.findElement(By.name("as_word"));
    caixadePesquisa.sendKeys("Smartphone Samsung Galaxy A70" + Keys.ENTER);
    driver.findElement(By.name("as_word")).clear();

    caixadePesquisa = driver.findElement(By.name("as_word"));
    caixadePesquisa.sendKeys("Smartphone Motorola One Vision" + Keys.ENTER);
    driver.findElement(By.name("as_word")).clear();

    caixadePesquisa = driver.findElement(By.name("as_word"));
    caixadePesquisa.sendKeys("Smartphone Xiaomi Redmi Note 7" + Keys.ENTER);

    WebElement resultadoPesquisa = driver.findElement(By.className("ui-search-item__title"));
    String resultado = resultadoPesquisa.getText();
    System.out.println(resultado);

    if (resultado.contains("Xiaomi Redmi Note 7 (48 Mpx) Dual SIM 64 GB neptune blue 4 GB RAM")){
        System.out.println("Congratulations");
    } else { System.out.println("Failed");
    }
    driver.close();

}
}
