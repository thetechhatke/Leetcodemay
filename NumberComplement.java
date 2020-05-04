class Solution {
    public int findComplement(int num) {
        int complement = 0;
        int count = 0;
        while(num>0)
        {
            int rem = num%2;
            complement = complement + (1-rem)*(int)Math.pow(2,count);
            num = num/2;
            count++;
        }
        return complement;
    }
}
