package com.ecommerce.qa.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.ProfilePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class LoginPageTest extends TestBase {
    private static final Logger logger = LogManager.getLogger(LoginPageTest.class);
    LoginPage loginPage;
    ProfilePage profilePage;

    public LoginPageTest(){
        super();
    }

    private static ExtentReports report;
    private static ExtentTest extentTest;

    @BeforeMethod
    public void setUp(){
        PropertyConfigurator.configure("D:\\Uni\\4th Year\\Adv. SQA\\Assignment\\src\\log4j.properties");
        initialization();
        logger.info("Opening Website");
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Login - My Store");
        logger.info("Login Page Title Validated");
    }

    @Test(priority = 2)
    public void LogoImageTest(){
        boolean flag = loginPage.validateLogo();
        Assert.assertTrue(flag);
        logger.info("Login Page Image Validated");
    }

    @Test(priority = 3)
    public void loginTest(){
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
        logger.info("Login successful");
        //extent.flush();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
