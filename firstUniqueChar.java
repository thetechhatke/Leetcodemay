class Solution {
    public int firstUniqChar(String s) {
        int[] ch = new int[128];
        for(int i=0; i<s.length(); i++)
        {
            ch[(int)s.charAt(i)]++;
        }
        for(int i=0; i<s.length(); i++)
        {
            if(ch[(int)s.charAt(i)]==1)
                return i;
        }
        return -1;
    }
          
}
