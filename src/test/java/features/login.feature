Feature: Login
  As a user I want to login to application

  Scenario: Verify Guide page is closed
    Given I launched the app
    Then I close the Guide page


    Scenario: Verify user is logged in
      Given I enter username as "mjenner" and password as "Auth3nt1c"
#      And I select project location "https://chai.aconex.com"
      When I tap on Login
      Then Home page should be displayed
      And I tap on Settings tab
      And I logout