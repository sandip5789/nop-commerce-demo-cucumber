package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']//h1")
    WebElement productNameText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//li/label")
    List<WebElement> hDDRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li/label")
    List<WebElement> oSRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li/label")
    List<WebElement> softwareCheckBoxes;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddeMessage;

    public String getProductNameText() {
        String message = getTextFromElement(productNameText);
        log.info("Get productName text : " + productNameText.getText());
        return message;
    }

    public void selectProcessor(String processorName) {
        selectByVisibleTextFromDropDown(processor, processorName);
        log.info("Select processor '" + processorName + "'");
    }

    public void selectRam(String ramGB) {
        selectByVisibleTextFromDropDown(ram, ramGB);
        log.info("Select RAM '" + ramGB + "'");
    }

    public void selectHDD(String hDdGB) {
        for (WebElement hdd : hDDRadios) {
            if (hdd.getText().equals(hDdGB)) {
                clickOnElement(hdd);
                log.info("Select HDD '" + hDdGB + "'");
                break;
            }
        }
    }

    public void selectOS(String oSName) {
        for (WebElement os : oSRadios) {
            if (os.getText().equals(oSName)) {
                clickOnElement(os);
                log.info("Select HDD '" + oSName + "'");
                break;
            }
        }
    }

    public void selectSoftware(String softwareName) {
        for (WebElement software : softwareCheckBoxes) {
            if (software.getText().equals(softwareName)) {
                clickOnElement(software);
                log.info("Select Software '" + software + "'");
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartBtn);
        log.info("Click on 'ADD TO CART' Button");
    }

    public String getProductAddedMessage() {
        String message = getTextFromElement(productAddeMessage);
        log.info("Get productAdded Message : " + productAddeMessage.getText());
        return message;
    }
}
