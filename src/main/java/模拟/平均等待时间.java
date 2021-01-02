package 模拟;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/28 10:47
 */
public class 平均等待时间 {
    public double averageWaitingTime(int[][] customers) {
        //等待时间    当前时间
        long sum = 0,cur = 0;
        for(int[] c:customers){
            //做菜结束时间 = max(当前时间，顾客到达时间)+做菜时间
            cur = Math.max(cur,c[0])+c[1];
            //等待时间 = 做菜结束时间 - 顾客到达时间
            sum += cur - c[0];
        }
        return sum/customers.length;
    }
}
