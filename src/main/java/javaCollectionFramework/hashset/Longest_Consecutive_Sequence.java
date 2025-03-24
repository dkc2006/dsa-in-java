package javaCollectionFramework.hashset;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        Longest_Consecutive_Sequence obj = new Longest_Consecutive_Sequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + obj.longestConsecutive(nums)); // Output: 4
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for (int num : nums) {
            numset.add(num);
        }
        int longest = 0;

        for (int num : numset) {
            if (!numset.contains(num - 1)) { // Start of a new sequence
                int currNum = num;
                int currStreak = 1;

                while (numset.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                longest = Math.max(longest, currStreak);
            }
        }
        return longest;
    }
}
