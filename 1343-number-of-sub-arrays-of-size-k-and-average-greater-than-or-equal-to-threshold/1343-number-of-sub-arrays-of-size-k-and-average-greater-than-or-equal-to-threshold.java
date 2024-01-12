class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        if (sum/k >= threshold){
            cnt++;
        }
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            System.out.println(sum);
            if (sum / k >= threshold){
                cnt++;
            }
        }
        return cnt;
    }
}