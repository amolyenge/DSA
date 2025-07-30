class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            // Work on the smaller side
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // update left max
                } else {
                    waterTrapped += leftMax - height[left]; // trap water
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // update right max
                } else {
                    waterTrapped += rightMax - height[right]; // trap water
                }
                right--;
            }
        }

        return waterTrapped;
    }
}
