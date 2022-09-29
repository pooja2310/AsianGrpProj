import org.LoginRegister.LoginPage;
import org.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase
{
   LoginPage loginpage;
    public LoginTest(){
        super();
    }

    @BeforeClass
    public void setup()
    {
        initialization();
        loginpage = new LoginPage();
    }

    @Test(priority = 1)
    public void LoginPageTitleTest() throws InterruptedException
    {
        String pageTitle =loginpage.validateLoginPageTitle();
        Assert.assertEquals(pageTitle ,"Sign in to Asians - User System" );
        System.out.println("Title: Sign in to Asians - User System");
    }

    @Test(priority = 2)
    public void LoginPageTextTest()
    {
        String pageText =loginpage.validateLoginPageText();
        Assert.assertEquals(pageText ,"ASIANS USER SYSTEM" );
        System.out.println("Text: ASIANS USER SYSTEM");
    }

  //  @Test(dataProvider ="InputData",priority = 3)
    @Test(priority = 3)
    public void loginTest()
    {

        loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

//    @DataProvider
//    public Object[][] InputData() throws Exception {
//
//
//        return ExcelRead.getTableArrayforSheet_RegCSV(
//                System.getProperty("user.dir") +TestBase.prop.getProperty("path") + "Login.csv", "Y");
//    }
    @AfterClass
    public void CloseTest()
    {
       driver.quit();
    }

}
