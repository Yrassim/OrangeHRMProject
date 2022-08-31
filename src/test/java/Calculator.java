import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import java.time.Duration;

public class Calculator {
    WebDriver driver;

    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.calculator.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.cssSelector("img[src*='all-calculators.svg']")).click();
        driver.findElement(By.linkText("Gas Mileage Calculator")).click();

        WebElement gasPrice = driver.findElement(By.id("usgasprice"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).below(gasPrice)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}