class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if(pattern.length()!=arr.length)
        {
            return false;
        }
        HashMap<Character,String> hashmap = new HashMap();


        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);

            boolean containsKey = hashmap.containsKey(ch);

            if(hashmap.containsValue(arr[i]) && !containsKey)
            {
                return false;
            }
            if(containsKey && !hashmap.get(ch).equals(arr[i]))
            {
                return false;
            }
            else
            {
                hashmap.put(ch,arr[i]);
            }
         

        }

           return true;
        
    }
}