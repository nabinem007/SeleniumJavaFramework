# This is the feature file for the Google

  Feature: Search in goole
   Scenario Outline: Search
      Given I am on the google page
      Then I enter "<Text>"
      And I get the output page
     Examples:
     |Text|
     | Weather in Columbus   |
