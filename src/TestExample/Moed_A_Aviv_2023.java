package TestExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Moed_A_Aviv_2023 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() {{
                add(10);
                add(12);
                add(7);
                add(6);
                add(2);
                add(5);
            }};

        System.out.println(q);

        Stack<Integer> stCopy = copy(q);
        System.out.println(q);
        System.out.println(stCopy);

        while (!q.isEmpty()) {
            System.out.print("Stack pop -> " + stCopy.pop());
            System.out.print(" Queue poll -> " + q.poll());
            System.out.println();
        }


    }
    // 5 + 5n +5n 10n+5 O(n)
    private static Stack<Integer> copy(Queue<Integer> q) {
        if(q==null)
            return null;

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        Queue<Integer> temp = new LinkedList<>();

        //5n
        while(!q.isEmpty()) {
            st.push(q.peek());
            temp.add(q.poll());
        }
        //5n
        while(!st.isEmpty()) {
            st1.push(st.pop());
            q.add(temp.poll());
        }
        return st1;

    }
}
