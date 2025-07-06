// class Solution {
//     public int findLucky(int[] arr) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         int val = -1;

//         for(int n : arr){
//             map.put(n, map.getOrDefault(n, 0) + 1);
//         }

//         for(int n : map.keySet()){
//             if(n == map.get(n)){
//                 val = n;
//             }
//         }
//         return val;
//     }
// }

class Solution {
    public int findLucky(int[] arr) {
        int count[] = new int[501];
        for(int n : arr){
            count[n]++; 
        }

        for(int i = 500; i > 0; i--){
            if(count[i] == i){
                return i;
            }
        }

        return -1;
    }
}