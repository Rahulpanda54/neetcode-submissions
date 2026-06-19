class Solution {
    public int findCircleNum(int[][] isConnected) {

        List<List<Integer>> adj = new ArrayList<>();

        int province = 0;
        
        int n = isConnected.length;     int m = isConnected[0].length;

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        boolean vis[] = new boolean[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(isConnected[i][j] == 1){
                   adj.get(i).add(j);
                }
            }
        }
        
        for(int i=0; i<vis.length; i++){

            if(vis[i] == false){

                dfs(i, vis, adj);

                province++;
            }
        }

        return province;

    }

    public void dfs(int node, boolean vis[], List<List<Integer>> adj){

        vis[node] = true;

        for(int i : adj.get(node)){

            if(vis[i] == false){

                dfs(i, vis, adj);
            }
         }
     }
 }
