class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        //Calculate freq :
        HashMap<Integer, Integer> rosi = new HashMap<>();
        for(int ele : nums){
            rosi.put(ele, rosi.getOrDefault(ele, 0) + 1);
        }
        //Create bucket : 
        List<Integer> [] bucket = new ArrayList[n+1];

        //Store ele acc. to freq :
        for(int i : rosi.keySet()){

            int freq = rosi.get(i);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(i);;
        }

        //Get k most freq. ele : 
        int[] res = new int[k];
        int j = 0;
        for(int i = n; i >= 1; i--){

            if(bucket[i] != null){

                for(int num : bucket[i]){
                    res[j++] = num;
                
                if(j == k){
                    return res;
                }
            }
        }
    }
    return res;
    }
}