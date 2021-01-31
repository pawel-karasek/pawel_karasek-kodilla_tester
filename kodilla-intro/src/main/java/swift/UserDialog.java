package swift;

import java.util.Scanner;

public class UserDialog {

        public static String chooseColour() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Select colour: W - white, B - black, R - red, G - green, Y - yellow");
                String print = scanner.nextLine().trim().toUpperCase();
                String result = null;
                switch (print) {
                    case "W":
                        result = "white";
                        break;
                    case "B":
                        result = "black";
                        break;
                    case "R":
                        result = "red";
                        break;
                    case "G":
                        result = "green";
                        break;
                    case "Y":
                        result = "yellow";
                        default:
                                System.out.println("Wrong choice, try again.");
                }
                return result;
            }
        }
        }
