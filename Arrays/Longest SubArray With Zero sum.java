import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0,maxi = 0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum==0){
                maxi = Math.max(maxi,i+1);
            }else{
                if(map.containsKey(sum)){
                    maxi = Math.max(maxi,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }   
            }
        }
        return maxi;
	}
}