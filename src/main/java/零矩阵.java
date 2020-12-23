import java.util.HashSet;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 零矩阵 {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0)return;
        int nr = matrix.length;
        int nc = matrix[0].length;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (row.contains(i)||col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
