package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AdminPage {
    WebDriver driver = Browser.driver;

    @FindBy(css = "button[type='submit']") private WebElement submitButton;

    public AdminPage searchUserName(String userName){
        List<WebElement> elements = driver.findElements(By.cssSelector(".oxd-input.oxd-input--active"));
        elements.get(1).sendKeys(userName);

        submitButton.click();
        return this;
    }

    public void validateUserName(String userName){
        List<WebElement> elements =  driver.findElements(By.className("oxd-table-cell"));
        Assert.assertEquals(elements.get(1).getText(), userName);
    }
}
