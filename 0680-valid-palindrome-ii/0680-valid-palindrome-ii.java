class Solution {
    public static boolean isPali(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0; 
        int r = s.length() - 1;

        int count = 0; 

        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else{
                
                count++;
                if(count > 1)
                    return false;
                

            if(isPali(s, l + 1, r)){
                l++;
            }else if(isPali(s, l, r - 1)){
                r--;
            }else{
                return false;
            }
        }
    }
        
        return true;
    }
    
}