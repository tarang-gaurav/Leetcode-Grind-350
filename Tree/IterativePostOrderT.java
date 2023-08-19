import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrderT {

        Node root;  
        //Iterative Solution
    public List<Integer> postorderTraversal(Node root) {
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();
        List<Integer>postList=new ArrayList<>();
        if(root!=null){
            s1.push(root);
        }
        while(!s1.isEmpty()){
            root=s1.peek();
            s1.pop();
            s2.push(root);
            if(root.left!=null) {
                s1.push(root.left);
            }
            if(root.right!=null){
                s1.push(root.right);
            }
        }
        while(!s2.isEmpty()){
            postList.add(s2.peek().data);
            s2.pop();
        }
        return postList;
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
