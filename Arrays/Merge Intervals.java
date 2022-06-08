class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        ArrayList<int[]>res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<n;i++){
            int curBeg = intervals[i][0];
            int curEnd = intervals[i][1];
            if(end>=curBeg){
                //merge
                end = Math.max(end,curEnd);
            }else{
                res.add(new int[]{start,end});
                start = curBeg;
                end = curEnd;
            }
        }
        
        res.add(new int[]{start,end});
        
        return res.toArray(new int[res.size()][]);
        
    }
}