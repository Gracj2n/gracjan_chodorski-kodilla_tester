Feature: Is number divisible?

  Scenario Outline: Is number divisible or no by three

    Given Number to check is <number>
    When Is this number divisible by three
    Then Answer is <answer>
    Examples:
      | number | answer |
      | 3 | True |
      | 9 | True |
      | 5 | True |

  Scenario Outline: Is number divisible by three or five?

    Given Number to check is <number>
    When Is this number divisible by three or five
    Then Answer is <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 9 | "Fizz" |
      | 12 | "Fizz" |
      | 10 | "Buzz" |
      | 375 | "FizzBuzz" |
      | 0 | "Number cannot be 0" |
      | 13 | "Number is no divisible by 3 or 5" |
      | 791 | "Number is no divisible by 3 or 5" |