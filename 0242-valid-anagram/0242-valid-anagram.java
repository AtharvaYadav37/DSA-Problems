class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr);
        return Arrays.equals(arr, arr1);
    }
}