/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maamjenmay1stweek;
import java.util.Scanner;
/**
 *
 * @author nikka
 */
public class MaamJenMay1stWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        
        // reverse mo yung word order
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
        System.out.println("Reversed sentence: " + reversedSentence.trim());
        
       //palindrome na to par
        boolean isPalindrome = true;
        for (int i = 0; i < words.length / 2; i++) {
            if (!words[i].equals(words[words.length - i - 1])) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);
        
        // bilang the words
        int wordCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                wordCount++;
            }
        }
        System.out.println("Word count: " + wordCount);
        
        // check kung may naulit na word
        String repeatedWords = "";
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "";
                    }
                }
                if (count > 1) {
                    repeatedWords += words[i] + " (" + count + " times)\n";
                }
            }
        }
        System.out.println("Repeated words:\n" + repeatedWords);
    }

}


  