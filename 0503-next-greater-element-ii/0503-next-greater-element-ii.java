class Solution {
    public static int nextGreat(int[]arr, int index){
        for(int i = 1; i < arr.length; i++){
            int j = (index + i) % arr.length;

            if(arr[j] > arr[index]){
                return arr[j];
            }
        }
        return -1;
    }
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            result[k++] = nextGreat(nums, i);
        }

        return result;
    }
}