import javax.swing.tree.TreeNode;

public class CountGoodNodes {
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

    private int helper(TreeNode root,int maxV){
        if(root==null) return 0;
        int res;
        if(root.val>=maxV) res=1;
        else res=0;
        maxV=Math.max(maxV,root.val);
        res=res+helper(root.left,maxV);
        res=res+helper(root.right,maxV);
        return res;
    }
    public int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);
    }

}
