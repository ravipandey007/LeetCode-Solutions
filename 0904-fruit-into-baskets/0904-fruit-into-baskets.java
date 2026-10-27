class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
int maxLen = 0;

int first = -1;
int second = -1;
int count = 0;

for (int i = 0; i < fruits.length; i++) {
    int fruit = fruits[i];

    if (fruit == first || fruit == second) {
        if (i > 0 && fruit == fruits[i - 1]) {
            count++;
        } else {
            count = 1;
        }
    } else if (first == -1) {
        first = fruit;
        count = 1;
    } else if (second == -1) {
        second = fruit;
        count = 1;
    } else {
        left = i - count;
        first = fruits[i - 1];
        second = fruit;
        count = 1;
    }

    maxLen = Math.max(maxLen, i - left + 1);
}

return maxLen;
    }
}