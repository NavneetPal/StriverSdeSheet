import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for(int val:arr)set.add(val);
        
        int maxStreak = 0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int streak = 1;
                while(set.contains(num+1)){
                    num=num+1  ;
                    streak++;
                }
                maxStreak = Math.max(streak,maxStreak);
            }
        }
        return maxStreak;
    }
}
