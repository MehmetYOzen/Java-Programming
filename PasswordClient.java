/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.Scanner;
/** REQUIREMENTS at least
 * 8 characters
 * A digit
 * 1 caps
 * 1 lower case
 * @author mehmet ozen <mehmetozen159@gmail.com>
 */
public class PasswordClient {
    public static void main(String[] args) {
        // Creating scanner
        Scanner inPut = new Scanner(System.in);
        
        // Call Checker
        StrengthChecker checker = new StrengthChecker();
        
        // Ask user to input username
        System.out.print("Username: ");
        // Get the username
        String userName = inPut.nextLine();
        
        // Ask user to input password
        System.out.print("Password: ");
        // Get the password
        String password = inPut.nextLine();
        
        // Check the password
        if (checker.checkForPassword(userName, password)){
            System.out.println("Great Password! ");
        }
        else {
            int check = 1;
            while (check == 1){
                System.out.println("Check the requirements;");
                System.out.println("  -At least 8 characters.");
                System.out.println("  -At least a digit.");
                System.out.println("  -At least 1 lowercase.");
                System.out.println("  -At least 1 uppercase.");
                System.out.println("  -No spaces.");
                System.out.println("  -Password can't include your Username.");
                System.out.println();
                System.out.print("Try again: ");
                // Get the password
                password = inPut.nextLine();
                if (checker.checkForPassword(userName, password)){
                    check = 0;
                    System.out.println("Great Password! ");
                }
            }
        }
    }
}
