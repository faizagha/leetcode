class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int temp;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]==(nums[i-1]+nums[i+1])/2)
            {
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                if(i>=2) i=i-2;
            }
        }
        
        return nums;
    }
}