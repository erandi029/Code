package problems;

/*
Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.
 */

class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while(i < chars.length){
            int j = i;

            while(j < chars.length && chars[j] == chars[i]){
                j++;
            }

            chars[index++] = chars[i];

            if(j-i>1) {
                String count = j-i +"";

                for(char number: count.toCharArray()){
                    chars[index++] = number;
                }
            }

            i = j;
        }

        return index;
    }
}

public class StringCompression {

}




