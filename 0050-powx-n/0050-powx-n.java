// class Solution {
//     public double myPow(double x, int n) {
//         if((x == -1 && n % 2 == 0) || (x == 1) || (n == 0))
//             return 1;
//         if(x == -1 && n % 2 == 1)
//             return -1;
//         if((n <= Integer.MIN_VALUE && x > 1) || (n >= Integer.MAX_VALUE && x < 1) || (x == 0))
//             return 0;
//         if(n < 0)
//             x = 1/x;
//         double pow = 1;
//         for(int i = 0; i < Math.abs(n); i++){
//             if(pow >= -10000 && pow <= 10000)
//                 pow = pow*x;
//             else
//                 break;
//         }
//         return pow;
//     }
// }



//efficient approach

class Solution {
    public double myPow(double x, int n) {
        long N = n;  // convert to long to handle Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0)
            return 1.0;
        double half = fastPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }
}
