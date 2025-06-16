public class practice1{
    
        public static int ways( int maze[][],int x,int y,int N,boolean array[][]){
            //base case
    
            if (x==N-1 && y==N-1 || maze[x][y]==1 ){
                return 1;
            } 
             
           
            if ( x==N|| y==N ||x==-1||y==-1){
             return 0;
            }
            if ( maze[x][y]==0){
                return 0;
             }
             array[x][y] = true;
               
             int totalWays = ways(maze, x, y + 1, N, array) // Right
             + ways(maze, x, y - 1, N, array) // Left
             + ways(maze, x + 1, y, N, array) // Down
             + ways(maze, x - 1, y, N, array); // Up

// Backtrack: Unmark current cell
array[x][y] = false;

return totalWays;
            
    
    
        }
        public static void main (String args[]){
            int N=4;
            boolean[][] array =new boolean [N][N];
    
            int maze[][] = { { 1, 0, 0, 0 },
                             { 1, 1, 0, 1 },
                             { 0, 1, 0, 0 },
                             { 1, 1, 1, 1 } };
         System.out.println(ways(maze , 0,0,N,array));
        
    
    
        }
        
    }
