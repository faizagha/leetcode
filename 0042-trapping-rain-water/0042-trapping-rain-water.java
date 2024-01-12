class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // No trapped water with less than 3 bars
        if (n <= 2) {
            return 0;
        }

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int result = 0;
        while (left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (height[left] > height[right]){
                //if leftMax is greater then, we can calculate the area using rightMax.
                result = result + (rightMax - height[right]);
                right--;
            }else{
                result = result + (leftMax - height[left]);
                left++;
            }
        }
        return result;
    }
}