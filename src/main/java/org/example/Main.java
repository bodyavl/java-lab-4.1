package org.example;

import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String str) {
        if(str == null) return false;
        String s = str.replaceAll("\\s+", "").toLowerCase();
        return s.contentEquals(new StringBuilder(s).reverse());
    }
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(str));
        }
    }