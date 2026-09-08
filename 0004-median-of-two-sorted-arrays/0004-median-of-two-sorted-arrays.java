class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] medarr = new int[nums1.length + nums2.length];

        int k = 0;
        for(int i = 0; i < nums1.length ; i++){
            medarr[k] = nums1[i];
            k++;
        }
        for(int i = 0; i < nums2.length; i++){
            medarr[k] = nums2[i];
            k++;
        }
        Arrays.sort(medarr);

        int t = medarr.length;
        //Find median
        if(t % 2 == 1){
            return medarr[t/2];
        }
        else{
            return (medarr[t/2-1] + medarr[t/2])/2.0;
        }
    }
}