public class MaxPathSum {
    Node root; 

    int maxi=Integer.MIN_VALUE;

    int maxPath(Node root,int[] maxV){
        if(root==null)
            return 0;
        int l=Math.max(0,maxPath(root.left, maxV));
        int r=Math.max(0,maxPath(root.right,maxV));
        maxV[0]=Math.max(maxV[0], l+r+root.data);
        return root.data+Math.max(l,r);
    }

    int findD(Node root){
        int[] maxV=new int[1];
        maxPath(root,maxV);
        return maxV[0];
    }
    int solution(){return findD(root);}

     public static void main(String[] args) {
        //Inserting value in tree 
        MaxPathSum pt = new MaxPathSum();    
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
