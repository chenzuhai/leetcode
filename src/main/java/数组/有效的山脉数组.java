package 数组;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/3
 */
public class 有效的山脉数组 {
    public boolean validMountainArray(int[] A) {
        if(A.length<3)return false;
        int i=0,j = A.length-1;
        while(i<A.length-1&&A[i]<A[i+1])i++;
        while(j>=1 && A[j]<A[j-1])j--;

        if(j==A.length-1||i==0)return false;

        if(i==j)return true;
        return false;
    }
}
