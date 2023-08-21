public class DiameterOfTree {
    Node root; 

    int maxi=Integer.MIN_VALUE;

    int maxDiameter(Node root){
        if(root==null)
            return 0;
        int l=maxDiameter(root.left);
        int r=maxDiameter(root.right);
        maxi=Math.max(maxi, l+r);
        return 1+Math.max(l,r);
    }

    int findD(Node root){
        maxDiameter(root);
        return maxi;
    }
    int solution(){return findD(root);}

     public static void main(String[] args) {
        //Inserting value in tree 
        DiameterOfTree pt = new DiameterOfTree();    
        pt.root = new Node(1);    
        pt.root.left = new Node(2);    
        pt.root.right = new Node(3);    
        pt.root.left.left = new Node(4);    
        pt.root.left.right = new Node(5);       
        pt.root.right.left = new Node(6);    
        pt.root.right.right = new Node(7);      
       
        System.out.println(pt.solution());
    }
}
