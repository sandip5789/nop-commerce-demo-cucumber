package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        new HomePage().clickOnLoginLink();
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage,"Login page not displayed");
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
    }

    @Then("I should log in successfully")
    public void iShouldLogInSuccessfully() {
    }

    @And("I click on log out link")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("I should see that log in link display")
    public void iShouldSeeThatLogInLinkDisplay() {
        String expectedLink = "Log in";
        String actualLink = new HomePage().verifyThatLogOutLinkDisplay();
        Assert.assertEquals(actualLink,expectedLink,"Log in link not display");

    }
}
