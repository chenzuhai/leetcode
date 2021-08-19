package 其他;

/**
 * @author Chen Zuhai
 * @Date 2021-06-30 16:17
 */
public class Excel表列名称 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber>0){
            columnNumber--;
            sb.append((char) (columnNumber%26 + 'A'));
            columnNumber/=26;
        }
        sb.reverse();
        return sb.toString();
    }
}
