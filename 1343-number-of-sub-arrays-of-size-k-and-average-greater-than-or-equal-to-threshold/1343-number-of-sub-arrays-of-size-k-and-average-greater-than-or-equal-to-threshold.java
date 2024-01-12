class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0;
        int sum = 0;
        int target = threshold * k;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= target) {
            cnt++;
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum >= target) {
                cnt++;
            }
        }

        return cnt;
    }
}
