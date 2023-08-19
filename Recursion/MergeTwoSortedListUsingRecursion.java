public class MergeTwoSortedListUsingRecursion {
    


    public class ListNode {
             int val;
             ListNode next;
             ListNode() {

             }
             ListNode(int val) { 
                this.val = val;
             }
            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
                 }
        }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        return null;
    }
    public static ListNode insert(ListNode list, int data) 
    { 
        // Create a new node with given data 
        ListNode new_node = new ListNode(data); 
          
    
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
    
        // Return the list by head 
        return list; 
    } 
    public static void main(String []args){
        
        MergeTwoSortedListUsingRecursion m=new MergeTwoSortedListUsingRecursion();
        ListNode l1=new ListNode();

            m.mergeTwoLists(null, null)
    }
}
