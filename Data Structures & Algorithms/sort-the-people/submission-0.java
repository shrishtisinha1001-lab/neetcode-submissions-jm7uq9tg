class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

       //I WANT TO SORT BY HEIGHT SO KEY SHOULD BE THE HEIGHT
        HashMap<Integer,String> hm = new HashMap<>();

        for(int i=0;i<names.length;i++)
        {
            hm.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        String result[] = new String[names.length];

        for(int i=0;i<heights.length;i++)
        {
            result[i] = hm.get(heights[heights.length-1-i]);
        }

        return result;

    }
}