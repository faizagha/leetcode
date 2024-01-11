class Solution {
    public void moveZeroes(int[] nums) {
        int[] zeroMoved = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                zeroMoved[index] = num;
                index++;
            }
        }

        // Copy the elements from zeroMoved back to nums
        System.arraycopy(zeroMoved, 0, nums, 0, nums.length);
    }

}