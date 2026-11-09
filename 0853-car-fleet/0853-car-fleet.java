class Solution {
    public int carFleet(int target, int[] posi, int[] speed) {
        int n = posi.length;
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = posi[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b)-> Integer.compare(b[0], a[0]));

        Stack<Double> st = new Stack<>();
        for(int i = 0; i < n; i++){
            double t = (double)(target - cars[i][0])/ cars[i][1];

            if(!st.isEmpty() && t <= st.peek()){
                continue;
            }
            st.push(t);
        }
        return st.size();
    }
}