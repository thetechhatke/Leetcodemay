class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count=1,max=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==nums[max])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                count=1;
                max = i;
            }
        }
        count = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==nums[max])
            {
                count++;
            }
        }
        if(count>n/2)
            return nums[max];
        else
            return -1;
    }
}
