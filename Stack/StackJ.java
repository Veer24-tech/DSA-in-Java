import java.util.*;
public class StackJ{
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}