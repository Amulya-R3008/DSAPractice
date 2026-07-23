package com.example.DSA.Day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {
    /**
     * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,1,1,2,2,3], k = 2
     *
     * Output: [1,2]
     *
     * Example 2:
     *
     * Input: nums = [1], k = 1
     *
     * Output: [1]
     *
     * Example 3:
     *
     * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
     *
     * Output: [1,2]
     * @param k
     */

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
    public static void main(String[] args) {
        Top_K_Frequent_Elements obj = new Top_K_Frequent_Elements();
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        System.out.println(Arrays.toString(obj.topKFrequent(nums, k)));

    }
}
