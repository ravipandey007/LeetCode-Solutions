class Solution {
    public boolean isPalindrome(int x) {
    int rem,org, rev = 0;
    if(x < 0)
        return false;

    org = x;
    while(x != 0){
        rem = x % 10;
        rev = rev*10+rem;
        x = x/10;
    }
    return rev == org;
    }
}