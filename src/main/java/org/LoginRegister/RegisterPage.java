package org.LoginRegister;

import org.Util.TestUtil;
import org.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends TestBase
{
    //page object
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement loginPage_Register_link_;

    @FindBy(xpath= "//span[contains(text(),'Asians User System')]")
    WebElement Register_Text;

    @FindBy(xpath= "//input[@id='email']")
    WebElement Register_email;

    @FindBy(xpath= "//input[@id='password']")
    WebElement Register_pwd;

    @FindBy(xpath= "//input[@id='password-confirm']")
    WebElement Register_Confirm_pwd;

    @FindBy(xpath = "//input[@value='Register' and @type='submit']")
    WebElement Register_btn;


    public RegisterPage ()
    {
        PageFactory.initElements(driver, this);   //Register page constructor
    }

    public String validateRegisterPageTitle(){
        return driver.getTitle();
    }     //title -Sign in to Asians - User System

    public String validateRegisterPageText()    // text - Asians User System
    {
        return Register_Text.getText();

    }
        public String validateHomePageTitle()     // post register home page title - CDN console - high-speed, high-defense, high-speed CDN
        {
            return driver.getTitle();
        }

    public void register(String em,String pwd)
    {   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        loginPage_Register_link_.click();
        Register_email.sendKeys(em);
        Register_pwd.sendKeys(pwd);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        Register_Confirm_pwd.sendKeys(pwd);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        Register_btn.click();
    }
}
