package com.curbio.page;

import com.curbio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(xpath = "//span[.='Curbio® - Official Website - Remodel Now, Pay When You Sell']")
    public WebElement CurbioWeb ;

    @FindBy (xpath = "//a[.='Curbio']")
    public WebElement Curbio ;


}
