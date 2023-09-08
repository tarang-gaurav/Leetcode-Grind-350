import java.util.*;
public class VerticalLevelT {
  
    class Tuple{
        Node node;
        int row;
        int col;

        Tuple(Node n,int r,int c){
            this.node=n;
            this.row=r;
            this.col=c;

        }
    }


    public List<List<Integer>>getVerticalLevelOrderT(Node root){
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple t=q.poll();
            Node n=t.node;
            int x=t.row;
            int y=t.col;

            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(n.data);
            if(n.left!=null){
                q.offer(new Tuple(n.left, x-1, y+1));
            }
            if(n.right!=null){
                q.offer(new Tuple(n.right, x+1, y+1));
            }


        }

        List<List<Integer>>list=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> outerMap: map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> pQ: outerMap.values()){
                while(!pQ.isEmpty()){
                    list.get(list.size()-1).add(pQ.poll());
                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Test");
    }
}
