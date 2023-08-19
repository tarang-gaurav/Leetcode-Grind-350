public class FreqOfElemLimited {
    
    private void countFreq(int[] arr,int N,int P){
        int[] hashArray=new int[5];

        for(int i=1;i<=P;i++){
                if(arr[i]>N) 
                continue;
            hashArray[arr[i]]++;
        }

        System.out.println(hashArray);
    }

    public static void main(String[]args){
            FreqOfElemLimited f=new FreqOfElemLimited();
            int[] arr={2,3,2,4,5};
            f.countFreq(arr, 5, 5);
    }

}
