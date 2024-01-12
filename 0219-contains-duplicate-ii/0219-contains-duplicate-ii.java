class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    // Ideally, let us assume there are no duplicates
    for (int i = k; i > 0; i--) {
        for (int j = 0; j < nums.length - i; j++) {
            if (nums[j] == nums[j + i]) {
                return true;
            }
        }
    }

    return false;
}

}