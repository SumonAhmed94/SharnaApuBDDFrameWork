Feature: Login Test With user Input

  @Regression
  Scenario: As a tester I open facebook app
    enter valid credentials (user name and password) 
    click login button 
    so that user can be logged in

    Given I open "Chrome" and "https://www.facebook.com/"
    When enter valid user name "Sumon"
    And enter valid password "Nurul"
    And click loginButton
    Then User logged in Facebook
