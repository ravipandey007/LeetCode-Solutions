class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l=0;
        int res=0;
        int n=s.length();
        int last[]=new int[128];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            l=Math.max(l,last[ch]);
            res=Math.max(res,i-l+1);
            last[ch]=i+1;
        }
        return res;
    }
}

/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        int n=s.length();
        int last[]=new int[128];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            l=Math.max(l,last[ch]);
            res=Math.max(res,i-l+1);
            last[ch]=i+1;
        }
        return res;
    }
}*/