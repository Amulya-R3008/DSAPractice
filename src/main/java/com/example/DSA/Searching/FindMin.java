package com.example.DSA.Searching;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,2,-3,4,5,6};
        System.out.println(min(arr));

    }

    //assume arr.length !=0
    //return the min value in the array
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }

}
