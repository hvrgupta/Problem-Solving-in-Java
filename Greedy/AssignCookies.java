package Greedy;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ch = 0;
        int idx = 0;
        while (idx < s.length && ch < g.length) {
            if (s[idx] >= g[ch]) {
                ch++;
            }
            idx++;
        }
        return ch;
    }
}