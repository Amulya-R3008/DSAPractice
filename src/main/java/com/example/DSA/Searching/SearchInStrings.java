package com.example.DSA.Searching;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Amulya";
        char target='u';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;

            }
        }
        return false;
    }

    static boolean search1(String name,char target){
        if(name.length()==0){
            return false;
        }

        for(char ch: name.toCharArray()){
            if(ch==target){
                return true;

            }
        }
        return false;
    }

}
