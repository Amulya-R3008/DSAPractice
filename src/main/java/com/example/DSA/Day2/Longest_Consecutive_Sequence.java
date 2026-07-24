package com.example.DSA.Day2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * Example 3:
 *
 * Input: nums = [1,0,1,2]
 * Output: 3
 */
public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        Map<Integer,Boolean> exploredMap = new HashMap<>();
        for(int num:nums){
            exploredMap.put(num,Boolean.FALSE);

        }

        for(int num:nums){
            int currentLength=1;

            //check in forward direction
            int nextNum = num+1;
            while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum)==false)
            {
                currentLength++;
                exploredMap.put(nextNum,Boolean.TRUE);

                //move nexxt number
                nextNum++;
            }

            //check rev dir
            int prevNum=num -1;
            while(exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)){
                currentLength++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longestLength = Math.max(longestLength,currentLength);
        }
        return longestLength;
    }

    public static void main(String[] args) {
        Longest_Consecutive_Sequence l=new Longest_Consecutive_Sequence();
        System.out.println(l.longestConsecutive(new int[]{1,0,1,2}));
    }
}
