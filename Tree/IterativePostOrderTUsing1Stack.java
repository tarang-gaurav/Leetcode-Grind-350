    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

    public class IterativePostOrderTUsing1Stack {
       
        Node root;  
            //Iterative Solution
        public List<Integer> postorderTraversal(Node root) {
            Stack<Node>s1=new Stack<>();          
            List<Integer>postList=new ArrayList<>();

            while(root!=null || !s1.isEmpty()){

                if(root!=null){
                    s1.push(root);
                    root=root.left;
                }
                else{
                    Node temp=s1.peek().right;
                    if(temp==null){
                        temp=s1.peek();
                        s1.pop();
                        postList.add(temp.data);
                        while(!s1.isEmpty() && temp==s1.peek().right){
                            temp=s1.peek();
                            s1.pop();
                            postList.add(temp.data);
                        }
                    }
                    else{
                        root=temp;
                    }
                    
                }
                
            }
          return postList;
        }

        List<Integer>postOrder(){return postorderTraversal(root);}

        public static void main(String[] args) {
            //Inserting value in tree 
            IterativePostOrderTUsing1Stack pt = new IterativePostOrderTUsing1Stack();    
            Node n=new Node();
            pt.root = new Node(1);    
            pt.root.left = new Node(2);    
            pt.root.right = new Node(3);    
            pt.root.left.left = new Node(4);    
            pt.root.left.right = new Node(5);    
            pt.root.right.left = new Node(6);    
            pt.root.right.right = new Node(7);     
            List<Integer>res=pt.postOrder();
            System.out.println(res.toString());
        }
    }
