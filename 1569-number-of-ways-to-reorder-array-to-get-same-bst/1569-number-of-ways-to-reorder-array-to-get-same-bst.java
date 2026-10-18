class Solution {
    static final int MOD = 1_000_000_007;
    long[][] comb;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        comb = new long[n+1][n+1];

        for(int i = 0; i <= n; i++){
            comb[i][0] = comb[i][i] = 1;

            for(int j = 1; j < i; j++){//first and last value pascal tri m q hote hh
            comb[i][j] = (comb[i-1][j-1]+ comb[i-1][j]) %MOD;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        return (int)((solve(list)-1+MOD)%MOD);

    }
    long solve(List<Integer> num){
        int n = num.size();

        //base condn
        if(n < 3){
            return 1;
        }

        int root = num.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 1; i < n; i++){
            if(num.get(i)< root){
                left.add(num.get(i));
            }
            else{
                right.add(num.get(i));
            }
        }

        long x = solve(left);
        long y = solve(right);

        long ch = comb[n-1][left.size()];

        return (((x*y)%MOD)*ch)%MOD;
    }
}