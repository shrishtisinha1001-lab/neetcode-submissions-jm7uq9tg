class Solution {

    public char getVal(char ch) {
        switch (ch) {
            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            default: return ' ';
        }
    }

    public boolean isValid(String s) {

        String open = "({[";

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (open.indexOf(ch) != -1) {

                // Opening bracket
                st.push(ch);

            } else {

                // Closing bracket
                if (st.size() == 0) {
                    return false;
                }

                char temp = st.pop();

                if (getVal(ch) != temp) {
                    return false;
                }
            }
        }

        return st.size() == 0;
    }
}