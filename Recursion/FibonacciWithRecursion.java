import java.util.Hashtable;

public class FibonacciWithRecursion {

    int fibonacciUsingMemorization(int n){
        Hashtable<Integer,Integer>dict=new Hashtable<>();
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else{
           if(dict.contains(n)){
            return dict.get(n);
           }
            int temp=fibonacci(n-1)+fibonacci(n-2);
            dict.put(n,temp);
            return temp;
        }
    }

    int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else{
            int temp=fibonacci(n-1)+fibonacci(n-2);
            return temp;
        }
    }
//0 1 1 2 3 5 8 13 21
    public static void main(String[] args){
        FibonacciWithRecursion s=new FibonacciWithRecursion();
        System.out.println(s.fibonacci(5));
    }
    
}
