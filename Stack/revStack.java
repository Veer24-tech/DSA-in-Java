//Reverse stack  without using extra space
// logic----    Stack ko khali kro - jab stack kahli ho jaye  to push bottom me kro same oreder me jsiem stcvak khali liya 

import java.util.*;

public class revStack {

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s, top);

    }

    public static void insertAtBottom(Stack<Integer> s, int top) {
        if (s.isEmpty()) {
            s.push(top);
            return;
        }
        int currPopedEle = s.pop();
        insertAtBottom(s, top);
        s.push(currPopedEle);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        System.out.println("Reversed Stack");
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }

    }

}
