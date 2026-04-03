class Solution {
    public int maxDifference(String s) {

        int[] freq = new int[26];

        //COUNT FREQUENCY
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        int maxDiff=Integer.MIN_VALUE;
        boolean found=false;

        for(int i=0;i<26;i++)
        {
            if(freq[i]%2==1)
            {
                for(int j=0;j<26;j++)
                {
                    if(freq[j]>0 && freq[j]%2==0)
                    {
                        maxDiff=Math.max(maxDiff,freq[i]-freq[j]);
                        found=true;
                    }
                }
            }
        }
        return found? maxDiff:0;

        // int count=0;
        // for(int i=0;i<s.length();i++)
        // {

        //     count++;

        //     if(count%2==0)
        //     {
                
        //     }
        // }

        
    }
}