Feature:login and logout
  Scenario: Successfully login with Valid Credentials
    Given User is on EmailTypeList Page
    When User Navigate to 126 Mail LogIn Page
    And User enters Username and Password
    Then Message displayed Login Successfully

  Scenario: Successfully LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully