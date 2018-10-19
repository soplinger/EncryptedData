package com.company;

public class Decrypt {
    String decrypt;
    String userReplace;
    String temp;
    String s;

    public int randomEncrypt;

    public String decrypt(String s){
        for(int i = 0; i < s.length(); i++) {
            char boi = s.charAt(i);
            int ascii = (int)boi - randomEncrypt;
            s = "" + (char)ascii;
        }
        return s;
    }










}


