class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1;

        int lmax = 0, rmax = 0, water = 0;
        while(l < r){
            if(h[l] < h[r]){
                lmax = Math.max(lmax, h[l]);
                water += lmax - h[l]; 
                l++;
            }else{
                rmax = Math.max(rmax, h[r]);
                water+= rmax - h[r];
                r--;
            }
        }
        return water;
    }
}