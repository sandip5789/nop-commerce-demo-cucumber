package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {



    }

    @And("I should see the Register text")
    public void iShouldSeeTheRegisterText() {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualMessage,expectedMessage,"Register not display");
    }

    @And("I click on Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should see error message First name is required")
    public void iShouldSeeErrorMessageFirstNameIsRequired() {
        String expectedMessage = "First name is required.";
        String actualMessage = new RegisterPage().getFirstNameIsRequiredField();
        Assert.assertEquals(actualMessage,expectedMessage,"First name is required is not display");
    }

    @And("I should see error message Last name is required")
    public void iShouldSeeErrorMessageLastNameIsRequired() {
        String expectedMessage = "Last name is required.";
        String actualMessage = new RegisterPage().getLastNameIsRequiredField();
        Assert.assertEquals(actualMessage,expectedMessage,"Last name is required is not display");
    }

    @And("I should see error message Email is required")
    public void iShouldSeeErrorMessageEmailIsRequired() {
        String expectedMessage =  "Email is required.";
        String actualMessage = new RegisterPage().getEmailIsRequiredField();
        Assert.assertEquals(actualMessage,expectedMessage,"Email is required is not display");
    }

    @And("I should see error message Password is required")
    public void iShouldSeeErrorMessagePasswordIsRequired() {
        String expectedMessage =  "Password is required.";
        String actualMessage = new RegisterPage().getPasswordIsRequiredField();
        Assert.assertEquals(actualMessage,expectedMessage,"Password is required is not display");
    }

    @And("I should see error message Confirm Password is required")
    public void iShouldSeeErrorMessageConfirmPasswordIsRequired() {
        String expectedMessage =  "Password is required.";
        String actualMessage = new RegisterPage().getCPasswordIsRequiredField();
        Assert.assertEquals(actualMessage,expectedMessage,"Password is required is not display");
    }

    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }


    @And("I select date of birth {string},{string},{string}")
    public void iSelectDateOfBirth(String day, String month, String year) {
        new RegisterPage().selectDateOfBirth(day, month, year);
    }

    @And("I enter email field  {string}")
    public void iEnterEmailField(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password field {string}")
    public void iEnterPasswordField(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password field {string}")
    public void iEnterConfirmPasswordField(String cPassword) {
        new RegisterPage().enterConfirmPassword(cPassword);
    }

    @Then("I should see message  that Your registration completed")
    public void iShouldSeeMessageThatYourRegistrationCompleted() {
        String expectedMessage =  "Your registration completed";
        String actualMessage = new RegisterPage().getYourRegCompletedText();
        Assert.assertEquals(actualMessage,expectedMessage,"Registration unsuccessfully ");
    }
}
