class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long t1 = n;
        while(t1 != 0){
            sum += t1 % 10;
            t1 /= 10;
        }

        long ans = 0;
        while(n > 0){
            long digit = n % 10;

            if(digit != 0){
                ans = ans * 10 + digit;
            }
            n = n / 10;
        }
        //reverse 
        long rev = 0;
        while(ans > 0){
            rev = rev * 10 + ans % 10;
            ans /= 10;
        }

        return (long)rev * sum;
    }
}