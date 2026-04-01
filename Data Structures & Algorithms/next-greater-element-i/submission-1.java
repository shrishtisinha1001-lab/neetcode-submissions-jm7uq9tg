class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {

            // Resolve all smaller elements in stack
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }

            // Push current element
            stack.push(nums2[i]);
        }

        // Build result
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
        
    }
}