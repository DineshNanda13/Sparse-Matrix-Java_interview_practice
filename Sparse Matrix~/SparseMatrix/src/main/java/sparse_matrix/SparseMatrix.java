
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
        if(count > half_size){
            System.out.println("Sparse Matrix");
        }else{
            System.out.println("Not a Sparse Matrix");
        }
    }
}
