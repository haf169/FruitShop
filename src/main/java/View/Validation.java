/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran HaF
 */
public class Validation {

    public Validation() {
    }
    final static Scanner scanner = new Scanner(System.in);
    public static String getString(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // kiem tra ten
    public static String checkName(String msg) {
        String input = null;

        while (true) {
            if (msg != null) {
                System.out.print(msg);
            }

            input = scanner.nextLine().trim();
            boolean isValid = true;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid && !input.isEmpty()) {
                break;
            }
            System.out.println("Name cannot contain special characters or numbers. Please try again");
        }
        return input;
    }

    // Kiem tra kdl int  
    public static int checkInt(String msg, int minRange, int maxRange) {
        if (minRange > maxRange) {
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        int value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }
                value = Integer.parseInt(scanner.nextLine());
                if (value < minRange || value > maxRange) {
                    System.out.println("Invalid input! Value must be between " + minRange + " and " + maxRange + ". Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again");
            }
        } while (value < minRange || value > maxRange);

        return value;
    }
    //Kiem tra kdl double
    public static double checkDouble(String msg, double minRange, double maxRange) {
        if (minRange > maxRange) {
            double temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        double value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }
                value = Double.parseDouble(scanner.nextLine());
                if (value < minRange || value > maxRange) {
                    if (value == 0) {
                        System.out.println("Value cannot be 0. Please try again");
                        continue;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again");
            }
        } while (value < minRange || value > maxRange);

        return value;
    }

    //ktra CourseName
    public static String checkCourseName(String msg) {
        while (true) {
            String result = getString(msg);
            if (result.equalsIgnoreCase("Java")
                    || result.equalsIgnoreCase(".Net")
                    || result.equalsIgnoreCase("C")
                    || result.equalsIgnoreCase("C++")) {
                return result;
            } else {
                System.out.println("Please choose one in Course: Java, .Net, C, C++");
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String input = getString("Please enter y/Y or n/N: ");

            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Invalid. Try again.");
        }
    }
    public static boolean checkOrder() {
        while (true) {
            String input = getString("Do you want to order now (Y/N): ");

            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Invalid. Try again.");
        }
    }
    
    
     public static int checkOrder(String msg, int minRange, int maxRange) {
        if (minRange > maxRange) {
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        int value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! The data to be entered must be an integer. Please try again");
            }
        } while (value == 0 || value < minRange || value > maxRange);

        return value;
    }
}
