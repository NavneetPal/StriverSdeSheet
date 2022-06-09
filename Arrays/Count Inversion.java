import java.util.* ;
import java.io.*; 
public class Solution {
    static long mergeSort(long arr[],long temp[],int st,int en){
        if(st==en) return 0;
         long invCount = 0;
         int mid = st + (en-st)/2;
        invCount+= mergeSort(arr,temp,st,mid);
        invCount+=mergeSort(arr,temp,mid+1,en);
        invCount+=merge(arr,temp,st,mid,en);
        return invCount;
    }
    static long merge(long arr[],long temp[],int st,int mid,int en){
        int i = st;
        int j = mid+1;
        int k = st;
        long invCount = 0;
        while(i<=mid && j<=en){
            if(arr[i]>arr[j]){
                invCount+=1+mid-i;
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
    public static long getInversions(long arr[], int n) {
        long temp[] = new long[n];
        return mergeSort(arr,temp,0,n-1);
    }
}