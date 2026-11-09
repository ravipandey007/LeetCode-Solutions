class Solution {
    public int carFleet(int target, int[] posi, int[] speed) {
        int n = posi.length;
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = posi[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b)-> Integer.compare(b[0], a[0]));

        int count = 0; 
        double prevTime = 0;
        for(int i = 0; i < n; i++){
            double t = (double)(target - cars[i][0])/ cars[i][1];

            if(t > prevTime){
                count++;
                prevTime = t;
            }
        }
        return count;
    }
}