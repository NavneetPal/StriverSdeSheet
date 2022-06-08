class Solve {
    int[] findTwoElement(int arr[], int n) {
        int xor = 0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
            xor^=i+1;
        }

        int rsb = xor & -xor;
        int set = 0 ,notSet = 0;

        for(int i=0;i<n;i++){
            int val = arr[i];
            if((rsb & val) == 0){
                notSet ^= val;
            }else{
                set ^= val;
            }
        }

        for(int i=1;i<=n;i++){
            if((rsb & i) == 0){
                notSet^=i;
            }else{
                set^=i;
            }
        }

        int repeating = 0,missing = 0;
        for(int val:arr){
            if(val == set){
                repeating = set;
                missing = notSet;
            }else if(val == notSet){
                repeating = notSet;
                missing = set;
            }
        }
        
        return new int[]{repeating,missing};
    }
}