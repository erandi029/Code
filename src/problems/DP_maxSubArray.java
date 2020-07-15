package problems;
/*
Start from the second element:

At each element: previous value - best of this element or the sum of this and the previous;

best - best I have seen so far or the pick at this point.



 */
public class DP_maxSubArray {

    public int maxSubArray(int[] nums) {

        int previous = nums[0];

        for (int i = 1 ; i< nums.length ; i++){
            previous = Math.max(nums[i], nums[i]+previous);
            nums[i] = Math.max(nums[i-1], previous);
        }

        return nums[nums.length-1];

    }
}

