class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                //if not found
                //KEY = ELEMENT , VALUE = INDEX
                hm.put(nums[i],i);
            }
        }

        return false;
        
    }
}