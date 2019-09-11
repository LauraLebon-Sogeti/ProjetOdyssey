Feature: Facebook page Testing

  Scenario: test login page
    When I enter username as "TOM"
    And I enter password as "JERRY"
    Then Login should fail

    