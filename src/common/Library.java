package common;

import java.util.Scanner;

public class Library {
   static Scanner sc = new Scanner(System.in);
   
   public int inputIntLimit(int min, int max) {
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
   
   public static String inputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }
    
    public boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Re-input.");
        }
    }


}
