public class heapImplementation {
    // Basic implementation
    class MinHeap {
        int[] arr;
        int size;
        int cap;

        MinHeap(int c) {
            arr = new int[c];
            size = 0;
            cap = c;
        }

        int left(int i) {
            return 2 * i + 1;
        }

        int right(int i) {
            return 2 * i + 2;
        }

        int parent(int i) {
            return (int) Math.floor((i - 1) / 2);
        }

        void swap(int child, int parent) {
            int temp = arr[child];
            arr[child] = arr[parent];
            arr[parent] = arr[temp];
        }

        void insert(int x) {
            if (size == cap)
                return;
            size++;
            arr[size - 1] = x;

            for (int i = size - 1; i != 0 && (arr[parent(i)] > arr[i]);) {
                swap(arr[i], arr[parent(i)]);
                i = parent(i);
            }
        }

        void minHeapify(int i) {
            int lt = left(i);
            int rt = right(i);
            int smallest = i;
            if (lt < size && arr[lt] < arr[i]) {
                smallest = lt;
            }
            if (rt < size && arr[smallest] > arr[rt]) {
                smallest = rt;
            }

            if (smallest != i) {
                swap(i, smallest);

                minHeapify(smallest);
            }
            return;
        }

        int extractMin() {
            if (size == 0)
                return -1;
            if (size == 1) {
                size--;
                return arr[0];
            }
            swap(0, size - 1);
            size--;

            minHeapify(0);
            return arr[size];
        }

        void decreaseKey(int key, int idx) {
            arr[idx] = key;

            while (idx != 0) {
                if (arr[parent(idx)] > arr[key]) {
                    swap(idx, parent(idx));
                }
                idx = parent(idx);
            }
        }

        void buildHeap() {
            for (int i = (size - 2) / 2; i >= 0; i--) {
                minHeapify(i);
            }
        }
    }

    public static void main(String[] args) {

    }
}