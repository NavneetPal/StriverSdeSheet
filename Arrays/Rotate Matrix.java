class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse the column
        for(int i=0;i<matrix.length;i++){
            int lw = 0;
            int hi = matrix[0].length-1;
            while(lw<hi){
                //swap matrix[i][lw] and matrix[i][hi]
                int temp = matrix[i][lw];
                matrix[i][lw] = matrix[i][hi];
                matrix[i][hi] = temp;
                lw++;
                hi--;
            }
        }
    }
}
