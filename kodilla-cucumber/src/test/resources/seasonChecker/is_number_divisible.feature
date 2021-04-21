Feature: is number divisible?
  Testing numbers divisible by 3, by 5, by 3 and 5

  Scenario: 24 is divisible by 3
    Given number 24
    When it is divisible by 3
    Then sound is "Fizz"

  Scenario: 4 isn't divisible by 3
    Given number 4
    When it isn't divisible by 3
    Then sound is "None"

  Scenario: 40 is divisible by 5
    Given number 40
    When it is divisible by 5
    Then sound is "Buzz"

  Scenario: 53 isn't divisible by 5
    Given number 53
    When it isn't divisible by 5
    Then sound is "None"

  Scenario: 15 is divisible by 3 and 5
    Given number 15
    When it is divisible by 3 and 5
    Then sound is "FizzBuzz"

  Scenario: 13 is divisible by 3 and 5
    Given number 13
    When it isn't divisible by 3 and 5
    Then sound is "None"
