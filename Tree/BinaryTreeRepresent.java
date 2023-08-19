class Node{
///Representation of Tree
    int data;
    Node left;
    Node right;

    public Node(){}
    Node(int data) { this.data = data; }
    Node(int data, Node left, Node right) {
          this.data = data;
          this.left = left;
          this.right = right;
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
    }

}