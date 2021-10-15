package com.ecommerce.qa.testcases;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    ProfilePage profilePage;

    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Login - My Store");
    }

    @Test(priority = 2)
    public void LogoImageTest(){
        boolean flag = loginPage.validateLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest(){
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
