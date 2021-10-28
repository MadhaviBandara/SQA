package com.ecommerce.qa.testcases;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    private static final Logger logger = LogManager.getLogger(HomePageTest.class);
    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        PropertyConfigurator.configure("D:\\Uni\\4th Year\\Adv. SQA\\Assignment\\src\\log4j.properties");
        initialization();
        logger.info("Opening Website");
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void homePageTitleTest(){
        String title = homePage.validateHomePageTitle();
        Assert.assertEquals(title, "My Store");
    }

    @Test(priority = 2)
    public void LogoImageTest(){
        boolean flag = homePage.validateLogo();
        Assert.assertTrue(flag);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
