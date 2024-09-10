package Greedy;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> res = new ArrayList<>();

        int i = 0;
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            List<Integer> t = new ArrayList<>();
            t.add(intervals[i][0]);
            t.add(intervals[i][1]);
            res.add(t);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        List<Integer> t1 = new ArrayList<>();
        t1.add(newInterval[0]);
        t1.add(newInterval[1]);
        res.add(t1);
        while (i < n) {
            List<Integer> t2 = new ArrayList<>();
            t2.add(intervals[i][0]);
            t2.add(intervals[i][1]);
            res.add(t2);
            i++;
        }

        int[][] rest = new int[res.size()][2];
        for (int j = 0; j < rest.length; j++) {
            rest[j][0] = res.get(j).get(0);
            rest[j][1] = res.get(j).get(1);
        }
        return rest;
    }
}
