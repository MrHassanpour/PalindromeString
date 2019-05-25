
package palindromestring;

import java.util.Scanner;


/**
 * Java Program to determine whether a given string is palindrome
In this program, we need to check whether a given string is palindrome or not.

A string is said to be palindrome if it is the same from both the ends. For e.g. above string is a palindrome because if we try to read it from backward, it is same as forward.
* One of the approach to check this is iterate through the string till middle of string and compare a character from back and forth.
 *
 * @author MCSD
 */
public class PalindromeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A charecter : ");
        String string = sc.next();    
        boolean flag = true; 
        string = string.toLowerCase();    
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
    }
    
}
