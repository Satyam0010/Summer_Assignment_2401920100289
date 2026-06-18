package Week_3.Day_4;

import java.util.Stack;

public class reverse_polish_notation {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}