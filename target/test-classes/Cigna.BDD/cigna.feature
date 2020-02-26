Feature: Validating Cigna HomePage

  Scenario: dasdsd
    Given to load application url
    When i click on logo
    Then validate current url "https://www.cigna.com/"
    Then i close the browser

    Scenario: dcssd
      Given to load application url
      When i click on international
      Then validate current url ""
      Then i close the browser
