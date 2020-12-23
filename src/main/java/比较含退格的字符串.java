import java.util.Stack;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/19
 */
public class 比较含退格的字符串 {

    public static boolean backspaceCompare(String S, String T){
        if(S.length()==0&&T.length()==0)return true;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2= new Stack<>();
        for(char c:S.toCharArray()){
            if(c=='#'){
                if(stack1.isEmpty()){
                    continue;
                }else{
                    stack1.pop();
                }
            }else{
                stack1.push(c);
            }

        }
        for(char c:T.toCharArray()){
            if(c=='#'){
                if(stack2.isEmpty()){
                    continue;
                }else{
                    stack2.pop();
                }
            }else{
                stack2.push(c);
            }

        }
        if(stack1.empty()&&!stack2.empty())return false;
        if(stack2.empty()&&!stack1.empty())return false;
        while (!stack1.isEmpty()&&!stack2.isEmpty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
            if(stack1.empty()&&!stack2.empty())return false;
            if(stack2.empty()&&!stack1.empty())return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("hd#dp#czsp#####","hd#dp#czsp######"));
    }

}
