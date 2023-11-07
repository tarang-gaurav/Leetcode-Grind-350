package Stacks;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StackImplUsingArrayList {
    // push(): Insert the element in the stack.
    //pop(): Remove and return the topmost element of the stack.
    //top(): Return the topmost element of the stack
    //size(): Return the number of remaining elements in the stack.


    public static void main(String[] args) {
      
        StackImplUsingArrayList s=new StackImplUsingArrayList();
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        s.push(4, list);
        System.out.println(list);
        //System.out.println(s.pop(list));
    }
}
