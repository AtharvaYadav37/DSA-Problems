class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int idx = letters.length;

        while(low <= high){
            int mid = (low + high) / 2;
            if(letters[mid] == target)
                low = mid + 1;
            else if(letters[mid] < target)
                low = mid + 1;
            else{
                high = mid - 1;
                idx = Math.min(mid, idx);
            }
        }
        if(idx == letters.length)
            return letters[0];
        return letters[idx];
    }
}