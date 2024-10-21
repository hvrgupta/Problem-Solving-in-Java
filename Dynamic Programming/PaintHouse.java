class Solution {
    public int minCost(int[][] costs) {
        int n = costs.length;
    
        int a = costs[n-1][0];
        int b = costs[n-1][1];
        int c = costs[n-1][2];
        
        for(int i=n-2;i>=0;i--) {
            int temp1 = a;
            int temp2 = b;
            int temp3 = c;
            a = costs[i][0] + Math.min(temp2,temp3);
            b = costs[i][1] + Math.min(temp1,temp3);
            c = costs[i][2] + Math.min(temp2,temp1);
        }

        return Math.min(a, Math.min(b,c));
    }
}