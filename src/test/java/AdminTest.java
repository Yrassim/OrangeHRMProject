import org.testng.annotations.Test;

public class AdminTest extends TestBase{
    @Test
    public void test002(){

        startLoginPage()
                .loginToPIMPage()
                .navigatToAdminPage()
                .searchUserName("Aaliyah.Haq")
                .validateUserName("Aaliyah.Haq");
    }
}
