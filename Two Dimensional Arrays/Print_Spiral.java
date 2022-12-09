/*
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form.
That is, you need to print in the order followed for every iteration:

    a. First row(left to right)
    b. Last column(top to bottom)
    c. Last row(right to left)
    d. First column(bottom to top)
*/

public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		 if(matrix.length == 0)return ;
        
        int T = 0, P = matrix.length -1;
        int R = 0, C = matrix[0].length -1;
        
        int Z = matrix.length * matrix[0].length;
        int count = 0;
        
        while(  count  < Z){
            for(int i = R; i<= C && count <Z ; i++){
                count++;
               System.out.print(matrix[T][i]+" ");
            }
            T++;
            
            for(int i = T; i<= P && count < Z; i++){
                 count++;
              System.out.print(matrix[i][C]+" ");
            }
            C--;
            
            for(int i = C; i>= R && count < Z; i-- ){
                 count++;
               System.out.print(matrix[P][i]+" ");
            }
            P--;
            
            for(int i = P; i>= T && count < Z ; i--){
                 count++;
               System.out.print(matrix[i][R]+" ");
            }
            R++;
        }
	}
}
