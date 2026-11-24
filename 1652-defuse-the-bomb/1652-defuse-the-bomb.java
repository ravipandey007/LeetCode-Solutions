class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int x = 0;
        int[] ans = new int[n];

        if(k == 0){
            return ans;
        }
        int sum;
        
        for(int i = 0; i < n; i++) {
            sum = 0;
            if(k > 0){
        for(int j = 0; j < k; j++) {
            sum += arr[(i + j + 1) % n]; 
        }
        ans[i] = sum;
        }

        if(k < 0){
            for(int j = 1; j <= Math.abs(k); j++){
                sum += arr[(i - j + n) % n];
            }
            ans[i] = sum;
        }
    }
        return ans;
    }
}
//int index = i % n;