package ArrayMedian;

import java.util.Stack;

public class BasketBall {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        BasketBall game = new BasketBall();
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int result = game.calPoints(ops);
        System.out.println(result);
    }
}

