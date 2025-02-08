package LeetCode_Problems.Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem2349_DesignANumberContainer {
    class NumberContainers {
        private Map<Integer, Integer> indexToNumber;
        private Map<Integer, PriorityQueue<Integer>> numberToIndices;

        public NumberContainers() {
            indexToNumber = new HashMap<>();
            numberToIndices = new HashMap<>();
        }

        public void change(int index, int number) {
            if (indexToNumber.containsKey(index)) {
                int oldNumber = indexToNumber.get(index);
                if (oldNumber != number) {
                    numberToIndices.get(oldNumber).remove(index);
                }
            }

            indexToNumber.put(index, number);
            numberToIndices.putIfAbsent(number, new PriorityQueue<>());
            numberToIndices.get(number).add(index);
        }

        public int find(int number) {
            if (!numberToIndices.containsKey(number))
                return -1;

            PriorityQueue<Integer> minHeap = numberToIndices.get(number);
            while (!minHeap.isEmpty() && indexToNumber.get(minHeap.peek()) != number) {
                minHeap.poll(); // Remove outdated index
            }

            return minHeap.isEmpty() ? -1 : minHeap.peek();
        }
    }

    /**
     * Your NumberContainers object will be instantiated and called as such:
     * NumberContainers obj = new NumberContainers();
     * obj.change(index,number);
     * int param_2 = obj.find(number);
     */
}
