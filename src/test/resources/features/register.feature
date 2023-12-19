@regression
Feature: Register Feature
  In order to perform successful register
  As a User
  I have to enter all mandatory fields

  @author_Sandip @smoke @sanity
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully
    And I should see the Register text

  @author_Sandip @sanity
  Scenario: : Verify that FirstName LastName Email Password And ConfirmPassword Fields are Mandatory
    Given I am on homepage
    When I click on register link
    Then I should navigate to register page successfully
    And I click on Register button
    And I should see error message First name is required
    And I should see error message Last name is required
    And I should see error message Email is required
    And I should see error message Password is required
    And I should see error message Confirm Password is required

  @author_Sandip
  Scenario: Verify that user should create account successfully
    Given I am on homepage
    When I click on register link
    And  I select gender "Female"
    And I enter first name "Alia"
    And I enter last name "Bhatt"
    And I select date of birth "22","February","1980"
    And I enter email field  "alia1236@gmial.com"
    And I enter password field "bhatt123"
    And I enter confirm password field "bhatt123"
    And I click on Register button
    Then I should see message  that Your registration completed


