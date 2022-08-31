package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage {

    WebDriver driver = Browser.driver;

    @FindBy(css = "div[role='option']>span" ) private List<WebElement> options;
    // ""//div[@role='option']/span"" this is if we want to use xpath.

    public RecruitmentPage selectOptionFromDropdown(String jobTitleText){
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class=\"oxd-select-text oxd-select-text--active\"]"));

        elements.get(0).click();

        for(WebElement element: options){
            if (element.getText().equals(jobTitleText)){
                element.click();
                break;
            }
        }

        return this;
    }


}
