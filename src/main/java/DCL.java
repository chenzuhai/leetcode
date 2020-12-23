/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/6/18
 */
public class DCL {
    private  static volatile DCL INSTANCE;

    private DCL(){

    }

    public static DCL getInstance(){
        if(INSTANCE==null){
            synchronized (DCL.class){
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    INSTANCE = new DCL();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(DCL.getInstance().hashCode());
            }).start();
        }
    }
}
