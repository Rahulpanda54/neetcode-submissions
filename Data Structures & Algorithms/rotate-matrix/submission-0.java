class Solution {

    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        col_reverse(matrix);

    }

    public void transpose(int matrix[][]){

        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void row_reverse(int matrix[][]){

        int n = matrix.length;

        for(int i=0; i<matrix.length/2; i++){
            for(int j=0; j<matrix[0].length; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i-1][j];
                matrix[n-i-1][j] = temp;

            }
        }
    }

    public void col_reverse(int matrix[][]){

        for(int i=0; i<matrix[0].length; i++){

            int st = 0;     int end = matrix[0].length-1;

            while(st < end){

                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;

                st++;  end--;
            }
        }
    }
}
