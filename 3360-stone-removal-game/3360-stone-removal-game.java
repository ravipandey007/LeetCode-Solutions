class Solution {
    public boolean canAliceWin(int n) {
       boolean win = false;
       int amount = 10;
       while(amount <= n){
        n -= amount;
        amount--;
        win ^= true;
       }

       return win;
    }
}