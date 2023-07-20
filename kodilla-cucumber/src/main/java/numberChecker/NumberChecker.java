package numberChecker;

public class NumberChecker {
    public static String isNumberDivisibleByThree(int number) {
        if(number % 3 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static String isNumberDivisibleByFive(int number) {
        if(number % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static String isNumberDivisibleByThreeOrFive(int number) {
        if (number == 0) {
            return "Number cannot be 0";
        } else if(number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "Number is no divisible by 3 or 5";
        }
    }
}
