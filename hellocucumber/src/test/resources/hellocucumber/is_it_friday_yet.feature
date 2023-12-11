Feature: Friday is TGIF

  Scenario Outline: Answers depending on the day of the week
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"
    Examples:
      | day            | answer |
      | Sunday         | Nope   |
      | Saturday       | Nope   |
      | Friday         | TGIF   |
      | Thursday       | Nope   |
      | Wednesday      | Nope   |
      | Tuesday        | Nope   |
      | Monday         | Nope   |
      | Friday*        | TGIF   |
      | anything else! | Nope   |
