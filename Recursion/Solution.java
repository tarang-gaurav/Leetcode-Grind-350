class Solution{


    void printRecursion(int x){
        if(x==0)
        {
            return;
        }else{
            System.out.println("Code");
            printRecursion(x-1);
        }

        
    }

    public static void main(String[] args){
        Solution s=new Solution();
        System.out.println("Welcome!!!");
        s.printRecursion(5);

    }

}