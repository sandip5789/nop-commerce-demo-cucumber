package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;



    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnLogOutLink(){
        clickOnElement(logOutLink);
        log.info("Clicking on log out link : " + logOutLink.toString());
    }

    public String  verifyThatLogOutLinkDisplay(){
        String link = getTextFromElement(loginLink);
        return link;

    }

    public boolean isLogInLinkDisplay() {
        boolean b = loginLink.isDisplayed();
        log.info("Checking is loginLink displayed : " + loginLink.getText());
        return b;
    }




    public void clickOnMyAccountLink() {
        log.info("Click on myAccountLink : " + myAccountLink.getText());
        clickOnElement(myAccountLink);
    }

    public boolean isLogoDisplayed() {
        boolean b = logo.isDisplayed();
        log.info("Checking logo is Displayed");
        return b;
    }


    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                log.info("Click on '" + tab + "' tab");
                clickOnElement(menu);
                break;
            }
        }
    }
}
