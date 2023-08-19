import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class LevelOrderT {
    
 Node root;  

    public List<List<Integer>> levelOrderTraversal(Node root) {
       
        List<List<Integer>>resList=new ArrayList<>();
        if(root==null)
            return new ArrayList<>();

        Queue<Node>queue=new LinkedList<>();
        List<Integer>wrapperL=null;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
             wrapperL=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);

                wrapperL.add(queue.poll().data);
            
            }
             resList.add(wrapperL);
           
        }
       
        return resList;


       
        
    }

    List<List<Integer>>levelOrder(){return levelOrderTraversal(root);}


     public static void main(String[] args) {
        //Inserting value in tree 
        LevelOrderT pt = new LevelOrderT();    
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
        List<List<Integer>>res=pt.levelOrder();
        System.out.println(res.toString());
    }


}
