package com.example.DSA.Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int ans =binarySearch(arr,6);
        System.out.println(ans);
    }

    //return index
    //return -1 if it doesnt exist
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find middle element
            //int mid=(start+end)/2;//might be possible that start+end might exceed the range of integers
            int mid=start+(end-start)/2;

            if(target <arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
