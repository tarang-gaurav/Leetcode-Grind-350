import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInOrderT {
    
    
    //root node
     Node root;  
    //Iterative Solution
    public List<Integer> inOrderTraversal(Node root) {
       Stack<Node>st=new Stack<>();
       List<Integer>inOrderList=new ArrayList<>();
       while(true){
        if(root==null){
            if(st.isEmpty()){
                break;
            }
            else{
                root=st.peek();
                inOrderList.add(root.data);
                st.pop();
                root=root.right;
            }
        }
        else{
            st.push(root);
            root=root.left;
        }
       }
       return inOrderList;

    }

    List<Integer>inOrder(){return inOrderTraversal(root);}

    public static void main(String[] args) {
        //Inserting value in tree 
        IterativeInOrderT pt = new IterativeInOrderT();    
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
        List<Integer>res=pt.inOrder();
        System.out.println(res.toString());
    }
}
