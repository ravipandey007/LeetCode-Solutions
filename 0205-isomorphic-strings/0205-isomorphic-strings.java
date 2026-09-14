class Solution {
    public boolean isIsomorphic(String s, String t) {


        int[] freq1 = new int[s.length()];
        int[] freq2 = new int[t.length()];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {

            int index = -1;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    index = freq1[j];
                    break;
                }
            }

            if (index == -1) {
                freq1[i] = count1;
                count1++;
            } else {
                freq1[i] = index;
            }
        }

        for (int i = 0; i < t.length(); i++) {

            int index = -1;

            for (int j = 0; j < i; j++) {
                if (t.charAt(i) == t.charAt(j)) {
                    index = freq2[j];
                    break;
                }
            }

            if (index == -1) {
                freq2[i] = count2;
                count2++;
            } else {
                freq2[i] = index;
            }
        }

        if(Arrays.equals(freq1, freq2)){
            return true;
        }
        else
        return false;
    }
}
        
