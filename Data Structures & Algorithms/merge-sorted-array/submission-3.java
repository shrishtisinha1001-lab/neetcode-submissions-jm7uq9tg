class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        //LAST ELEMENT INDEX OF NUMS1 ARRAY = k

        while(j>=0)
        {
            //if i is greater than j
            if(i>=0 && nums1[i]>=nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--; //if i is greater
            }
            else
            {
                //IF J ELEMENT IS GREATER THAN I
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }


     
        
    }
}
