class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows = image.length;
        int cols = image[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        int k = image[sr][sc];
        image[sr][sc]=color;
        int[] offsetr = {-1,0,1,0};
        int[] offsetc = {0,1,0,-1};
        while(!q.isEmpty()){
            int s = q.size();
            for(int j=0;j<s;j++){
                Pair cur = q.poll();
                int r = (Integer)cur.getKey();
                int c = (Integer)cur.getValue();
                for(int i=0;i<4;i++){
                    int nr = r+offsetr[i];
                    int nc = c+offsetc[i];
                    if(nr<0 || nc<0 || nc>=cols || nr>=rows){
                        continue;}
                    if(color!=image[nr][nc]){
                    if(k==image[nr][nc]){
                        q.add(new Pair(nr,nc));
                        image[nr][nc]=color;}}
                    
                }
            }
        }
        
    
    return image;
}
}
