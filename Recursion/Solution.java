class Solution{


    void printRecursion(int N){
        int i=1;
        if(i==N)
        {
            return;
        }else{          
            System.out.println(i);
            printRecursion(i+1);
        }

        
    }

    public static void main(String[] args){
        Solution s=new Solution();
        System.out.println("Welcome!!!");
        s.printRecursion(12);

    }

}