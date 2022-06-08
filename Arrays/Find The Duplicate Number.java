class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0],slow=nums[0];
        
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast!=slow);
        
        slow=nums[0];
        
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
/*
size = 5 [1,2,2,4,5,6] return 2
     1.Sorting -0(nlogn)
     2.Set - O(n)
     3.Floyd Warshall
     
     First of all, where does the cycle come from? Let's use the function f(x) = nums[x] to construct the sequence: x, nums[x], nums[nums[x]], nums[nums[nums[x]]], ....
     
     The cycle appears because nums contains duplicates. The duplicate node is a cycle entrance.
*/