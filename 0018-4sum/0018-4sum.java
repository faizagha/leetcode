import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates
                }
                int frst = j + 1, last = nums.length - 1;
                while (frst < last) {
                    long sum = (long) nums[i] + nums[j] + nums[frst] + nums[last];
                    if (sum == target) {
                        ls.add(Arrays.asList(nums[i], nums[j], nums[frst], nums[last]));
                        frst++;
                        last--;
                        while (frst < last && nums[frst] == nums[frst - 1]) {
                            frst++; // Skip duplicates
                        }
                        while (frst < last && nums[last] == nums[last + 1]) {
                            last--; // Skip duplicates
                        }
                    } else if (sum > target) {
                        last--;
                    } else {
                        frst++;
                    }
                }
            }
        }
        return ls;
    }
}

