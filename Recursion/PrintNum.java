public class PrintNum {
    
    int printNumRecursion(int i,int N){
        if(i==N){
            return N ;
        }
        else{
            System.out.println(i);
           return printNumRecursion(i+1,N);
        }


    }

    public static void main(String[] args){
        PrintNum s=new PrintNum();
        System.out.println("Welcome!!!");
        System.out.println(s.printNumRecursion(1,10));

    }

}
