import jdk.jshell.spi.ExecutionControl;

import javax.xml.stream.events.EndDocument;
import java.util.Scanner;
public class ColorAsk {
    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color: B-Blue, Y-Yellow, G-Green, R-Red");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "Blue";
                case "Y":
                    return "Yellow";
                case "G":
                    return "Green";
                case "R":
                    return "Red";
                default:
                    System.out.println("Wrong character of color");
            }
        }
    }
}
