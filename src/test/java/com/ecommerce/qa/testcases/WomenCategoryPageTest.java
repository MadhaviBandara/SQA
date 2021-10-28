package com.ecommerce.qa.testcases;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.ItemPage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.ProfilePage;
import com.ecommerce.qa.pages.WomenCategoryPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenCategoryPageTest extends TestBase {
    private static final Logger logger = LogManager.getLogger(WomenCategoryPageTest.class);
    LoginPage loginPage;
    WomenCategoryPage womenCategoryPage;
    ProfilePage profilePage;
    ItemPage itemPage;

    public WomenCategoryPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        PropertyConfigurator.configure("D:\\Uni\\4th Year\\Adv. SQA\\Assignment\\src\\log4j.properties");
        initialization();
        logger.info("Opening Website");
        loginPage = new LoginPage();
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
        womenCategoryPage = profilePage.GoToWomensCategory();
    }

    @Test
    public void validateWomenCategoryPageTitleTest(){
        String title = womenCategoryPage.validateWomenCategoryPageTitle();
        Assert.assertEquals(title, "Women - My Store");
        logger.info("Women Category Page Title Validated");
        driver.quit();
    }

    @Test(priority = 2)
    public void validateImgTest(){
        boolean flag = womenCategoryPage.validateImg();
        Assert.assertTrue(flag);
        logger.info("Women Category Page Logo Validated");
        driver.quit();
    }

    @Test(priority = 3)
    public void selectItemTest(){
        itemPage = womenCategoryPage.selectItem();
        itemPage.proceedToCheckout();
        String status = itemPage.validatePayment();
        Assert.assertEquals(status, "Your order on My Store is complete.");
        logger.info("Item selection successful");
        itemPage.proceedToCheckout();
    }

//    @Test(priority = 4)
//    public void validateCart(){
//    }

//    @Test(priority = 5)
//    public void proceedToCheckout(){
//        itemPage.proceedToCheckout();
//    }

//    @Test(priority = 6)
//    public void AgreeToTerms(){
//    }

//    @Test(priority = 7)
//    public void validatePayment(){
//        String status = itemPage.validatePayment();
//        Assert.assertEquals(status, "Your order on My Store is complete.");
//    }

//    @Test(priority = 8)
//    public void obtainInvoice(){
//        itemPage.proceedToCheckout();
//    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
