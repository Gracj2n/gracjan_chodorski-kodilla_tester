Feature:  Is it Summer? Everybody likes Summer

  Scenario: Winter isn't Summer

    Given today is last day of December
    When  I ask whether it's Summer
    Then  I should be told "Nope"

  Scenario: Summer is Summer

    Given today is first day of August
    When  I ask whether it's Summer
    Then  I should be told "Yes! Summer!"

  Scenario Outline: Today is or isn't Summer

    Given today is <day>
    When  I ask whether it's Summer
    Then  I should be told <answer>
    Examples:
      | day | answer |
      | last day of December | "Nope" |
      | second day of January | "Nope" |
      | 10th day of February | "Nope" |
      | 24th day of June | "Yes! Summer!" |
      | 27th day of July | "Yes! Summer!" |
