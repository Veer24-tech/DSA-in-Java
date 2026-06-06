import java.util.*;

public class dupliPara {
    public static boolean isDupli(String str) {
        Stack<Character> s = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ')') {
                s.push(str.charAt(i));
            } 
            else {
                int count = 0; // Har closing bracket ke liye naya count
                
                // Jab tak opening bracket nahi milta, beech ke elements pop karo aur gino
                while (s.peek() != '(') { 
                    s.pop();
                    count++; // Har character (a, +, b) ke liye count badhega
                }
                
                s.pop(); // Loop ke baad, opening bracket '(' ko bhi nikal do
                
                // Agar   chota hai 1 se (count < 1)  hai (matlab beech me koi character nahi tha, jaise '()')
                if (count < 1) {
                    return true; // Duplicate pakda gaya!
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))";
        System.out.print(isDupli(str)); // Ab ye bilkul sahi 'true' print karega
    }
}