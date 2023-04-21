import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4]
            if (name.length() >= 2) {                              // [5]
                return name;                                        // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {               //metoda
        Scanner scanner = new Scanner(System.in);           //obiekt z wbudowanej w jave klasy scanner
        while (true) {                                      //pętla nieskończoności

            System.out.println("Select calculation (A-add, S-substract, D-divide, M-Multiply");

            String calc = scanner.nextLine().trim().toUpperCase();  //zmienna calc uruchamia metodę scanner z klasy javy Scanner + reszta metod

            switch (calc) {
                case "A": return "ADD;";
                case "S": return "SUB;";
                case "D": return "DIV;";
                case "M": return "MUL;";
                default:
                    System.out.println("Wrong calculation. Try again.");

            /*
            if(calc.equals("A")) {
                return "ADD";
            } else if (calc.equals("S")) {
                return "SUB";
            } else if (calc.equals("D")) {
                return "DIV";
            } else if (calc.equals("M")) {
                return "MUL";
            }
            System.out.println("Wrong calculation. Try again.");

            */

            }
        }
    }
    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}
