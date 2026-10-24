class Solution {

    public static int dayOfYear(int month, int day) {
        int total = day;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }

        return total;
    }
    public int countDaysTogether(String aA, String lA, String aB, String lB) {

        String[] arriveA = aA.split("-");
        String[] leaveA = lA.split("-");
        String[] arriveB = aB.split("-");
        String[] leaveB = lB.split("-");

        int monthaA = Integer.parseInt(arriveA[0]);
        int dayaA = Integer.parseInt(arriveA[1]);

        int monthlA = Integer.parseInt(leaveA[0]);
        int daylA = Integer.parseInt(leaveA[1]);

        int monthaB = Integer.parseInt(arriveB[0]);
        int dayaB = Integer.parseInt(arriveB[1]);

        int monthlB = Integer.parseInt(leaveB[0]);
        int daylB = Integer.parseInt(leaveB[1]);

        int ans = 0;

        int aA_days = dayOfYear(monthaA, dayaA);
        int lA_days = dayOfYear(monthlA, daylA);
        int aB_days = dayOfYear(monthaB, dayaB);
        int lB_days = dayOfYear(monthlB, daylB);

        
        if(lA_days < aB_days || lB_days < aA_days){
           return 0;
        }
        else{
            int x = Math.max(aA_days , aB_days);
            int y = Math.min(lA_days, lB_days);
            ans = y-x+1;
        }

        return ans;
       
    }
}