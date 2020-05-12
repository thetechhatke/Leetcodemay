class Solution {
    public int getNonDuplicate(int[] nums, int lo, int hi)
    {
        if(lo>=hi)
            return nums[lo];
        else
        {
            int mid = lo + (hi-lo)/2;
            int result;
            if(mid%2!=0)
            {
                if(nums[mid]>nums[mid-1])
                    result = getNonDuplicate(nums,lo,mid-1);
                else
                    result = getNonDuplicate(nums,mid+1,hi);
            }
            else
            {
                if(nums[mid]<nums[mid+1])
                    result = getNonDuplicate(nums,lo,mid);
                else
                    result = getNonDuplicate(nums,mid+1,hi);
            }
            return result;
        }
    }
    public int singleNonDuplicate(int[] nums) {
        int result = getNonDuplicate(nums,0,nums.length-1) ;
        return result;
    }
}
