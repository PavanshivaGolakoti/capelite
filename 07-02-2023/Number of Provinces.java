class Solution {
    public int findCircleNum(int[][] isConnected) {
        int vertices = isConnected.length;
        List<List<Integer>> adjlist = new ArrayList<>();
        for(int i =0;i<vertices;i++)
            adjlist.add(new ArrayList<Integer>());
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                if(i!=j && isConnected[i][j]==1)
                    adjlist.get(i).add(j);
            }
        }
        boolean[] visited = new boolean[vertices];
        Arrays.fill(visited,false);
        int res=0;
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                dfs(i,visited,adjlist);res++;}            
        }
        return res;
        
        
    }
    public void dfs(int source,boolean[] visited,List<List<Integer>> adjlist){
        visited[source]=true;
        for(int neigh: adjlist.get(source)){
            if(!visited[neigh])
                dfs(neigh,visited,adjlist);
        }
    }
}
