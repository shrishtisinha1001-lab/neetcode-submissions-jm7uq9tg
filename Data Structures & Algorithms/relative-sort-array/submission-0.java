class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] cnt = new int[1001];
        for(int num:arr1)
        {
            cnt[num]++;
        }
        int i=0;
        for(int num:arr2)
        {
            while(cnt[num]-- >0)
            {
                arr1[i++] = num;
            }
        }
        for(int num=0;num<cnt.length;num++)
        {
            while(cnt[num]-- >0)
            {
                arr1[i++]= num;
            }
        }
        return arr1;
        
    }
}