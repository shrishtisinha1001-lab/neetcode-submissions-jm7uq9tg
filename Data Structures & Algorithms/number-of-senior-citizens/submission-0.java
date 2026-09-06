class Solution {
    public int countSeniors(String[] details) {

        int count=0;

        for(String detail:details)
        {
            //7868190130M7522
            String age = detail.substring(11,13);

            //convert substring to integer
            int ageVal = Integer.parseInt(age);

            if(ageVal>60)
            {
                count++;
            }

        }
        return count;
        
    }
}