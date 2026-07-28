package com.example.DSA.Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=9;
        System.out.println(linearSearch(arr,target,1,4));
    }
    static int linearSearch(int[] arr,int target,int start,int end  ) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = start; index < end; index++) {
            //check for every element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence target not found
        return -1;
    }

}
