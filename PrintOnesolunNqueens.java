public class PrintOnesolunNqueens {
    public static boolean queens( char array [][],  int row ){
        // base case 
         if( row == array.length){
            printarray( array);
            System.out.println();
            
             return true;
         }

         // kaam 
       
           for ( int j=0 ; j<array.length ; j++){
              boolean safe= isSafe(array, row, j);
             if ( safe ==true){
             array[row][j]='Q';                        // appending Queen 
              if (queens( array ,row +1  )) {        
              return true;        }
              array[row][j]='.';              
            }   
           }
          
           return false ;
   }

     public static void printarray( char array[][]){

       for (int i=0 ; i<array.length ; i++){
           for ( int j=0 ; j<array.length; j++){
               System.out.print(array[i][j] +" ");
           }
           System.out.println();
        }
     }

      public static boolean isSafe( char array[][], int row, int col){
        // verticle 
         for ( int i =row -1 ; i>=0 ; i--){
            if (array[i][col]=='Q'){
           return false ;
         }
         }
        
        // diagonal up left
        for ( int i =row -1 , j=col -1 ; i>=0  && j>=0; i-- , j--){
          if (array[i][j]=='Q'){
         return false ;}
       }
        
        // diagonal up in right
        for ( int i =row -1, j=col +1; i>=0 && j<array.length ; i--, j++){
          if (array[i][j]=='Q'){
         return false ;}
       }
         return true ;                // now place Queen its safe position 
      }



    public static void main (String args[]) {
       int n=2;
       char array [][]= new char[n][n];
        for (int i=0 ; i<n ; i++){
           for ( int j=0 ; j<n ; j++){
               array[i][j]='.';
           }
           System.out.println();
        }
       System.out.print(queens(array, 0));
        }     
    
}
