class Solution {
    public boolean isSubsequence(String s, String t) {
       int i = 0; 
       int j = 0;

       String ans = "";

       while(i < s.length() && j < t.length()){
        if(s.charAt(i) == t.charAt(j)){
            ans += t.charAt(j);
            i++;
        }
        j++;
       }
       if (s.equals(ans)){
        return true;
       }
       else
       return false;
    }
}