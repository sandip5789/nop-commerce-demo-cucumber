package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computer");
    }

    @Then("I should navigate to computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
        String expectedMessage = "Computers";
        String actualMessage = new ComputerPage().getPageTitleText();
        Assert.assertEquals(actualMessage,expectedMessage,"Computers is not displayed");
    }

    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
    new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("I should navigate to Desktops page")
    public void iShouldNavigateToDesktopsPage() {
        String expectedText = "Desktops";
        String actualText = new DesktopsPage().getPageTitleText();
        Assert.assertEquals(actualText,expectedText,"Desktops not displayed");

    }

    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hDD) {
        new BuildYourOwnComputerPage().selectHDD(hDD);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String oS) {
        new BuildYourOwnComputerPage().selectOS(oS);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("Click on ADD TO CART Button")
    public void clickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should get message that The product has been added to your shopping cart")
    public void iShouldGetMessageThatTheProductHasBeenAddedToYourShoppingCart() {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = new BuildYourOwnComputerPage().getProductAddedMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Add to cart message not displayed");
    }
}
