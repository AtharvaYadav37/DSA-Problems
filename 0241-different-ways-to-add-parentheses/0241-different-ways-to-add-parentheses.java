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


/*
    class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = expression.length();
        for(int i = 0; i < n-1; i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                int n1 = expEval(expression.substring(0, i));
                int n2 = expEval(expression.substring(i+1, n));
                arr.add(task(n1, c, n2));
            }
        }
        return arr;
    }

    public int expEval(String s){
        int n = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                n = i;
                break;
            }
        }
        if(n > 0 && n < s.length()){
            int n1 = expEval(s.substring(0, n));
            int n2 = expEval(s.substring(n+1, s.length()));
            return task(n1, s.charAt(n), n2);
        }
            
        return Integer.valueOf(s);
    }

    public int task(int n1, char c, int n2){
        switch(c){
            case '+' : return n1 + n2;
            case '-' : return n1 - n2;
            case '*' : return n1 * n2;
        }
        return 0;
    }
}
*/