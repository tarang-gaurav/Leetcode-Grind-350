import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepth {
        
 Node root; 

    int maxDepth(Node root){
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }

    int height(){return maxDepth(root);}

     public static void main(String[] args) {
        //Inserting value in tree 
        MaxDepth pt = new MaxDepth();    
        pt.root = new Node(1);    
        pt.root.left = new Node(2);    
        pt.root.right = new Node(3);    
        pt.root.left.left = new Node(4);    
        pt.root.left.right = new Node(5);       
        pt.root.right.left = new Node(6);    
        pt.root.right.right = new Node(7);      
       
        System.out.println(pt.height());
    }
}
