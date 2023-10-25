@common
Feature: Login feature Outline1

  Scenario Outline: Login test with user Multiple input
    open facebook app 
    enter valid user name and password  from users
    click login button from users
    so that user can be logged in with credentials

    Given users enter <browser> and <url> to open app
    When users enter <username> and <password> from the users
    And users click login button
    Then users can be logged in

    Examples: 
      | browser  | url                        | username  | password    |
      | "Chrome" | "http://www.facebook.com/" | "Tanita"  | "Sarwat123" |
      | "Edge"   | "http://www.facebook.com/" | "Sabrina" | "Sharna"    |
