class Solution {
    public int maxArea(int[] height) {
        int areaMax = 0;
        int f = 0, l = height.length - 1;
        while (f < l){
            int areaTemp = Math.min(height[f], height[l]) * (l - f);
            if (height[f] < height[l]){
                f++;
            } else if (height[f] >= height[l]) {
                l--;
            }
            areaMax = Math.max(areaMax, areaTemp);
        }
        return areaMax;
    }
}