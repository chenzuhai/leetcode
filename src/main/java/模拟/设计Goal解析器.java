package 模拟;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/29 11:44
 */
public class 设计Goal解析器 {
    public String interpret(String command) {
        if(command==null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if(c=='('){
                if(command.charAt(i+1)==')'){
                    i++;
                    stringBuilder.append('o');
                }else {
                    while (command.charAt(++i)!=')'){
                        stringBuilder.append(command.charAt(i));
                    }
                }
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
