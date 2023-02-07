class Solution {
    public void dfs(int source,boolean[] visited,List<List<Integer>> rooms){
        visited[source]=true;
        for(int neigh:rooms.get(source)){
            if(!visited[neigh]){
                dfs(neigh,visited,rooms);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0,visited,rooms);
        for(int i=0;i<rooms.size();i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}
