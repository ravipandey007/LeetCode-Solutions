class Solution {
    
    // GCD of two numbers
    public long gcd(long a, long b) {
    while(b != 0) {
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    // LCM of two numbers
    public long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;
    }

    // GCD of array range [i, j]
    public long rangeGCD(int[] arr, int i, int j) {
    long result = 0;

    for(int x = i; x <= j; x++) {
        result = gcd(result, arr[x]);
    }

    return result;
}

    // LCM of array range [i, j]
            public long rangeLCM(int[] arr, int i, int j) {
    long result = 1;

    for(int x = i; x <= j; x++) {
        result = (result / gcd(result, arr[x])) * arr[x];
    }

    return result;
}

     public long rangeProduct(int[] arr, int i, int j) {
        long result = 1;

        for(int x = i; x <= j; x++) {
            result *= arr[x];
        }

        return result;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
    int length = 0;

    for(int l = 0; l < n; l++) {

        for(int r = l; r < n; r++) {

            long x = rangeLCM(nums, l, r);
            long y = rangeGCD(nums, l, r);
            long z = rangeProduct(nums, l, r);

            if(x * y == z) {
                length = Math.max(length, r - l + 1);
            }
        }
    }

    return length;
    }
}