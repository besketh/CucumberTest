@Swing
Feature: Swing testing

  Scenario: Entering name
    Given I open the Swing form
    When I input my name: "Jerry"
    Then my name displays: "Jerry"


  Scenario: Multiple inputs
    Given I open the Swing form
    When I input the following form details
      | Name  | Address  |
      | Jerry | New York |
    Then my name displays: "Jerry"

  Scenario: T+Cs validation check
    Given I open the Swing form
    When I click submit
    Then The message "Please accept the terms & conditions.." is displayed

  Scenario: Multiple inputs submission with t+c's accepted
    Given I open the Swing form
    And I input the following form details
      | Name  | Address  |
      | Jerry | New York |
    And I accept the T+Cs
    When I click submit
    Then then details are saved