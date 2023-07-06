Feature: Login the application

  Scenario Outline: User can able to login the account
    Given the user can launch URL of the application is "https://demo.nopcommerce.com/"
    When the user navigates to the login menu
    And clicks on the login option
    Then the user should be redirected to the login page
    When the user fills in valid login details
    And clicks on the login button
