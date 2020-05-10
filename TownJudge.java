class Solution {
    public int findJudge(int N, int[][] trust) {
        int n = trust.length;
        int[] judge = new int[N+1];
        int candidate=-1;
        Arrays.fill(judge,1);
        for(int i=0;i<n;i++)
        {
            judge[trust[i][0]] = 0;
        }
        for(int i=1; i<=N; i++)
        {
            if(judge[i]==1)
            {
                candidate = i;
                break;
            }
        }
        if(candidate==-1)
        {
            return candidate;   
        }
        int count = 0;
        for(int i=0; i<n; i++)
        {   
            if(trust[i][1]==candidate)
            {
                count++;
            }
        }
        if(count==N-1)
            return candidate;
        else
            return -1;
    }
}
