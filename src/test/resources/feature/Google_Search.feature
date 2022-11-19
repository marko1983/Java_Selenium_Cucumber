
Feature: Google Search Functionality Verification
  User story: As a user, when I am on the Google search page
  If I search for Curbio i should be able to see it on main page


  Background:
    Given User is on Google search page

  @smoke
  Scenario: Search functionality result title verification
    When User types Curbio in the google search box and clicks enter
    Then User sees Curbio google search web page
    And When user click on Curbio he should be on main page
