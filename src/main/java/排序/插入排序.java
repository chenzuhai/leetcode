package 排序;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/11/2
 */
public class 插入排序 {
    public static void InsertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j >= 0 && temp < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+",");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,3,45,4,84,48,4};
        InsertSort(a);

    }
}
