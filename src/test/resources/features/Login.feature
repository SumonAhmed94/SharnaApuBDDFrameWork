
Feature: LoginTest
  @smoke1
  Scenario: As a tester I open facebook app 
    enter valid credentials (user name and password) 
    click login button 
    so that i can be logged in
     
    Given I open facebook app
    When enter valid user name 
    And enter valid password 
    And click login button
    Then i can be logged in