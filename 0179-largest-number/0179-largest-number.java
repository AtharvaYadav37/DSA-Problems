class Solution {
    public String largestNumber(int[] nums) {
        Integer[] numArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numArray[i] = nums[i];
        }

        Arrays.sort(numArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String o1String = o1.toString() + o2.toString();
                String o2String = o2.toString() + o1.toString();
                return o2String.compareTo(o1String);
            }
        });
        
        if (numArray[0] == 0) {
            return "0";
        }

        String s = "";
        for(int i = 0; i < numArray.length; i++)
            s = s + Integer.toString(numArray[i]);

        return s;
    }
}