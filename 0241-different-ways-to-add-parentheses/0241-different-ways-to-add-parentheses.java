import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = expression.length();
        
        for (int i = 0; i < n; i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1, n));

                for (int left : leftResults) {
                    for (int right : rightResults) {
                        arr.add(task(left, c, right));
                    }
                }
            }
        }
        
        if (arr.isEmpty()) {
            arr.add(Integer.valueOf(expression));
        }
        
        return arr;
    }

    public int task(int n1, char c, int n2) {
        switch(c) {
            case '+' : return n1 + n2;
            case '-' : return n1 - n2;
            case '*' : return n1 * n2;
        }
        return 0;
    }
}
