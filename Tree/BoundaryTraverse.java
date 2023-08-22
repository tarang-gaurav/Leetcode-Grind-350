import java.util.ArrayList;
import java.util.List;

public class BoundaryTraverse {

    Node root;

    static boolean isLeaf(Node root){
        if(root.left==null && root.right==null)
            return true;
        else
            return false;
    }

    static void addLeftBoundary(Node root,List<Integer>ans){
        Node temp=root.left;
        while(temp!=null){
            if(isLeaf(temp)==false){
                ans.add(temp.data);
            }
            if(temp.left!=null){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
    }

    static void addRightBoundary(Node root,List<Integer>ans){
        List<Integer>tempList=new ArrayList<>();
        Node temp=root.right;
        while(temp!=null){
            if(isLeaf(temp)==false){
                tempList.add(temp.data);
            }
            if(temp.right!=null){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        for(int i=tempList.size()-1;i>=0;i--){
            ans.add(tempList.get(i));
        }
    }

    static void addLeafNodes(Node root,List<Integer>ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left!=null) addLeafNodes(root.left, ans);
        if(root.right!=null) addLeafNodes(root.right, ans);
    }

    static ArrayList < Integer > printBoundary(Node node) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (isLeaf(node) == false) {
            ans.add(node.data);
        }
        addLeftBoundary(node, ans);
        addLeafNodes(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    public static void main(String[] args) {
    Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList < Integer > boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

    }
}
