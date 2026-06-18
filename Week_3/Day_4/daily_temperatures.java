package Week_3.Day_4;

import java.util.Stack;

public class daily_temperatures {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length;i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int in = stack.pop();
                ans[in] = i - in;
            }
            stack.push(i);
        }
        return ans;
    }
}