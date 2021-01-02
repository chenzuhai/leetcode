package 数组;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/1 16:21
 */
public class 种花问题 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n<=0)return true;
        if(flowerbed==null || flowerbed.length==0)return false;
        if(flowerbed.length==1){
            if(flowerbed[0]==1)return n<=0;
            else{
                return n<=1;
            }
        }
        int total=0;
        for(int i=0;i<flowerbed.length;i++){
            if(i==0){
                if(flowerbed[i]==0&&flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    total++;
                    continue;
                }
            }else if(i==flowerbed.length-1){
                if(flowerbed[flowerbed.length-2]==0&&flowerbed[flowerbed.length-1]==0){
                    flowerbed[i]=1;
                    total++;
                    continue;
                }
            }else if(flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0){
                flowerbed[i]=1;
                total++;
                continue;
            }

        }
        return total>=n;
    }
}
