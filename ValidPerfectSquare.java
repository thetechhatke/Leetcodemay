class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1, h=num;
        int prev=-1;
        while(l<=h)
        {
            int mid = l+(h-l)/2; //(l+h)/2
            if(prev==mid)
                return false;
            long mul = (long)mid*mid;
            if(mul==num)
                return true;
            else if(mul<num)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
            prev = mid;
        }
        return false;
    }
}

