/**Author: Wenhao Lin
 *Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 *An island is surrounded by water and is formed by connecting adjacent lands horizontally 
 *or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)return 0;
        int count = 0;
        for(int i = 0 ; i < grid.length; i++){
           for(int j = 0; j < grid[0].length;j++){
               if(grid[i][j]=='1'){
                   open(grid,i,j);
                   count++;
               }
           }
       } 
        return count;
    }
    public void open(char[][] grid, int row, int col){
        grid[row][col]='2';
        if(row-1 >= 0 && grid[row-1][col]=='1') open(grid,row-1,col);    
        if(row+1 != grid.length && grid[row+1][col]=='1') open(grid,row+1,col);
        if(col-1 >= 0 && grid[row][col-1]=='1') open(grid,row,col-1);
        if(col+1 != grid[0].length && grid[row][col+1]=='1') open(grid,row,col+1); 
    }//open
}