package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage {

    WebDriver driver = Browser.driver;


    public void selectOptionFromDropdown(){
        List<WebElement> elements = driver.findElements(By.className("oxd-select-text--after"));
        elements.get(0).click();
    }


}
