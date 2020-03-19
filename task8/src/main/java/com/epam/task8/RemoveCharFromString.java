package com.epam.task8;
import java.util.ArrayList;
import java.util.List;

public class RemoveCharFromString { 
    public static String remove(String word, char unwanted){
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();
     
        for(char A : letters){
            if(A != unwanted ){
                sb.append(A);
            }
        }
     
        return sb.toString();
    }
}
