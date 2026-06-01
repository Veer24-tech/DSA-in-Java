//Reverse a String using Stack

import java.util.*;

public class revString {

    public static  void reverseString(String str) {
        //step 1-strimg ko stack me push krna hai -
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder("");//empty string banaya hai jisme hum charcters ko store krva lege
        //step 2- stack se remove krge charcters ko jab tal satck khali na hojye    aur store krva lege isse
        while (!s.isEmpty()) {
                    char currPoppedChar=s.pop();
                    sb.append(currPoppedChar);

        }
        String reverseString=sb.toString(); //string builder sb ko string me convert kr diya hai
        System.out.println(reverseString);
       
    }

    public static void main(String args[]) {
        String str = "ABCD";
        reverseString(str);
    }

}
