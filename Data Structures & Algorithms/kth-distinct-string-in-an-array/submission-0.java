class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Step 1: Count frequency
        for (String str : arr) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        // Step 2: Find kth distinct directly
        int count = 0;

        for (String str : arr) {
            if (hm.get(str) == 1) {
                count++;
                if (count == k) {
                    return str;
                }
            }
        }

        return "";
        
    }
}