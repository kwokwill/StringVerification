
import java.util.Scanner;
/**
 * @author William Kwok
 * @version 1.0
 */

/**
 * 
 * 
 *
 */
public class Loop {
  
    

    /**
     * @param args
     * 
     */
   
    public static void main(String[] args) {
        
        // Prompt user for input.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int value; 
        int square;
        String input;
        
        // Validation loop to ensure correct value.
        input = validate(scan);
        
        // Loop for when integer is processed.
        while (!input.contentEquals("none")) {
            value = Integer.parseInt(input);
            square = value * value;
            
            System.out.println("The square of " + input + " is " + square);
            System.out.println("enter again: ");
            input = validate(scan);
        }
        }
        
        /**
         * Receives input from user and determines if it is integer, "none",
         * or a different String. If input is different String, then
         * prompt user to re-enter input again.
         * 
         * @param s
         * @return inp as a String or return prompt "must be integer or none".
         */
        private static String validate(Scanner s) {
            boolean isInt = s.hasNextInt();            
            String inp = s.next();
            while (!isInt && !inp.contentEquals("none")) {
                System.out.println("must be integer or \"none\": ");
                isInt = s.hasNextInt();
                inp = s.next();
            }
            return inp;
            }
        
        
}
    

/*
 * 
 *  int count = 0;
 *  int value;
 *  int sum = 0;
while (scan.hasNextInt()) {
    value = scan.nextInt();
    
    product = value * value;
    System.out.println("squared is + " + product);
    
}

} */


