/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 * Tool class for evaluating candidate password strength 
 * against a set of requirement
 * 
 * TODO: Consider how to store/encode the strength requirements for
 * the candidate passwords. Option 1: FINAL variables in this class
 * Option 2: Store requirements in an external file and read that file
 * into Java and then check candidate passwords
 * 
 * @author Mehmet Ozen <mehmetozen159@gmail.com>
 */
public class StrengthChecker {
    
    
    /**
     * Checks a candidate for the presence of a given character
     * @param userName for username
     * @param password for password
     * @return true for does contain required char, false for does not
     */
    public boolean checkForPassword(String userName, String password){
        
        return passLength(password) && digitCheck(password) && upperCaseCheck(password) &&
                lowerCaseCheck(password) && checkUserName(userName, password) && checkForSpaces(password);
        
    } // close method
    
    public boolean checkUserName(String userName, String password){
        if (password.contains(userName)){
            System.out.println("!!Your password can't be including your username!!");
            System.out.println();
            return false;
        } else {
            return true;
        }
    }
    
    public boolean checkForSpaces(String password){
        String req = ".*\\s.*";
        if (password.matches(req)){
            System.out.println("!!No Spaces are allowed!!");
            System.out.println();
            return false;
        } else {
            return true;
        }
    }
    
    public boolean upperCaseCheck(String password){
        
        String req = ".*\\p{Upper}.*";
        if(password.matches(req)){
            return true;
        } else {
            System.out.println("!!At least 1 uppercase!!");
            System.out.println();
            return false;
        }
    }
    
    public boolean lowerCaseCheck(String password){
        
        String req = ".*\\p{Lower}.*";
        if(password.matches(req)){
            return true;
        } else {
            System.out.println("!!At least 1 lowercase!!");
            System.out.println();
            return false;
        }
    }
    
    public boolean digitCheck(String password){
        // REGEXP NOTES:  . means any character
        //                * is a repeater, 0 or more times
        String req = ".*\\d.*";// a digit somewhere in the rest of the passsword
        
        if(password.matches(req)){
            return true;
        } else {
            System.out.println("!!At least 1 digit!!");
            System.out.println();
            return false;
        }
    }
    
    public boolean passLength(String password){
        //Check for the password length.
        if (password.length() > 7){
            return true;
        } else {
            System.out.println("!!At least 8 characters!!");
            System.out.println();
            return false;
        }
    }
    
} // close class