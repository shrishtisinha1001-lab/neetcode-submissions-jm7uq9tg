class Solution {
    public int minimumRecolors(String blocks, int k) {

       //int n=blocks.length; //9
       //For taking out the window size use n-k+1 = 9-7+1 = 3
        //Windows of 7 can only be formed from index 3 to 9 = [3-9] = 7
        
        //FOR FIRST WINDOW
        int w=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            w++;
        }
        int res=w;
        int n=blocks.length();
        //next window
        for(int i=1;i<(n-k+1);i++)
        {
            if(blocks.charAt(i-1)=='W') w--;
            //Shifting to another window
            if(blocks.charAt(i+k-1)=='W') w++;

            res= Math.min(res,w);
        }

        return res;
        
    }
}