package problems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int longestSubstringwithoutRepeating(String s){

        int a_pointer = 0;
        int b_pointer = 0;
        int max = Integer.MIN_VALUE;

        HashSet<Character> set = new HashSet<>();

        while(b_pointer < s.toCharArray().length){

            if(!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer++));
                max = Math.max(max, set.size());
            }
            else {
                set.remove(s.charAt(a_pointer++));
            }
        }

        return max;

    }
}
