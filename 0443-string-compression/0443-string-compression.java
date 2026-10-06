class Solution {
    public int compress(char[] chars) {
        int r = 0;
        int w = 0; 

        while(r < chars.length){
            char current = chars[r];
            int count = 0;

            while(r < chars.length && chars[r] == current){
                count++;
                r++;
            }

            chars[w] = current;
            w++;

            if(count > 1){
                String num = String.valueOf(count);

                for(int i = 0; i < num.length(); i++){
                    chars[w] = num.charAt(i);
                    w++;
                }
            }
        }
        return w;
    }
}
