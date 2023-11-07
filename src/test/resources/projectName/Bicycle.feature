Feature: Bicycle testing
  Scenario: As a user, when I ride my bike without experience I fall off the bike
    Given I am a user with 0 years experience riding bikes
    And user finds bicycle
    And user is upright
    When user rides bike
    Then user falls off bike

  Scenario: As a user, when I ride my bike with experience I do not fall off the bike
    Given I am a user with 10 years experience riding bikes
    And user finds bicycle
    And user is upright
    When user rides bike
    Then user does not fall off the bike