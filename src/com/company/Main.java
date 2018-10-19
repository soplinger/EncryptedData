package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        String wordInput;
        int numInput;
        Store input = new Store();

        System.out.println("Press 1 to encrypt, or press 2 to decrypt: ");

        numInput = kbInput.nextInt();

        if(numInput == 1){
            System.out.println("Enter the word you want to encrypt: ");
            wordInput = kbInput.next();
            System.out.println("The word encrypted is: " + input.encrypt(wordInput));
        }
        else if (numInput == 2){
            System.out.println("Enter the word you want to decrypt: ");
            wordInput = kbInput.next();
            System.out.println("The decryted word is: " + input.decrypt(wordInput));
        }


    }
}
