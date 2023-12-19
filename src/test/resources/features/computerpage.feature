@regression
Feature: Computer Page Feature
  As a user I want to click on computer, desktops and can build own computer

  @author_Sandip @smoke @sanity
  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on computer tab
    Then I should navigate to computer page successfully

  @author_Sandip @sanity
  Scenario: User Should navigate to desktops page successfully
    Given I am on homepage
    When I click on computer tab
    And I click on Desktops link
    Then I should navigate to Desktops page

  @author_Sandip
    Scenario Outline: User should build own computer and add them to cart successfully
      Given I am on homepage
      When I click on computer tab
      And I click on Desktops link
      And I click on product name Build your own computer
      And I select processor "<processor>"
      And I Select RAM "<ram>"
      And I Select HDD "<hdd>"
      And I Select OS "<os>"
      And I Select Software "<software>"
      And Click on ADD TO CART Button
      Then I should get message that The product has been added to your shopping cart
      Examples:
        | processor                                        | ram           | hdd                | os                      |     software               |
        | 2.2 GHz Intel Pentium Dual-Core E2200            | 2 GB          | 320 GB             | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
        | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]  | 4GB [+$20.00] | 400 GB [+$100.00]  | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
        | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]  | 8GB [+$60.00] | 320 GB             | Vista Home [+$50.00]    | Total Commander [+$5.00]   |