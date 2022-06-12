class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int target2 = target-(nums[i]+nums[j]);
                int lo=j+1,hi=n-1;
                
                while(lo<hi){
                    int twoSum = nums[lo]+nums[hi];
                    if(twoSum>target2){
                        hi--;
                    }else if(twoSum<target2){
                        lo++;
                    }else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[lo]);
                        quad.add(nums[hi]);
                        res.add(quad);
                           
                        while(lo<hi && nums[lo]==nums[lo+1])lo++;
                        while(lo<hi && nums[hi]==nums[hi-1])hi--;
                        
                        lo++;
                        hi--;
                    }
                }
                
                while(j+1<n && nums[j]==nums[j+1])j++;
            }
            while(i+1<n && nums[i]==nums[i+1])i++;
        }
        
        return res;
    }
}