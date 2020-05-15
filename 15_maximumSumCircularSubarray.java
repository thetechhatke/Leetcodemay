class Solution {
    public boolean chkNegative(int[] A, int n)
    {
        for(int i=0; i<n; i++)
            if(A[i]>=0)
                return false;
        return true;
    }
    public int maxSubarraySumCircular(int[] A) {
        int maxSum = Integer.MIN_VALUE, invertedSum = maxSum;
        int sum = 0,wrap=0;
        int n = A.length;
        if(chkNegative(A,n))
        {
            for(int i=0; i<n; i++)
            {
               if(A[i]>maxSum)
                   maxSum=A[i];
            }
            return maxSum;
        }
        for(int i = 0; i<n; i++)
        {  
            sum+=A[i];
            wrap+=A[i];
            A[i]=-A[i];
            if(sum>maxSum)
                maxSum=sum;
            if(sum<0)
                sum=0;
        }
        sum=0;
        for(int i = 0; i<n; i++)
        {  
            sum+=A[i];
            if(sum>invertedSum)
                invertedSum=sum;
            if(sum<0)
                sum=0;   
        }
        return maxSum>wrap+invertedSum? maxSum : wrap+invertedSum;
    }
}
