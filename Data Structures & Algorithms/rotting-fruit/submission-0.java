class Solution {

    public int orangesRotting(int[][] grid) {

        if(grid.length == 0 || grid == null){
            return -1;
        }

        int rows = grid.length;   int cols = grid[0].length; 

        int time[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                if(grid[i][j] == 2){

                    dfs(grid, time, i, j, 0);
                }
            }
        }

        int timerequired = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                if(grid[i][j] == 1){

                    if(time[i][j] == Integer.MAX_VALUE){
                        return -1;
                    }

                    timerequired = Math.max(timerequired, time[i][j]);
                }
            }
        }

        return timerequired;
    }

    public void dfs(int grid[][], int time[][], int i,  int j, int currtime){

        int n = grid.length;   int m = grid[0].length;

        if(i < 0 || i >= n || j < 0 || j >= m || currtime >= time[i][j] || grid[i][j] == 0){
            return;
        }

        time[i][j] = currtime;

        dfs(grid, time, i+1, j, currtime+1);
        dfs(grid, time, i-1, j, currtime+1);
        dfs(grid, time, i, j+1, currtime+1);
        dfs(grid, time, i, j-1, currtime+1);

    }
}
