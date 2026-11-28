import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        // Step 1: Find minimum price and maximum factor
        int minPrice = Integer.MAX_VALUE;
        int maxFactor = 0;

        for (int[] item : items) {
            minPrice = Math.min(minPrice, item[1]);
            maxFactor = Math.max(maxFactor, item[0]);
        }

        // Step 2: Count how many items have each factor
        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        // Step 3: Calculate gain for each factor using multiples
        int[] gain = new int[maxFactor + 1];

        for (int f = 1; f <= maxFactor; f++) {
            int count = 0;

            for (int multiple = f; multiple <= maxFactor; multiple += f) {
                count += freq[multiple];
            }

            gain[f] = count - 1;
        }

        // Step 4: Sort items by price
        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));

        long remaining = budget;
        long ans = 0;

        // Step 5: Buy profitable value-2 copies greedily
        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            // Buying 2 items for price >= 2 * minPrice
            // is no better than buying single items.
            if ((long) price >= 2L * minPrice) {
                break;
            }

            if (gain[factor] <= 0) {
                continue;
            }

            // Maximum bonus copies available for this item type
            long take = Math.min(
                (long) gain[factor],
                remaining / price
            );

            ans += take * 2;
            remaining -= take * price;
        }

        // Step 6: Spend remaining budget on cheapest 1-value copies
        ans += remaining / minPrice;

        return (int) ans;
    }
}