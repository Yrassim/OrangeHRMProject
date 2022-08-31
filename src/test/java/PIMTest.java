import org.testng.annotations.Test;

public class PIMTest extends TestBase{

    //WebDriver driver;

    @Test
    public void test01(){
        startLoginPage()
                .loginToPIMPage()
                .navigateToRecruitmentLink()
                .selectOptionFromDropdown("QA Lead");
//                .searchEmployeeId("0083")
//                .validateFirstAndLastName("Joe", "Root");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test02(){

    }
}
