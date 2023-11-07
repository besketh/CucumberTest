@Swing
Feature: Swing testing

  Scenario: Opening the Swing form with cucumber
    Given I open the Swing form
    When 5000 milliseconds pass
    Then the swing form still displays

  Scenario: Entering name
    Given I open the Swing form
    And 5000 milliseconds pass
    When I input my name: "Jerry"
    Then my name displays: "Jerry"



