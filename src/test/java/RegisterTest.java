import org.LoginRegister.RegisterPage;
import org.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    RegisterPage registerPage;

    public RegisterTest() {
        super();
    }

    @BeforeClass
    public void setup() {
        initialization();
        registerPage = new RegisterPage();
    }

    @Test(priority = 1)
    public void RegisterPageTitleTest() {
        String pageTitle = registerPage.validateRegisterPageTitle();
        Assert.assertEquals(pageTitle, "Sign in to Asians - User System");
        System.out.println("Title: Sign in to Asians - User System");

    }

    @Test(priority = 2)
    public void RegisterPageTextTest() {
        String pageText = registerPage.validateRegisterPageText();
        Assert.assertEquals(pageText, "ASIANS USER SYSTEM");
        System.out.println("Text: ASIANS USER SYSTEM");

    }

    //  @Test(dataProvider ="InputData",priority = 3)
    @Test(priority = 3)
    public void RegisterTest() {

        registerPage.register(prop.getProperty("username_reg"), prop.getProperty("password_reg"));
    }

    @Test(priority = 4)
    public void validateHomePageTitle() {
        String pageTitle = registerPage.validateHomePageTitle();
        Assert.assertEquals(pageTitle, "CDN console - high-speed, high-defense, high-speed CDN");

    }

    //    @DataProvider
//    public Object[][] InputData() throws Exception {
//
//
//        return ExcelRead.getTableArrayforSheet_RegCSV(
//                System.getProperty("user.dir") +TestBase.prop.getProperty("path") + "Login.csv", "Y");
//    }
    @AfterClass
    public void CloseTest() {
        driver.quit();
    }

}

