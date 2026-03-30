class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();                 // remove leading & trailing spaces
        String[] words = s.split(" "); // split into words
        return words[words.length - 1].length(); // last word length
    }
}