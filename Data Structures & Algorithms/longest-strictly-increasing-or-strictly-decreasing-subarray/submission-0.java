class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        //RETURN THE LENGTH OF THE LONGEST SUBARRAY
       /*Input: nums = [1,4,3,3,2]

         Output: 2

            Explanation:

         The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

         The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

          Hence, we return 2. */
          int increasing=1,decreasing=1;
          int longest =1;

         for(int i=1;i<nums.length;i++)
          {
            if(nums[i-1]<nums[i])
            {
                increasing++;
                decreasing=1;//SHOULD BE SET TO 1

            }
            else if(nums[i-1]>nums[i])
            {
                decreasing++;
                increasing=1;
            }
            else
            {
                increasing=1;
                decreasing=1;
            }
            longest = Math.max(longest,Math.max(increasing,decreasing));
        }

        return longest;
        
    }
}