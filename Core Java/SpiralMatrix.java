
public class SpiralMatrix {

    static void printSpiral(int[][] matrix, int row, int col){
        int left = 0, top = 0;
        int right = col-1, bottom = row-1;
        while(left < right && top < bottom){
            for(int i = left ; i<=right ; i++){
                System.out.print(matrix[top][i]+ " ");
            }
            top++;
            for(int i=top ; i<=bottom ; i++){
                System.out.print(matrix[i][right] + " "); 
            }
            right--;
            if(left <= right){
                for(int i=right ; i>=left ; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if(top <= bottom){
                for(int i=bottom ; i>=top ; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printSpiral(matrix, 4, 4);
    }
}