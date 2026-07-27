package com.example.DSA.Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};
        int target=2;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for every element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence tareget not found
        return -1;
    }

    //if i need to return element
    static int linearSearch1(int[] arr,int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for every element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence tareget not found
        return Integer.MAX_VALUE;
    }

    //return true or false
    static boolean linearSearch2(int[] arr,int target) {
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for every element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence tareget not found
        return false;
    }
}
