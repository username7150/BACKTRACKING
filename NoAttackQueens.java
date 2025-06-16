public class NoAttackQueens {
 // No attack 
        // ye basic wala hai n queens in n rows ::
    
    
        // is code me hum ye nahi dekh rhe ki ek queen dusri ko kaat rhi hai ya nahi 
        // ham bas places find kar rahe hain ki n rows me n queens ko kaise kaise 
        // rkha jaa skta hai 
    
        public static void queens( char array [][],  int row ){
            // base case 
             if( row == array.length){
                printarray( array);
                System.out.println();
                
                 return;
             }
    
             // kaam 
             for ( int j=0 ; j<array.length ; j++){
               array[row][j]='Q';                        // appending Queen 
               queens( array ,row +1  );
               array[row][j]='.';                        // Backtracking step
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
    
  
    
        public static void main (String args[]) {
           int n=3;
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
    

