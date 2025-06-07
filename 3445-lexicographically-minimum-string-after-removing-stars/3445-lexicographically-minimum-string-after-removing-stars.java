class Solution {
    public String clearStars(String s) {
        int len = s.length();
        PriorityQueue<Character> minHeap = new PriorityQueue<>();   //to keep track of minimum element
        boolean[] addOrNot = new boolean[len];                      //to keep track of char to add at last
        Arrays.fill(addOrNot, true);

        Stack<Integer>[] charIndices = new Stack[26];
        for(int i = 0; i < 26; i++){
            charIndices[i] = new Stack<>();                     //to keep track of indices of each alphabet
        }
        
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c == '*'){
                int smallestCharIndex = minHeap.poll() - (int)'a';  //to get the smallest element yet
                addOrNot[charIndices[smallestCharIndex].pop()] = false; //to get the last occureed index of smallest element
                addOrNot[i] = false;                                           //to make index * as false
            }else{
                minHeap.add(c);                                     //add the alphabet to minHeap
                int charIndex = c - 'a';                            //get the index value for the character to be added
                charIndices[charIndex].push(i);                   //adds the index of the character in the first place
            }
        }
        
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(addOrNot[i]){
                ret.append(s.charAt(i));
            }
        }

        return ret.toString();
    }
}