Feature: Points distance calculations

  Scenario Outline: Calculate distance between two points
    Given I have a point on <x> and <y> coordinates
    And I have another point on <x2> and <y2> coordinates
    When I calculate the distance between them
    Then I should get <result> as result
    Examples:
      | x | y | x2 | y2 | result |
      | 0 | 0 | 0  | 0  | 0      |
      | 0 | 0 | 1  | 0  | 1      |
      | 0 | 0 | 0  | 1  | 1      |
      | 0 | 0 | 1  | 1  | 1.414  |
      | 1 | 1 | 1  | 1  | 0      |
      | 1 | 1 | 4  | 5  | 5      |
      | 1 | 1 | 3  | 3  | 2.828  |

  Scenario Outline: Perimeter from triangle made with between three points
    Given I have a point on <x> and <y> coordinates
    And I have another point on <x2> and <y2> coordinates
    And I have a third point on <x3> and <y3> coordinates
    When I calculate the perimeter of the triangle made with them
    Then I should get <result> as result
    Examples:
      | x | y | x2 | y2 | x3 | y3 | result |
      | 0 | 0 | 0  | 0  | 0  | 0  | 0      |
      | 0 | 0 | 1  | 0  | 1  | 0  | 2      |
      | 0 | 0 | 0  | 1  | 0  | 1  | 2      |
      | 0 | 0 | 1  | 1  | 1  | 1  | 2.828  |
      | 1 | 1 | 1  | 1  | 1  | 1  | 0      |
      | 1 | 1 | 4  | 5  | 4  | 5  | 10.0   |
      | 1 | 1 | 3  | 3  | 3  | 3  | 5.656  |
