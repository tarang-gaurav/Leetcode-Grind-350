import java.util.ArrayList;
import java.util.List;
public class InOrderT {
    
Node root;  
    //Recursive
    public List<Integer> inOrderTraversal(Node root) {
        if(root==null)
            return new ArrayList<>();

        List<Integer>intOrderList=new ArrayList<>();
        intOrderList.addAll(inOrderTraversal(root.left));
        intOrderList.add(root.data);
        intOrderList.addAll(inOrderTraversal(root.right));

        return intOrderList;
    }

    List<Integer>inOrder(){return inOrderTraversal(root);}

    public static void main(String[] args) {
        //Inserting value in tree 
        InOrderT pt = new InOrderT();    
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



