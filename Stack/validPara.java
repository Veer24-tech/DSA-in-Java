
import java.util.*;

public class validPara {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            //opening brackets ko stack me push kra---
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                s.push(str.charAt(i));
            } // paring bracket mile\a to stavck se opning ko hata do-
            else {
                // agar closing brackets aayega to stack khali hoga kyuki stack me kave opening brac push kr rhe-
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '[' && str.charAt(i) == ']' || s.peek() == '{' && str.charAt(i) == '}' || s.peek() == '(' && str.charAt(i) == ')') {
                    s.pop();
                } else {
                    return false;      //this case (]};  yaha pahal ele  to stack me psuh hoga - ab sencod ke liye----push
                    // nahi kr skte satck me , pair bhi match nahi ho skta  ,stack empty bhi nahi to reminhg
                    // condition me false hoigoh
                }

            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String str = "({{}})[()]";
        System.out.print(isValid(str));

    }
}
