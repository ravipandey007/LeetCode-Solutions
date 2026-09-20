class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int result = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            result += ('z' - ch + 1) * (i + 1);

        }
        return result;
    }
}