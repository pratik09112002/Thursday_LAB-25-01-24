/*
Q5)Write a program in Java to accept a word/a String 
and display the new string after removing all the vowels present in it.
*/


package Practical_5_25_01;

import java.util.Scanner;

public class RemoveVowels 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Accept a word or string
        System.out.print("Enter a word or string: ");
        String input = scanner.nextLine();

        // Remove vowels and display the new string
        String result = removeVowels(input);
        System.out.println("String after removing vowels: " + result);

        scanner.close();
    }

    private static String removeVowels(String input) 
    {
        // Using regular expression to remove vowels (case-insensitive)
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}

