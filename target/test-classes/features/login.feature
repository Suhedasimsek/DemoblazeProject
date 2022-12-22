Feature: Login Test

  Background:
    Given The user is on the login page

  @loginWithoutParametres
  Scenario: Positive Scenario 1- user should be able to login

    When The user enters valid credentials
    Then Verify "Welcome suheda"


  @loginWithParametres
    Scenario: Positive Sceneraio 2
      When The user enters "suheda" and "s1234" and click login button
      Then Verify "Welcome suheda"

  @loginWithScenarioOutline
  Scenario Outline: Positive Scenario 3 - user should be able to login
    When The user enters "<username>" and "<password>" and click login button
    Then Verify "<welcomeUser>"

    Examples:
      | username | password | welcomeUser  |
      | ktb2     | Test1234 | Welcome ktb2 |

  @loginWithDataTableAndScenarioOutline
  Scenario Outline: Positive Scenario 4 - user should be able to login
    When The user enters valid username and password
      | username | <user>     |
      | password | <password> |
    Then Verify "<welcomeUser>"

    Examples:
      | user | password | welcomeUser |
      | ktb2 | Test1234 | Welcome ktb2 |
      | suheda | s1234 | Welcome suheda |
