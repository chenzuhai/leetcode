package 模拟;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/28 11:03
 */
public class 无法吃午餐的学生数量 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] c = new int[2];
        c[0] = c[1] = 0;
        for(int s:students){
            c[s]+=1;
        }
        for (int s:sandwiches){
            if(c[s]>0) {
                c[s]-=1;
            }else {
                break;
            }
        }
        return c[0]+c[1];
    }
}
