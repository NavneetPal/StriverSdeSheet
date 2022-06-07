class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        //finding fist decreasing element
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        //condition to check if more than two element are given if size 1 then i = -1 and j=0
        if(i>=0){
            //then finding next greater
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            //swap i and j th element
            swap(nums,i,j);
        }
        //reverse
        reverse(nums,i+1,n-1);
    }
    
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int nums[],int i ,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    
}

/*
LOGIC: 
1.finding first decresing element from end
2.find just greater element then the firs decreasing element
3.swap the numbers
4 reverse from that index+1

123   
132
213
231
312
321 ==> sequene is descending order ( NO NEXT PERMUTATION POSSIBLE ) SO JUST REVERSE IT

115
151 ->decreasing order mae hae
511


*/
