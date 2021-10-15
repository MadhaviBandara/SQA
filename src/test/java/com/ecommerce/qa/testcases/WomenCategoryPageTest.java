package com.ecommerce.qa.testcases;

import com.ecommerce.qa.base.TestBase;
import com.ecommerce.qa.pages.ItemPage;
import com.ecommerce.qa.pages.LoginPage;
import com.ecommerce.qa.pages.ProfilePage;
import com.ecommerce.qa.pages.WomenCategoryPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenCategoryPageTest extends TestBase {
    LoginPage loginPage;
    WomenCategoryPage womenCategoryPage;
    ProfilePage profilePage;
    ItemPage itemPage;

    public WomenCategoryPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        profilePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
        womenCategoryPage = profilePage.GoToWomensCategory();
    }

    @Test
    public void validateWomenCategoryPageTitleTest(){
        String title = womenCategoryPage.validateWomenCategoryPageTitle();
        Assert.assertEquals(title, "Women - My Store");
    }

    @Test(priority = 2)
    public void validateImgTest(){
        boolean flag = womenCategoryPage.validateImg();
        Assert.assertTrue(flag);
    }
    @Test(priority = 3)
    public void selectItemTest(){
        itemPage = womenCategoryPage.selectItem();

    }

//    @Test(priority = 4)
//    public void selectItemByListNoTest(){
//        womenCategoryPage.selectItemByListNo(1);
//    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
