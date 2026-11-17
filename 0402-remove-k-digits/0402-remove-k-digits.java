class Solution {
    public String removeKdigits(String s, int k) {
        if(k == s.length()){
            return "0";
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < sb.length() && k > 0; ){

            if(sb.charAt(i - 1) > sb.charAt(i)){
                sb.deleteCharAt(i -1);
                k--;

                if(i > 1)
                i--;
            }else
            i++;
        }

        while(k > 0){
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        

        return sb.length() == 0 ? "0" : sb.toString();
    }
}