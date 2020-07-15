package problems;

public class TrappingWater {

    public static int trap(int[] height) {

        if (height.length == 0 || height.length == 1) {
            return 0;
        }

        int[] right = new int[height.length];
        int[] left = new int[height.length];
        int total = 0;

        right[0] = height[0];

        left[height.length - 1] = height[height.length - 1];

        for (int i = 1, k = height.length - 2; i < height.length; i++, k--) {

            right[i] = Math.max(height[i], right[i - 1]);
            left[k] = Math.max(height[k], left[k + 1]);

        }

        for (int i = 1, k = height.length - 2; i < height.length; i++, k--) {

            total = total + (Math.min(right[i], left[i]) - height[i]);

        }

        return total;

    }
}
