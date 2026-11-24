class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] ans = new int[n];

        if(k == 0) return ans;

        int sum = 0;

        // Calculate initial window
        for(int j = 1; j <= Math.abs(k); j++) {
            if(k > 0) {
                sum += code[j % n];
            } 
            else {
                sum += code[(n - j) % n];
            }
        }

        for(int i = 0; i < n; i++) {

            ans[i] = sum;

            if(k > 0) {
                sum -= code[(i + 1) % n];
                sum += code[(i + k + 1) % n];
            } 
            else {
                sum -= code[(i - Math.abs(k) + n) % n];
                sum += code[i];
            }
        }

        return ans;
    }
}