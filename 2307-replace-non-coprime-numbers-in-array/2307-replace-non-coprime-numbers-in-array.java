class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        if (nums.length == 1) return new ArrayList<>(List.of(nums[0]));

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            if(stack.isEmpty())   stack.push(nums[i]);
            else{
                stack.push(nums[i]);
                while(stack.size() >= 2){
                    int a = stack.pop();
                    int b = stack.pop();
                    int gcd = gcd(a, b);
                    if(gcd > 1){
                        stack.push((int)(((long)a*b) / gcd));
                    }
                    else{
                        stack.push(b);
                        stack.push(a);
                        break;
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(0, stack.pop());
        }

        return list;
    }

    static int gcd(int a, int b){
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }
}