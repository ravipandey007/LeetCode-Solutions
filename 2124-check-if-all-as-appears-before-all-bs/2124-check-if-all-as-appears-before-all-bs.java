class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        boolean flag = false;

        for(int i = 0; i < n; i++){

            if(s.charAt(i) == 'a' && flag == true){
                return false;
            }
            if(s.charAt(i) == 'a'){
                continue;
            }else{
                flag = true;
            }
        }
        return true;
    }
}