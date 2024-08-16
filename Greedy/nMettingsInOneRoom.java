package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Data {
    int st;
    int ed;
    int pos;

    Data(int st, int ed, int pos) {
        this.st = st;
        this.ed = ed;
        this.pos = pos;
    }

}

class SortByEd implements Comparator<Data> {
    public int compare(Data a, Data b) {
        return a.ed - b.ed;
    }
}

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Data d = new Data(start[i], end[i], i);
            list.add(d);
        }
        Collections.sort(list, new SortByEd());
        int cnt = 1;
        int freetime = list.get(0).ed;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).st > freetime) {
                cnt++;
                freetime = list.get(i).ed;
            }

        }
        return cnt;
    }
}