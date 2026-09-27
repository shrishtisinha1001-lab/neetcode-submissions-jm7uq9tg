class Solution {
    public int mySqrt(int x) {
          if (x == 0) {
            return 0;
        }
         int left = 1;
        int right = x;

        // Stores the answer found so far
        int result = 1;

        while (left <= right) {

            // Find the middle number
            int mid = left + (right - left) / 2;

            // Use long because mid * mid can exceed int range
            long sqrd = (long) mid * mid;

            // Exact square root found
            if (sqrd == x) {
                return mid;
            }

            // mid is smaller than the square root
            else if (sqrd < x) {

                // mid can be a possible answer
                result = mid;

                // Search on the right side
                left = mid + 1;
            }

            // mid is bigger than the square root
            else {
                
                // Search on the left side
                right = mid - 1;
            }
        }

        // Return the integer square root
        return result;
        
    }
}