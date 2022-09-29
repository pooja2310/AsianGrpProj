package org.LoginRegister;

import org.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase
{
    //page objects
        @FindBy(xpath= "//input[@id='username']")
        WebElement Email;

    @FindBy(xpath= "//input[@id='password']")
    WebElement Pwd;

      @FindBy(xpath = "//input[@id='kc-login']")
    WebElement Sing_in;

       @FindBy(xpath = "//span[contains(text(),'Asians User System')]")
      WebElement Text;

       //page object initialization
    public LoginPage ()
    {
        PageFactory.initElements(driver, this);   //login page constructor
    }

     //action
     public String validateLoginPageTitle()   // title -Sign in to Asians - User System
     {
         return driver.getTitle();
     }

    public String validateLoginPageText()     // text - Asians User System
    {
        return Text.getText();

    }

  public void login(String email, String pwd)
  {
      Email.sendKeys(email);
      Pwd.sendKeys(pwd);
      Sing_in.click();
  }


}
