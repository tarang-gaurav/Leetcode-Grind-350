class Solution {


/** String tempS=s.toLowerCase();
        tempS=tempS.replaceAll("[^a-zA-Z0-9]", "");
        int size=tempS.length();
       
            for(int i=0,j=size-1;i<size/2;i++,j--){
                if(tempS.charAt(i)==tempS.charAt(j)){
                    continue;
                }
                else
                    return false;
        }
        return true; */
    private boolean helper(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return helper(i+1,s);
    }
    public boolean isPalindrome(String s) {
        String tempS=s.toLowerCase();
        tempS=tempS.replaceAll("[^a-zA-Z0-9]", "");
        Solution sObj=new Solution();
        return sObj.helper(0,tempS);
    }
}
