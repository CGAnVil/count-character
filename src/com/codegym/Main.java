package com.codegym;
//import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter characters need to check:");
        String mainChar = sc.nextLine();
        char chr = mainChar.charAt(0);

        int count = findCharacter(str, chr);
        System.out.println("There are " + count + " character in string");
    }

    public static int findCharacter (String string, char chr){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == chr){
                count++;
            }
        }
        return count;
    }
}
