public class Power {
    
    private double helper(double x,long n){
       
        if(n==0) return 1;
        if(n<0){
            return helper(1/x,-n);
        }
        return (n%2==0) ? helper(x*x,n/2) : x*helper(x*x,n/2);
    }

    public static void main(String[] args) {
        Power p=new Power();
        System.out.println(p.helper(2,-2));
    }
}
