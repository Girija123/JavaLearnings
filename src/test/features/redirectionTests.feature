Feature: Home page Links re-direction verification
  As a user
  I should get directed appropriately

 @re-direction @Regression
  Scenario: Verify our shops link re-direction

    Given I'm on Home Page "https://www.johnlewis.com"
    When I click on our shops link
    Then I should get re-directed appropriately with heading as "JOHN LEWIS & PARTNERS STORE LOCATOR"