package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    //Object Repository
    @FindBy(xpath="//img[contains(@class, 'logo img-responsive')]")
    WebElement Logo;

    @FindBy(xpath= "//a [@href= ‘http://automationpractice.com/index.php?controller=my-account’]")
    WebElement signinbtn;



    //Initializing the page objects using Driver
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    //Defining functions on Login Page
    public String validateHomePageTitle(){
        return driver.getTitle();
    }

    public boolean validateLogo(){
        return Logo.isDisplayed();
    }


}
