class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        //1.Sanity Check
        if(word==null || abbr == null)
        {
            return false;
        }
        //2. Two Pointer Approach
        int a=0;
        int b=0;

        while(a<word.length() && b< abbr.length())
        {
            //abbr points to a Digit
            if(Character.isDigit(abbr.charAt(b)))
            {
                if(abbr.charAt(b)=='0')
                {
                    return false;
                }
                int total=0;
                while(b<abbr.length() && Character.isDigit(abbr.charAt(b)))
                {
                    total = total*10 +abbr.charAt(b)-'0';
                    b++;
                }
                a+=total;
            }
            else
            {
                //both pointing to letters
                if(word.charAt(a)!=abbr.charAt(b))
                {
                    return false;
                }
                a++;
                b++;
            }

        }
        return a==word.length() && b==abbr.length();
        
        
    }
}