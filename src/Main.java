import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Enter Number : ");
        int number = scan.nextInt(); // Number to check for palindrome
        System.out.println();
        if(isPalindrome(number))
            System.out.println(number + " is a palindrome.");
        else
            System.out.println(number + " is not a palindrome.");
    }
    // Function to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }
}