import javax.swing.tree.TreeNode;

public class IsTwoTreeIdentical {
    
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
    Node p,q;
    public boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        return ((p.data==q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }


}
