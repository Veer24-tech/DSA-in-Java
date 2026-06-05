
import java.util.*;

public class dupliPara {

    public static boolean isDuplicate(String str) {
        int n = str.length();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ')') {
                s.push(str.charAt(i));
            }
            int count = 0;
            else{
                 while(s.isEmpty()||s.peek()!='('){
                    s.pop();
                    count++;
                 }
                   if(count<1){
            return true;
        }
        else{
            return false;
            }
            }

        }
return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))";
        System.out.print(isDuplicate(str));
    }
}
