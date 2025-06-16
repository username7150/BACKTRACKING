public class GridWays {
    public static int GridWays(int grid[][], int x, int y, int N, int M){
        //base case 
        if (x==N-1  && y==M-1){
            return  1;

        } else if ( x==N || y==M){
            return 0;
        }

        //kaam 
        return GridWays(grid,x+1,y,N,M)+GridWays(grid,x,y+1,N,M);}
    

    public static  void main (String args[]){
        int N=3;
        int M = 3;
        int grid[][]=new int [N][M];
        System.out.println(GridWays(grid,0,0,N,M));

    }
    
}
