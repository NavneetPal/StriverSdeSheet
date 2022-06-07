class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean isCol = false;
        
        //making the first row and col to be 0 so that we can used them as our booleans
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                isCol = true;
            }
            
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        //using first row and col making other entry 0
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0] ==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        //Now we checking if the first row can be  0 or not
        if(matrix[0][0]==0){
            for(int j=1;j<m;j++){
                matrix[0][j] = 0;
            }
        }
        
        
        //Checking if the first col ill be 0 r not
        if(isCol==true){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
    }
}public interface Set Matrix Zeroes {
    
}
