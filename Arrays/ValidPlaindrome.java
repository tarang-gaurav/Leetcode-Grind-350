public class ValidPlaindrome {
    

        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
    private boolean isValidPalindrome(String s){
        String tempS=s.toLowerCase();
        tempS=tempS.replaceAll("[^a-zA-Z0-9]", "");
        int size=tempS.length();
       
            for(int i=0,j=tempS.length()-1;i<size/2;i++,j--){
                if(tempS.charAt(i)==tempS.charAt(j)){
                    continue;
                }
                else
                    return false;
        }
        return true;
       
        
    }

    public static void main(String args[]){
        ValidPlaindrome p=new ValidPlaindrome();
        System.out.println(ValidPlaindrome.isValidPalindrome("A man, a plan, a canal: Panama"));
    }
}
