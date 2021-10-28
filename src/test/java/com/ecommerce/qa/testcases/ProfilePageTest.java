package com.ecommerce.qa.testcases;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase {
    private static final Logger logger = LogManager.getLogger(ProfilePageTest.class);
    LoginPage loginPage;
    ProfilePage profilePage;
    WomenCategoryPage womenCategoryPage;
    DressesPage dressesPage;
    TshirtsPage tshirtsPage;

    //Initializing properties from TestBase
    public ProfilePageTest(){
        super();
    }

    //Initializing the driver
    @BeforeMethod
    public void setUp(){
        PropertyConfigurator.configure("D:\\Uni\\4th Year\\Adv. SQA\\Assignment\\src\\log4j.properties");
        initialization();
        logger.info("Opening Website");
        logger.info("Opening Website");
        loginPage = new LoginPage(); //Create Login Page obj
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password")); //Login using that obj
    }

    @Test (priority = 1)
    public void verifyProfilePageTitleTest(){
        String ProfilePageTitle = profilePage.verifyProfilePageTitle();
        Assert.assertEquals(ProfilePageTitle,"My account - My Store", "Title of the profile page not matched"); //will display this only if the testcase fails
    }
    @Test (priority = 2)
    public void verifyUsernameLabelTest(){
        Assert.assertTrue(profilePage.verifyUsernameLabel());
    }

    @Test (priority = 3)
    public void GoToWomensCategoryTest(){
        womenCategoryPage = profilePage.GoToWomensCategory();
    }

    @Test (priority = 4)
    public void GoToDressesCategoryTest(){
        dressesPage = profilePage.GoToDressesCategory();
    }

    @Test (priority = 5)
    public void GoToTshirtsCategory(){
        tshirtsPage = profilePage.GoToTshirtsCategory();
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }






}
