class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1){
            return false;
        }
        //ideally let us assume there are no duplicates
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] == nums[j+i]){
                    
                    return true;
                }
            }
        }
        return false;
    }
}