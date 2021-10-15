package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//a[@title='View my customer account']")
    WebElement usernameLabel;

    @FindBy(xpath =  "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement womenCategory;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    WebElement dressCategory;


    @FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[3]/a")
    WebElement tshirtsCategory;


    //Initializing the page objects using Driver
    public ProfilePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyProfilePageTitle(){
        return driver.getTitle();
    }

    public boolean verifyUsernameLabel(){
        return usernameLabel.isDisplayed();
    }

    public WomenCategoryPage GoToWomensCategory(){
        womenCategory.click();
        return new WomenCategoryPage();
    }

    public DressesPage GoToDressesCategory(){
        dressCategory.click();
        return new DressesPage();
    }

    public TshirtsPage GoToTshirtsCategory(){
        tshirtsCategory.click();
        return new TshirtsPage();
    }




}
