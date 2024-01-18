class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        return Arrays.equals(s1Chars, s2Chars);
    }
}
