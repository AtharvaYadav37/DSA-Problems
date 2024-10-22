class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            switch(c){
                case '&', '|', '!' : 
                    operator.push(c);
                    break;
                case 't', 'f', '(' :
                    operand.push(c);
                    break;
                case ')':
                    boolean x = false;

                    if(operator.peek() == '!'){
                        x = operand.peek() == 'f' ? true : false;
                        operand.pop();
                    } else if(operator.peek() == '|'){
                        while(operand.peek() != '('){
                            if(operand.peek() == 't')
                                x = true;
                            operand.pop();
                        }
                    } else{
                        x = true;
                        while(operand.peek() != '('){
                            if(operand.peek() == 'f')
                                x = false;
                            operand.pop();
                        }
                    }
                    operand.pop();
                    operator.pop();
                    if(x)
                        operand.push('t');
                    else
                        operand.push('f');
            }
        }

        if(operand.peek() == 't')
            return true;
        return false;
    }
}