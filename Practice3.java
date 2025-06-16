public class Practice3 {
     public static boolean  istrue(boolean filled [][] ,int i,int j,int n){
       
     }

     

     
     public static void knights( int board[][], int i , int j ,int n ,boolean filled[][],int count){
        //base case
         if(istrue(filled,i,j)) {
            print(board,n);
            return;

         }

         
        
        
         board[i][j]= count;
         filled[i][j]=true;
         ;
         
        if ( filled[i][j]==false){
         if ( i== board.length-2 || j== board.length-2  ){
            knights( board ,i+1,j+2,n,filled,count++);
         } else {
            knights( board ,i+2,j+1,n,filled,count++ );
         }


     }}
     public static void print ( int  board[][], int n ){
        for ( int i =0 ; i<n ; i++){
             for (int j=0 ; j<n ; j++){
                System.out.print(board[i][j]+ "  ");

             }
             System.out.println();
        }
     }
    public static void   main (String args[]){
        int n =8;
         int board[][]= new int [n][n];
        boolean filled[][]= new boolean[n][n];
        int count =0;

         knights( board ,0,0,filled,count);

    }
    
}
