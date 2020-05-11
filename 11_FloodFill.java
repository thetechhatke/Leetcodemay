class Solution {
    public void fillRec(int[][] image, int sr, int sc, int newColor, int tempColor, int rows, int cols)
    {
        if(sr>rows-1 || sr<0)
            return;
        if(sc>cols-1 || sc<0)
            return;
        if(image[sr][sc]==newColor)
            return;
        else if(image[sr][sc]!=tempColor)
        {
            return;
        }
        else
        {
            image[sr][sc]=newColor;
            fillRec(image,sr+1,sc,newColor,tempColor,rows,cols);
            fillRec(image,sr,sc+1,newColor,tempColor,rows,cols);
            fillRec(image,sr,sc-1,newColor,tempColor,rows,cols);
            fillRec(image,sr-1,sc,newColor,tempColor,rows,cols);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        int tempColor = image[sr][sc];
        fillRec(image,sr,sc,newColor,tempColor,rows,cols);
        return image;
    }
}
