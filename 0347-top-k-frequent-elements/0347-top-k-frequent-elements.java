class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
           
        }

        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            pq.add(m.getKey());

            if (pq.size() > k) pq.poll();
        }

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;

    }
}