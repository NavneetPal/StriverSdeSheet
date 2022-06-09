import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
	    int i=0,j=n-1;
        while(i<m && j>=0){
            if(mat.get(i).get(j)<target){
                i++;
            }else if(mat.get(i).get(j)>target){
                j--;
            }else{
                return true;
            }
        }
        return false;
	}
}

