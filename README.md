# Sparse-Matrix-Java_interview_practice
Java program to check whether the given matrix is sparse or not

package sparse_matrix;

/**
 *
 * @author Dinesh Nanda
 */

public class SparseMatrix {

    public static void main(String[] args) {
        
        int [][] arr = {{1,0,0},{0,9,0},{0,0,2}};
        
        int count = 0;
        
        int rows = arr.length;
        int columns = arr[0].length;
        int size = rows*columns;
        int half_size = size/2;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                
                if(arr[i][j] == 0){
                    count++;
                }
            }
        }
        
        /*Number of zeroes present in above matrix is 6 
        and size of the matrix is 3 * 3 = 9. Since, 6 > 4.5 
        that means, most elements of given array are zero. 
        Hence, the above matrix is a sparse matrix.*/
        
        if(count > half_size){
            System.out.println("Sparse Matrix");
        }else{
            System.out.println("Not a Sparse Matrix");
        }
    }
}
