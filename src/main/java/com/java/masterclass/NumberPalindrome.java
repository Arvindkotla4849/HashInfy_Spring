package com.java.masterclass;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {
        NumberPalindrome numberPalindrome = new NumberPalindrome();
        numberPalindrome.isPalindrome(212);
        System.out.println("Hi, Welcome to Coding");
    }

    public boolean isPalindrome(int num) {
        int reverse = 0;
        int number = num % 10;
        reverse = reverse * 10 + number;
        num = num / 10;

        if (reverse == num) {
            System.out.println("Palindrome Number");
            return true;
        }
        System.out.println("Not a Palindrome Number");
        return false;
    }

}
