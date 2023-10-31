@Registration
Feature: Registration Test

  Scenario Outline: As a tester i open facebook registration page
    to build dynamic registration test to input data 
    so that i can be validated

    Given Open facebook home page
    When Click on registration button
    And In put first Name <enterFirstName>
    And Input last Name <enterLastName>
    And Input email <enterEmail>
    And Input re enter email <enterconfirmEmail>
    And Input password <enterYourPassword>
    And Input birth Month <enterYourBirthMonth>
    And Input birth Day <enterYourBirthDay>
    And Input birth Year <enterYourBirthYear>
    And Input gender <enterYourgender>
    And click login button
    Then I can create an account

    Examples: 
      | enterFirstName | enterLastName | enterEmail        | enterconfirmEmail | enterYourPassword | enterYourBirthMonth | enterYourBirthDay | enterYourBirthYear | enterYourgender |
      | "Sumon"        | "Ahmed"       | "sumon@gmail.com" | "sumon@gmail.com" | "sumon123"        | "Dec"               | "19"              | "1994"               | "Male"          |
