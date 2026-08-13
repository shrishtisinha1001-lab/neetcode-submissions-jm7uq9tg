class Solution {
    public boolean isPalindrome(String s) {

        //COVERT THE GIVEN STRING TO LOWER CASE ALL CHARACTERS AND REPLACE 
        //THE SPECIAL CHARACTERS(NEGATION OF ALPHABETS AND NUMBERS WITH NO SPACE)
        s= s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        //START TWO POINTER APPROACH WITH START AND END POINTERS
        int i=0;
        int j=s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
