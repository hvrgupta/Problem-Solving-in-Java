package Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class JobComparator implements Comparator<Job> {
    public int compare(Job j1, Job j2) {
        return j2.profit - j1.profit;
    }
}

class Solution {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Your code here
        Arrays.sort(arr, new JobComparator());
        int jobs = 0;
        int profit = 0;
        ;
        int t = 0;
        int max_dead = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].deadline > max_dead) {
                max_dead = arr[i].deadline;
            }
        }
        int[] days = new int[max_dead];

        Arrays.fill(days, -1);

        for (int i = 0; i < arr.length; i++) {
            if (days[arr[i].deadline - 1] == -1) {
                days[arr[i].deadline - 1] = arr[i].id;
                jobs++;
                profit += arr[i].profit;
            } else {
                int j = arr[i].deadline - 1;
                while (j >= 0) {
                    if (days[j] != -1)
                        j--;
                    else {
                        days[j] = arr[i].id;
                        jobs++;
                        profit += arr[i].profit;
                        break;
                    }
                }
            }
        }

        int[] res = new int[2];
        res[0] = jobs;
        res[1] = profit;

        return res;

    }
}