package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends TestBase {

    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/div/p[1]/strong")
    WebElement womenimg;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]")
    WebElement item;

    @FindBy(name= "Submit")
    WebElement addToCart;


    public WomenCategoryPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateWomenCategoryPageTitle(){
        return driver.getTitle();
    }

    public boolean validateImg(){
        return womenimg.isDisplayed();
    }

    public ItemPage selectItem(){
        item.click();
        return new ItemPage();
    }

    public ItemPage addToCart(){
        addToCart.click();
        return new ItemPage();
    }

//    public void selectItemByListNo(int itemNo){
//        driver.findElement(By.xpath("//*[@id='center_column']/ul/li["+itemNo+"]/div/div[2]/div[2]/a[1]")).click();
//    }

}
