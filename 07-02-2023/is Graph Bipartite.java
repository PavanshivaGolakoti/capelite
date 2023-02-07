class Solution {
    public boolean isBipartite(int[][] graph) {
        int vertices = graph.length;
        List<List<Integer>> adjlist = new ArrayList<>();
        for(int i=0;i<vertices;i++) adjlist.add(new ArrayList<Integer>());
        for(int i=0;i<vertices;i++){
            for(int j=0;j<graph[i].length;j++){
                adjlist.get(i).add(graph[i][j]);
            }
        }
        int[] visited = new int[vertices];
        Arrays.fill(visited,-1);
        for(int i=0;i<vertices;i++){
            if(visited[i]==-1){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i]=0;
                while(!q.isEmpty()){
                    int cur = q.poll();
                    for(int neigh: adjlist.get(cur)){
                        if(visited[neigh]==-1){
                            visited[neigh]=1+visited[cur];
                            q.add(neigh);
                        }
                    else if(visited[cur]==visited[neigh]) return false;
                    }
                }
            }
        }
        
        return true;
    }
}
