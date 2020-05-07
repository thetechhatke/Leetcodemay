/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int[] getLevel(TreeNode root, int x, int level, int parent)
    {
        if(root==null)
        {
            int[] result = {-1,-1};
            return result;    
        }
        if(x==root.val)
        {
            int[] result= {level,parent};
            return result;
        }
        else
        {
            int[] i = getLevel(root.left,x,level+1, root.val);
            int[] j = getLevel(root.right,x,level+1, root.val);
            if(i[0]!=-1)
                return i;
            else
                return j;
        }               
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] levelX = getLevel(root,x,0,root.val);
        int[] levelY = getLevel(root,y,0,root.val);
        if(levelX[0]==levelY[0] && levelX[1]!=levelY[1])
        {
            return true;
        }
        else
            return false;
    }
}
