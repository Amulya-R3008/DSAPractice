package com.example.DSA.Searching.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=5;
        int[] ans= search(arr, target); //format return value{row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }

    public static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int element:ints){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
