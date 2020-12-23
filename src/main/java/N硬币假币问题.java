/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/9/24
 */
public class N硬币假币问题 {

    public static int REAL_COIN_QUANTITY;

    public static int check_coins(int[] coins, int begin, int end) {
        int len = end - begin + 1;

        int group1_begin;
        int group1_end;

        int group2_begin;
        int group2_end;

        int group3_begin;
        int group3_end;
        //这里分成三种情况，分别是硬币数量为 1 ，2 ，3以上
        if (len >= 3) {
            /*
             *  将硬币分成三组，下面是三组的下标范围
             */

            group1_begin = begin;
            group1_end = begin + len / 3 - 1;

            group2_begin = begin + len / 3;
            group2_end = begin + len / 3 + len / 3 - 1;

            group3_begin = group2_end + 1;
            group3_end = end;
            //对三组硬币的质量求和
            int sum1 = sum(coins, group1_begin, group1_end);
            int sum2 = sum(coins, group2_begin, group2_end);
            int sum3 = sum(coins, group3_begin, group3_end);

            if (sum1 == sum2) {
                REAL_COIN_QUANTITY = coins[group1_begin]; //如果第一组和第二组质量相等，那么这些硬币的质量都是真硬币，所以对第三组进行判断
                return check_coins(coins, group3_begin, group3_end);
            } else {
                REAL_COIN_QUANTITY = coins[group3_begin]; //如果第一组和第二组质量不相等，那么第三组硬币的质量都是真硬币，所以分别对第一组和第二组判断
                int res1 = check_coins(coins, group1_begin, group1_end);
                int res2 = check_coins(coins, group2_begin, group2_end);
                if (res1 == -1) return res2;
                if (res2 == -1) return res1;
            }

        } else if (len == 2) {
            if (coins[begin] == coins[end]) {//当硬币数量为2时，判断这两个硬币质量是否相等，相等则都不是假币，否则假币在其中
                return -1;
            } else {
                if (coins[begin] != REAL_COIN_QUANTITY) return begin;
                if (coins[end] != REAL_COIN_QUANTITY) return end;
                return -1;
            }
        } else if (len == 1) {//只有一个硬币的情况，和真币质量对比一下，如果不相等则是假币
            if (coins[begin] != REAL_COIN_QUANTITY) return begin;
            return -1;
        }

        return -1;

    }

    //对三组硬币的质量求和
    public static int sum(int[] coins, int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum = sum + coins[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int size = 545454;//硬币的总数量
        System.out.println("网络182 陈祖海  学号：18401180115 ");
        System.out.println("硬币总数量" + size);
        int index = (int) (0 + Math.random() * size); //生成1-size的数字
        System.out.println("随机生成的假币编号" + index);
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = i == index ? 0 : 1;//假设假币质量为0，真币质量为1
        }
        System.out.println("判断结果" + check_coins(coins, 0, size - 1));

    }
}
