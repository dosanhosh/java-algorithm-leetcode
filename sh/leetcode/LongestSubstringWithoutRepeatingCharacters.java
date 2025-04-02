package src.sh.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            Integer idx = hashMap.get(s.charAt(right));
            if (idx != null && idx >= left) {
                left = hashMap.get(s.charAt(right)) + 1;
            }
            hashMap.put(s.charAt(right), right);

            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "dvdf";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
