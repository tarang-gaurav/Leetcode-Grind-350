class SolutionPowerNum{

    long power(int N,int R)
    {
        //Your code here
       
        long modulo=1000000000+7;
        if(R==0)
            return 1;
        else if (R==1)
            return N;
        else{
           long temp=power(N,R/2);
            temp=(temp*temp)%modulo;
            if(R%2!=0)
                return (temp*N)%modulo;
            return temp;


        }
     
        
    }
/**
 * Solution: Power after reversing a digit 
 * 
 * @param args
 */
    public static void main(String[] args){
        SolutionPowerNum s=new SolutionPowerNum();
        System.out.println(s.power(12, 21));
    }

}