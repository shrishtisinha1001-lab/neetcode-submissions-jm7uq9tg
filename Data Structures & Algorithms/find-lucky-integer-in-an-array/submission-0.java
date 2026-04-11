class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        int max = -1;

        // Find lucky number
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
        
    }
    
}