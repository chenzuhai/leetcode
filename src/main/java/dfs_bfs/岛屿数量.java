package dfs_bfs;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/25
 */
public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0)return 0;
        int res = 0;
        int nr = grid.length;
        int nc = grid[0].length;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if(grid[i][j]=='1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int r,int c){
        int nr = grid.length;
        int nc = grid[0].length;

        if(r>nr-1||c>nc-1||r<0||c<0)return;

        grid[r][c] ='0';

        if(r+1<nr&&grid[r+1][c]=='1')dfs(grid,r+1,c);
        if(c+1<nc&&grid[r][c+1]=='1')dfs(grid,r,c+1);
        if(r-1>=0&&grid[r-1][c]=='1')dfs(grid,r-1,c);
        if(c-1>=0&&grid[r][c-1]=='1')dfs(grid,r,c-1);
    }


//    public int numIslands(char[][] grid) {
//        if(grid==null||grid.length==0)return 0;
//        int nrow = grid.length;
//        int ncol = grid[0].length;
//        int res=0;
//        for (int r = 0; r < nrow; r++) {
//            for (int c = 0; c < ncol; c++) {
//                if(grid[r][c]=='1'){
//                    res++;
//                    dfs(grid,r,c);
//                }
//            }
//        }
//        return res;
//    }
//    public void dfs(char[][] grid,int r,int c){
//        int nr = grid.length;
//        int nc = grid[0].length;
//        if(r<0||c<0||r>nr-1||c>nc-1){
//            return;
//        }
//        grid[r][c] = '0';
//
//        if(r+1<nr&&grid[r+1][c]=='1')dfs(grid,r+1,c);
//        if(c+1<nc&&grid[r][c+1]=='1')dfs(grid,r,c+1);
//        if(c-1>=0&&grid[r][c-1]=='1')dfs(grid,r,c-1);
//        if(r-1>=0&&grid[r-1][c]=='1')dfs(grid,r-1,c);
//    }


}

class 岛屿数量2{
        public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0)return 0;
        int nrow = grid.length;
        int ncol = grid[0].length;
        int res=0;
        for (int r = 0; r < nrow; r++) {
            for (int c = 0; c < ncol; c++) {
                if(grid[r][c]=='1'){
                    res++;
                    dfs(grid,r,c);
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int r,int c){
        int nrow = grid.length;
        int ncol = grid[0].length;

        if(r>nrow-1||c>ncol-1||r<0||c<0)return;

        grid[r][c] = '0';

        if(r+1<nrow&&grid[r+1][c]=='1')dfs(grid,r+1,c);
        if(c+1<nrow&&grid[r][c+1]=='1')dfs(grid,r,c+1);
        if(r-1>0&&grid[r-1][c]=='1')dfs(grid,r-1,c);
        if(c-1>0&&grid[r][c-1]=='1')dfs(grid,r,c-1);
    }


}
