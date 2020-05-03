//This is a solution in Java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        int[] lookup = new int[64];
        for(int i=0; i<n; i++)
        {
            if(lookup[(int)magazine.charAt(i)-64]==0)
                lookup[(int)magazine.charAt(i)-64] = 1;
            else
                lookup[(int)magazine.charAt(i)-64]++;
        }
        for(int i=0; i<m; i++)
        {
            if(lookup[(int)ransomNote.charAt(i)-64]<=0)
                return false;
            else
                lookup[(int)ransomNote.charAt(i)-64]--;
        }
        return true;
    }
}
