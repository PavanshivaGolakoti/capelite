class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<Pair> queue = new LinkedList();
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2)
                    queue.add(new Pair(i,j));
            }
        }
        int[] offsetr = {-1,0,1,0};
        int[] offsetc = {0,1,0,-1};
        int time=0;
        int k=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int j=0;j<size;j++){
                Pair cur  = queue.poll();
                int r =(Integer)cur.getKey();
                int c =(Integer)cur.getValue();
                for(int i = 0;i<4;i++){
                    int nr = r+ offsetr[i];
                    int nc  = c+ offsetc[i];
                    if(nr<0 || nc<0 || nc>=cols || nr>=rows){
                        continue;
                    }
                    if(grid[nr][nc]==1){
                        queue.add(new Pair(nr,nc));
                        grid[nr][nc]=2;                    }
                }
            }
            if(k==0) k++;
            else time++;
            
        }
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return time;
        
    }
}
