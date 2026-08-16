class Solution {
    public int searchInsert(int[] nums, int target) {
        //binary Search = Divide and Conquer = O(log n)
        int left=0;
        int right=nums.length-1;
        int mid;

        while(left<=right)
        {
            mid= left+(right-left)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left= mid+1;
            }
            
        }
        return left;
        
    }
}