class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
         if(need1 == 0 && need2 == 0){
            return 0;
         }
         // Agar full se hota hh to ---
        long cost_both = (long)costBoth * Math.max(need1, need2);
        long costAlag = (long)cost1 * need1 + (long)cost2 * need2;
       

        // Agar kisi ek ko both and left one ko use ke cost ss...
        long cost_Min = Long.MAX_VALUE;
        if(Math.min(need1 , need2) == need2){
            long  x = need1 - need2;
            x *= cost1;
            cost_Min = ((long)need2 * costBoth) + x;
        }else{
            long x = need2 - need1;
            x *= cost2;
            cost_Min = ((long)need1 * costBoth) + x;
        }

         return  Math.min(cost_both, Math.min(costAlag, cost_Min));
    }
}