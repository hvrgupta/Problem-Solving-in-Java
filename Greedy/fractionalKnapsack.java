package Greedy;

import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

class WeightComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return Double.compare((double) i1.value / i1.weight, (double) i2.value / i2.weight);
    }
}

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        double res = 0;
        List<Item> items = new ArrayList<>();
        items = Arrays.asList(arr);
        Collections.sort(items, new WeightComparator().reversed());
        // items.forEach(el -> System.out.println(el.value + " " + el.weight));
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).weight <= w) {
                res += items.get(i).value;
                w -= items.get(i).weight;
            } else {
                double s = (double) items.get(i).value / (double) items.get(i).weight * (double) w;
                res += s;
                break;
            }
        }
        return res;

    }
}