package com.ecommerce.qa.pages;

import com.ecommerce.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WomenCategoryPage extends TestBase {
    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/div/p[1]/strong")
    WebElement womenImg;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]")
    WebElement onHover;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[2]")
    WebElement onHover2;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[3]")
    WebElement onHover3;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[4]")
    WebElement onHover4;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[5]")
    WebElement onHover5;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[6]")
    WebElement onHover6;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[7]")
    WebElement onHover7;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]")
    WebElement item;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]")
    WebElement item2;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]")
    WebElement item3;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[4]/div/div[2]/div[2]/a[1]")
    WebElement item4;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[5]/div/div[2]/div[2]/a[1]")
    WebElement item5;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[6]/div/div[2]/div[2]/a[1]")
    WebElement item6;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[7]/div/div[2]/div[2]/a[1]")
    WebElement item7;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
    WebElement continueShopping;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElement proceedToCheckout;
    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
    WebElement proceedSummary;
    @FindBy(xpath = "//*[@id='center_column']/form/p/button")
    WebElement proceedAddress;
    @FindBy(xpath = "//*[@id='form']/div/p[2]/label")
    WebElement termsAndConditions;
    @FindBy(xpath = "//*[@id='form']/p/button")
    WebElement proceedShipping;
    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    WebElement payByBank;
    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    WebElement confirmPayment;
    @FindBy(xpath = "//*[@id='center_column']/p/a")
    WebElement orderHistory;
    @FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr[1]/td[6]/a")
    WebElement invoice;

    public WomenCategoryPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateWomenCategoryPageTitle(){
        return driver.getTitle();
    }

    public boolean validateImg(){
        return womenImg.isDisplayed();
    }

    public void getPageItems(){
        List<WebElement> listOfItems = driver.findElements(By.cssSelector("div[class='right-block'] h5 a[class='product-name']"));
        for (WebElement pageItem : listOfItems) {
            System.out.println(pageItem.getText());
        }
    }

    public void getCartItems(){
        List<WebElement> listOfCartItems = driver.findElements(By.cssSelector("td[class='cart_desription'] p[class='product-name'] a"));
        for (WebElement cartItem : listOfCartItems) {
            System.out.println(cartItem.getText());
        }
    }

    private void addItemToCart(WebElement hover , WebElement itemVal){
        actions.moveToElement(hover).perform();
        wait.until(ExpectedConditions.elementToBeClickable(itemVal)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();
    }

    public ItemPage selectItem(){
        addItemToCart(onHover,item);
        addItemToCart(onHover2,item2);
        addItemToCart(onHover3,item3);
        addItemToCart(onHover4,item4);
        addItemToCart(onHover5,item5);
        addItemToCart(onHover6,item6);
        addItemToCart(onHover7,item7);
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout)).click();
        return new ItemPage();
    }

    public void obtainInvoice(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedSummary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedAddress)).click();
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditions)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedShipping)).click();
        wait.until(ExpectedConditions.elementToBeClickable(payByBank)).click();
        wait.until(ExpectedConditions.elementToBeClickable(confirmPayment)).click();
        wait.until(ExpectedConditions.elementToBeClickable(orderHistory)).click();
        wait.until(ExpectedConditions.elementToBeClickable(invoice)).click();
    }
}
