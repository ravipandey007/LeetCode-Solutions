class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] ans = new int[n];
        int[] stack = new int[n];
        int top = -1;
        
        for (int i = 0; i < n; i++) {
            while (top >= 0 && t[i] > t[stack[top]]) {
                int idx = stack[top--];
                ans[idx] = i - idx;
            }
            stack[++top] = i;
        }

        return ans;
    }
}