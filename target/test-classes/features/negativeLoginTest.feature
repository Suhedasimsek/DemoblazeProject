Feature: Negative Login Test- user should NOT be able to login

  Background:
    Given The user is on the login page

  @negativeLoginTest
  Scenario Outline: Negative Scenario- user should NOT be able to login
    When The user enters "<invalidUsername>" and "<invalidPassword>" and click login button
    Then Verify that invalid "<message>"

    Examples:
      | invalidUsername | invalidPassword | message                                |
      | suheda          |                 | Please fill out Username and Password. |
      |                 | s1234           | Please fill out Username and Password. |
      | */+-            | s1234           | User does not exist.                   |
      | suheda          | sgjk1           | Wrong password.                        |
      | fddbkj          | s1234           | User does not exist.                   |
      | fddbkj          | sgjk1           | User does not exist.                   |
      |                 |                 | Please fill out Username and Password. |
