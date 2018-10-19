package com.company;

public class Store {
    public String word;
    public String word2;

    public void store (){
    }

    public String encrypt(String word){
        word2 = "";
        for(int i=0; i<word.length();i++)
        {
            char A = word.charAt(i);
            A-=40;
            word2 += A;
        }
        return word2;
    }

    public String decrypt(String word){
        word2 = "";
        for(int i=0; i<word.length();i++)
        {
            char A = word.charAt(i);
            A+=40;
            word2 += A;
        }
        return word2;
    }

}
