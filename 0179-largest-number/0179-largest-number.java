class Solution {
    public String largestNumber(int[] nums) {
        String[] numArray = new String[nums.length];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(numArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if (numArray[0].charAt(0) == '0') {
            return "0";
        }

        String s = "";
        for(int i = 0; i < numArray.length; i++)
            s = s + numArray[i];

        return s;
    }
}