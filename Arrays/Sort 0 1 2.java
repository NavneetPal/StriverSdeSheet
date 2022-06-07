import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int cur =0,i=0,j=arr.length-1;
        while(cur<=j){
            if(arr[cur]==1){
                cur++;
            }else if(arr[cur]==0){
                swap(arr,i,cur);
                i++;
                cur++;
            }else{
                swap(arr,j,cur);
                j--;
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
/*
0 1 2

cur=2  //for 1 do nothing cur++
i=1     j= 3
//for 0
swap with i indx
i++
cur++

//for 1 do nothing cur++;

//for 2 
swap with j index 
j--
*/
