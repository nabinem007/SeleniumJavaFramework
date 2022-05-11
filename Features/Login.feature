# This is my first cucumber script

  Feature: Login to facebook
    @smoke
   Scenario Outline: Successful login with valid credential
      Given User launch Chrome browser
      When User opens URL "<URL>"
      And User enters email as "<email>" and Password as "<password>"
      And Click on login
      Then i reach on home screen
      And close the browser
     Examples:
         |URL                        | email                   | password      |
         | https://www.facebook.com/ |  nabinem@comcast.net     | Drishna@2019  |


  Scenario Outline: Successful login with invalid credentials
    Given User launch Chrome browser
    When User opens URL "<URL>"
    And User enters email as "<email>" and Password as "<password>"
    And Click on login
    Then i reach on home screen
    And close the browser
    Examples:
      |URL                        | email                   | password      |
      | https://www.facebook.com/ |  nabin_777@hotmail.com     | Drishna@2019  |


