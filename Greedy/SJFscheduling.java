package Greedy;

import java.util.Arrays;

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int sum = 0;

        for (int i = 1; i < bt.length; i++) {
            sum += bt[i - 1];
            bt[i] += bt[i - 1];
        }
        return sum / bt.length;

    }
}
