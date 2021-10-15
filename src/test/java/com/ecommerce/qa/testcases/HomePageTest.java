package com.ecommerce.qa.testcases;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.HomePage;
import com.ecommerce.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
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
