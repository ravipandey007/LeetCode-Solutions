class Solution {
    public int minChanges(String s) {
        int count = 0;

        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < s.length(); i+= 2){
            if(sb.charAt(i - 1) != sb.charAt(i)){
                sb.setCharAt(i , sb.charAt(i - 1));
                count ++;
            }
        }
        return count;
    }
}