package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement yourRegCompletedText;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameFiledError;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameFiledError;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailFiledError;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordFiledError;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement cPasswordFiledError;


    public String getRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("Get registerText : " + registerText.getText());
        return message;
    }

    public void selectGender(String gender) {
        for (WebElement radio : genderRadios) {
            if (radio.getText().contains(gender)) {
                log.info("Select '" + gender + "' radio button");
                clickOnElement(radio);
                break;
            }
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter Firstname : '" + firstName + "' to firstName field");
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("Enter Lastname : '" + lastName + "' to lastName field");
    }

    public void selectDateOfBirth(String day, String month, String year) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        log.info("Select day : '" + day + "', month : '" + month + "', year : '"
                + year + "' for DateOfBirth");
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter Email : '" + email + "' to email field");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password : '" + password + "' to password field");
    }

    public void enterConfirmPassword(String confPassword) {
        sendTextToElement(confirmPasswordField, confPassword);
        log.info("Enter Confirm password : '" + confPassword + "' to confirm " +
                "password field");
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
        log.info("Click on 'REGISTER' button");
    }

    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                log.info("Validation message : '" + message.getText() + "' for " +
                        "fieldName '" + fieldName + "'");
                break;
            }
        }
        return validationMessage;
    }

    public String getYourRegCompletedText() {
        String message = getTextFromElement(yourRegCompletedText);
        log.info("Get your reg completed text : " + yourRegCompletedText.getText());
        return message;
    }

    public void clickOnContinueButton() {
        log.info("Click on 'CONTINUE' button");
        clickOnElement(continueBtn);
    }

    public String getFirstNameIsRequiredField() {
        String message = getTextFromElement(firstNameFiledError);
        log.info("Get First name is required field : " + firstNameFiledError.getText());
        return message;
    }
    public String getLastNameIsRequiredField() {
        String message = getTextFromElement(lastNameFiledError);
        log.info("Get Last name is required field : " + lastNameFiledError.getText());
        return message;
    }
    public String getEmailIsRequiredField() {
        String message = getTextFromElement(emailFiledError);
        log.info("Get email is required field : " + emailFiledError.getText());
        return message;
    }
    public String getPasswordIsRequiredField() {
        String message = getTextFromElement(passwordFiledError);
        log.info("Get password is required field : " + passwordFiledError.getText());
        return message;
    }
    public String getCPasswordIsRequiredField() {
        String message = getTextFromElement(cPasswordFiledError);
        log.info("Get confirm password is required field : " + cPasswordFiledError.getText());
        return message;
    }

}