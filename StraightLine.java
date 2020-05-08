class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n==2)
            return true;
        else
        {
            float slope = ((float)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]));
            for(int i=2; i<n; i++)
            {
                if(slope!=((float)(coordinates[i][1]-coordinates[0][1])/(coordinates[i][0]-coordinates[0][0])))
                    return false;
            }
            return true;
        }
    }
}
