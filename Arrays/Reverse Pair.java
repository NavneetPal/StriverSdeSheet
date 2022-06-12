class Solution {
    static int mergeSort(int arr[],int temp[],int st,int en){
        if(st==en) return 0;
        int invCount = 0;
        int mid = st + (en-st)/2;
        invCount+= mergeSort(arr,temp,st,mid);
        invCount+=mergeSort(arr,temp,mid+1,en);
        invCount+=merge(arr,temp,st,mid,en);
        return invCount;
    }
    static int merge(int arr[],int temp[],int st,int mid,int en){
        int i = st;
        int j = mid+1;
        int k = st;
        int invCount = 0;
        
        for(i=st;i<=mid;i++){
            while(j<=en && (long)arr[i]>(long)arr[j]*2){
                j++;
            }
            invCount += j- (mid+1);
        }
        
        i=st;
        j=mid+1;
        
        while(i<=mid && j<=en){
            if(arr[i]>arr[j]){
                temp[k++] = arr[j++];
            }else{
                temp[k++] = arr[i++];
            }
        }
        
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        
        while(j<=en){
            temp[k++] = arr[j++];
        }
        
        for(int m =st;m<=en;m++){
            arr[m] = temp[m];
        }
        return invCount;
    }
    public int reversePairs(int[] nums) {
        int n =nums.length;
        int temp[] = new int[n];
        return mergeSort(nums,temp,0,n-1);
    }
}