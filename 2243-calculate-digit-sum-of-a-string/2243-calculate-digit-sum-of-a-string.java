class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            StringBuilder next = new StringBuilder();

            for(int i = 0; i < s.length(); i += k){
                int sum = 0; 
                // int end = Math.min(i + k, s.length());  // last group may be shorter


                for(int j = i; j < i + k && j < s.length(); j++){
                sum += s.charAt(j) - '0';
            }
            next.append(sum);
        }
        s = next.toString();
    }
        return s;
    }
}