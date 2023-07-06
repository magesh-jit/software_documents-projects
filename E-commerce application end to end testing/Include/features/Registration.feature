Feature: User Registration

  Scenario Outline: User can register an account successfully
    Given the user can launch URL of the application is "https://demo.nopcommerce.com/"
    When the user navigates to the registration menu
    And clicks on the registration option
    Then the user should be redirected to the registration page
    When the user fills in valid registration details
    And clicks on the submit button
    Then the user will see the successfull message
