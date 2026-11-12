class Solution {
    public int[] asteroidCollision(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int x : nums){
         while (x < 0 && !list.isEmpty() &&
                   list.get(list.size() - 1) > 0) {
            int top = list.get(list.size() - 1);

            if (top < -x) {

                list.remove(list.size() - 1);

            } else if (top == -x) {

                list.remove(list.size() - 1);
                x = 0;
                break;
        }else {
                x = 0;
                break;
            }
        }
            if (x != 0) {
            list.add(x);
        }
    }
       return list.stream().mapToInt(Integer::intValue).toArray();
    }
}