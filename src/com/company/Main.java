package com.company;

import java.util.Scanner;
public class Main
{
    static boolean checkIfPalindrome(String str, int a, int b)
    {
        if (a == b) // one character
            return true;
        if ((str.charAt(a)) != (str.charAt(b))) // check first and last character
            return false;
        if (a < b + 1)
            return checkIfPalindrome(str, a + 1, b - 1); //recursive call to check from both sides
        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n = str.length();
        if (n == 0) //check for empty string
            return true;
        return checkIfPalindrome(str, 0, n - 1);//indexes at first and last positions
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str = scan.nextLine();
        if (isPalindrome(str))
            System.out.println(str+" is a palindrome.");
        else
            System.out.println(str+ " is not a palindrome.");
    }
}