/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

/**
 *
 * @author Pollock
 */
import java.io.*;
import java.util.*;

public class Caesar_Cipher {

/*    public static String encrypt(String plainText, int shift) {
        if (shift > 26) {
            shift %= 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String encryptedText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        encryptedText += (char) (ch - (26 - shift));
                    } else {
                        encryptedText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        encryptedText += (char) (ch - (26 - shift));
                    } else {
                        encryptedText += c;
                    }
                }
            } else {
                encryptedText += ch;
            }
        }
        return encryptedText;
    }*/

    public static String decrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String dencryptedText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'a') {
                        dencryptedText += (char) (ch + (26 - shift));
                    } else {
                        dencryptedText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'A') {
                        dencryptedText += (char) (ch + (26 - shift));
                    } else {
                        dencryptedText += c;
                    }
                }
            } else {
                dencryptedText += ch;
            }
        }
        return dencryptedText;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //System.out.println("Enter your message");
            int userShift = Integer.parseInt(br.readLine());
            String userInput = br.readLine();
            //System.out.println("Enter the amount of shifts");
            
            //String encrypted = encrypt(userInput, userShift);
            //System.out.println("Encrypted message :: " + encrypted);
            String decrypted = decrypt(userInput, userShift);
            //System.out.println("Decrypted message :: " + decrypted);
            System.out.println(decrypted);
        } catch (Exception e) {
           // System.out.println("There really aren't that many exceptions to this code, but kudos to you for finding one, now let's try this again...");
        }
    }
}
