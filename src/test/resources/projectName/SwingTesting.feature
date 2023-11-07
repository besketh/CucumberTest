@Swing
Feature: Swing testing

  Scenario: Entering name
    Given I open the Swing form
    And 2000 milliseconds pass
    When I input my name: "Jerry"
    And 2000 milliseconds pass
    Then my name displays: "Jerry"

