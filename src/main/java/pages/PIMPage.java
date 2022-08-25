package pages;

import browser.Browser;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static browser.Browser.driver;

public class PIMPage {

    @FindBy(linkText = "Recruitment") private WebElement recruitmentLink;
    @FindBy(css = "button[type='submit']") private WebElement submitButton;

    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[3]/div")
    private WebElement firstNameElement;

    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[3]/div")
    private WebElement lastNameElement;

    public RecruitmentPage navigateToRecruitmentLink(){
        recruitmentLink.click();
        return PageFactory.initElements(driver, RecruitmentPage.class);
    }
    public PIMPage searchEmployeeId(String id){
        List<WebElement> elements = driver.findElements(By.cssSelector((".oxd-input.oxd-input--active")));
        elements.get(1).sendKeys(id);

        submitButton.click();

        return this;  // when we are on the same page or use PageFactory... to go to another page.
    }

    public PIMPage validateFirstAndLastName(String firstName, String lastName){

        Assert.assertEquals(firstNameElement.getText(), firstName);
        Assert.assertEquals(lastNameElement.getText(), lastName);

        return this;
    }

}
