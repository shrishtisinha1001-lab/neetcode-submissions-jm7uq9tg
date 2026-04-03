class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character,Integer> hm = new HashMap<>();

        hm.put('b',0);
        hm.put('a',0);
        hm.put('l',0);
        hm.put('o',0);
        hm.put('n',0);

        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
        }

        int min= hm.get('b');
        min = Math.min(min,hm.get('a'));
        min = Math.min(min,hm.get('l')/2);
        min = Math.min(min,hm.get('o')/2);
        min = Math.min(min,hm.get('n'));
        
        return min;

        
        
    }
}