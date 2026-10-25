class Solution {
    public static int findRight(int[] arr, int index){
       for (int i = index + 1; i < arr.length; i++) {
        if (arr[i] > arr[index]) {
            return arr[i];
        }
    }

    return -1;
    }

    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int[] saveIndex = new int[n1.length];
        int indx = 0;

        for(int i = 0; i < n1.length; i++){
            for(int j = 0; j < n2.length; j++){
                if(n1[i] == n2[j]){
                    saveIndex[indx++] = j;
                }
            }
        }

        //Now we saved the index of element we have to do the operations : 
        int[] ans = new int[n1.length];
        int k = 0; 

        for(int i = 0; i < saveIndex.length; i++){
            ans[k++] = findRight(n2, saveIndex[i]);
        }

        return ans;
    }
}