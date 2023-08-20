import javax.swing.tree.TreeNode;

public class IsTreeBalanced {
    Node root; 

    public int dfsHeight(Node root){
        if (root==null) return 0;
        int l=dfsHeight(root.left);
        int r=dfsHeight(root.right);
        if(l==-1 || r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return Math.max(l,r)+1;
    }

    public boolean isBalanced(Node root) {
        if(dfsHeight(root)!=-1) 
            return true;
        else   
            return false;


    }

    boolean balancedTree(){return isBalanced(root);}

     public static void main(String[] args) {
        //Inserting value in tree 
        IsTreeBalanced pt = new IsTreeBalanced();    
        pt.root = new Node(1);    
        pt.root.left = new Node(2);    
        pt.root.right = new Node(3);    
        pt.root.left.left = new Node(4);    
        pt.root.left.right = new Node(5);       
        pt.root.right.left = new Node(6);    
        pt.root.right.right = new Node(7);      
       
        System.out.println(pt.balancedTree());
    }
}
