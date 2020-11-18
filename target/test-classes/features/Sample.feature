@Before
Feature: Test 2
    As a user of the site i want
    to confirm i can do certain things

  @test
  Scenario:
    Given a user navigate to https://dotnetfiddle.net/
    When I enter names start with "AdeyemiFolakemi"
    And I enter "Nunit" in the search box
    And I select Nunit
    And I click on version "3.12.0"
    Then the Nunit package added successfully