class Solution {
    public String shortestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s;

        int i = 0;
        int j = s.length() - 1;
        int end = j;  // Variable to track the end of the palindrome

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // Reset i and decrease end to try finding a shorter palindrome from the start
                i = 0;
                end--;
                j = end;  // Set j to the new end
            }
        }

        // If the palindrome ends before the end of the string, append the missing part in reverse
        String suffix = s.substring(end + 1); 
        String prefix = new StringBuilder(suffix).reverse().toString();
        return prefix + s;
    }
}
