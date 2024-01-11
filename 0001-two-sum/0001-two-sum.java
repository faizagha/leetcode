class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        index[0] = -1; index[1] = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (hm.containsKey(remainder)){
                index[0] = i;
                index[1] = hm.get(remainder);
                break;
            }
            hm.put(nums[i] , i);
        }
        return index;
    }
}