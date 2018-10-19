package com.company;

public class Encrypt {

    public String encrypt;
    public String userReplace;
    public String temp;
    public String word;
    public String word2;

    public int randomEncrypt = (int)(Math.random()*100);


    public String encrypt(String word){
        for(int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            a+=1;
            word2 += a;

        }
        return word2;
    }

    public String decrypt(String word){
        for(int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            a-=1;
            word2 += a;

        }
        return word2;
    }

}
