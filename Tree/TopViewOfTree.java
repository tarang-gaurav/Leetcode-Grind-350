import java.util.*;

public class TopViewOfTree {
    
    class Pair{
        Node temp;
        int hd=0;


        Pair(Node r,int d){ 
            this.temp=r;
            this.hd=d;

        }
    }

    Node root;

    public ArrayList<Integer> getTopView(Node root){
        //code
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer>resMAp=new TreeMap<>();
        Queue<Pair>q= new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node n=p.temp;
            int dist=p.hd;
            if(!resMAp.containsKey(dist)){
                resMAp.put(dist, n.data);
            }

            if(n.left!=null){
                q.offer(new Pair(n.left, dist-1));
            }
            if(n.right!=null){
                q.offer(new Pair(n.right, dist+1));
            }
        }

        for(Integer i : resMAp.values()){
            ans.add(i);
        }
        return ans;


    }

    public  ArrayList<Integer>getTop(){return getTopView(root);}


     public static void main(String[] args) {
        //Inserting value in tree 
        TopViewOfTree pt = new TopViewOfTree();    
        pt.root = new Node(1);    
        pt.root.left = new Node(2);    
        pt.root.right = new Node(3);    
        pt.root.left.left = new Node(4);    
        pt.root.left.right = new Node(5);       
        pt.root.right.left = new Node(6);    
        pt.root.right.right = new Node(7);      
        ArrayList<Integer>res=pt.getTop();
        System.out.println(res.size());
    }


}
