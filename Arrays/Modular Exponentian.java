import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        long res = 1;
        long xx = x;
        while(n>0){
            if(n%2==1){
                res = (res * (xx%m))%m;
                n = n-1;
            }else{
                xx = (xx%m * xx%m)%m;
                n = n/2;
            }
        }
        
        return (int)res%m;
    }
}