class Solution {
    public String robotWithString(String s) {
        StringBuilder ret = new StringBuilder();
        int len = s.length();
        char minRight[] = new char[len];
        minRight[len - 1] = s.charAt(len - 1);

        for(int i = len - 2; i >= 0; i--){
            minRight[i] = (char)Math.min(minRight[i + 1], s.charAt(i));
        }

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len; i++){
            stack.push(s.charAt(i));

            while(!stack.isEmpty() && stack.peek() <= minRight[(i+1) == len ? len - 1 : (i+1)]){
                ret.append(stack.pop());
            }
        }
        while(!stack.isEmpty())
            ret.append(stack.pop());

        return ret.toString();
    }
}