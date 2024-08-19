package Greedy;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int pageFaults(int N, int C, int pages[]) {
        Queue<Integer> q = new LinkedList<>();

        int i = 0, c = 0;
        while (i < N) {

            if (q.isEmpty() || !q.contains(pages[i])) {
                if (q.size() == C)

                    q.poll();

                q.add(pages[i]);

                c++;
            } else {
                q.remove(pages[i]);
                q.add(pages[i]);
            }

            i++;
        }
        return c;
    }
}
