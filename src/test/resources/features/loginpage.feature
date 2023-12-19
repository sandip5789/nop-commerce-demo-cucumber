@regression
Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password

  @author_Sandip @smoke @sanity
  Scenario: User should navigate to Login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @author_Sandip @sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"

    Examples:
      | email              | password | errorMessage                                                                                |
      | xyz999@gmail.com   | xyz999   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | abc111@gmail.com   | abc111   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | spspspsp@gmail.com | xyz999   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |


  @author_Sandip
  Scenario: User should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primefivetest@yahoo.com"
    And I enter password "abc123"
    And I click on login button
    Then I should log in successfully

  @author_Sandip
  Scenario: User should log out successfully
    Given I am on homepage
    When I click on login link
    And I enter email "sam125@gmail.com"
    And I enter password "sam123"
    And I click on login button
    And I click on log out link
    Then I should see that log in link display
