class Solution {

    private boolean isPalindrome(String s,int left,int right)
    {
      while(left<right)
      {
        if(s.charAt(left)==s.charAt(right))
        {
          left++;
          right--;
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    public boolean validPalindrome(String s) {

        int left=0;
        int right= s.length()-1;

        while(left<right)
        {
          if(s.charAt(left)==s.charAt(right))
        {
          left++;
          right--;
        }
        else
        {
          //Try to delete 1 character from either of the two sides 
          //and check if Palindrome or not
          return isPalindrome(s,left+1,right)|| isPalindrome(s,left,right-1);

        }
      }
      return true;
        
    }
}