import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    
    //root node
     Node root;  
//Recursive Solution
    public List<Integer> postorderTraversal(Node root) {
        if(root==null)
            return new ArrayList<>();

        List<Integer>postOrderList=new ArrayList<>();
        postOrderList.addAll(postorderTraversal(root.left));
        postOrderList.addAll(postorderTraversal(root.right));
        postOrderList.add(root.data);
         return postOrderList;
    }

    List<Integer>postOrder(){return postorderTraversal(root);}

    public static void main(String[] args) {
        //Inserting value in tree 
        PostOrderTraversal pt = new PostOrderTraversal();    
        Node n=new Node();
        pt.root = new Node(1);    
        pt.root.left = new Node(2);    
        pt.root.right = new Node(3);    
        pt.root.left.left = new Node(4);    
        pt.root.left.right = new Node(5);    
        pt.root.left.left.left = new Node(6);    
        pt.root.left.left.right = new Node(7);    
        pt.root.right.left = new Node(8);    
        pt.root.right.right = new Node(9);    
        pt.root.right.right.left = new Node(10);    
        pt.root.right.right.right = new Node(11);   
        List<Integer>res=pt.postOrder();
        System.out.println(res.toString());
    }
}
