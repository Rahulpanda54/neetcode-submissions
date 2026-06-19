class Solution {

    public int countComponents(int V, int[][] edges) {
         
         List<List<Integer>> adj  = new ArrayList<>();

         int count = 0;

         for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
         }

         boolean vis[] = new boolean[V];

         for(int i=0; i<edges.length; i++){

            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);

         }

         for(int i=0; i<vis.length; i++){

            if(vis[i] == false){

                dfs(i, vis, adj);

                count++;
            }
         }

         return count;
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



