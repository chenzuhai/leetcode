/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/6/18
 */
public class 长按键入 {
    public boolean isLongPressedName(String name, String typed) {
        int p1 = 0;
        int p2 = 0;
        while (p1<name.length()&&p2<typed.length()){
            if(typed.charAt(p1)!=typed.charAt(p2)){
                return false;
            }
        }
        return false;
    }
}
