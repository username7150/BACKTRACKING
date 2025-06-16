public class NQueenNRow{ // queen attack   

    public static void queens( char array [][],  int row ){
         // base case 
          if( row == array.length){
             printarray( array);
             System.out.println();
             
              return;
          }

          // kaam 
        
            for ( int j=0 ; j<array.length ; j++){
               boolean safe= isSafe(array, row, j);
              if ( safe ==true){
              array[row][j]='Q';                        // appending Queen 
              queens( array ,row +1  );         
              array[row][j]='.';                        // Backtracking step
             }                  
            }
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
        int n=4;
        char array [][]= new char[n][n];
         for (int i=0 ; i<n ; i++){
            for ( int j=0 ; j<n ; j++){
                array[i][j]='.';
            }
            System.out.println();
         }
        queens(array, 0);
         }     
}




// tumne ek aur approch sochi thi code likhte time isSafe ko recursive method se 
//kaise likh skte hain without using loop  wo niche hai 

// public static boolean isSafe(char array[][], int row, int col) {
//   // Vertical check
//   if (row >= 0 && array[row][col] == 'Q') {
//       return false;
//   }
//   if (row > 0) {
//       return isSafe(array, row - 1, col); // Move upwards
//   }

//   // Diagonal up left
//   if (row >= 0 && col >= 0 && array[row][col] == 'Q') {
//       return false;
//   }
//   if (row > 0 && col > 0) {
//       return isSafe(array, row - 1, col - 1); // Move diagonally left
//   }

//   // Diagonal up right
//   if (row >= 0 && col < array[0].length && array[row][col] == 'Q') {
//       return false;
//   }
//   if (row > 0 && col < array[0].length - 1) {
//       return isSafe(array, row - 1, col + 1); // Move diagonally right
//   }

//   return true; // If no queen found, it's safe
// }