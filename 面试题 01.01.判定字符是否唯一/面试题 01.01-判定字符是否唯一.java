class Solution {
    public boolean isUnique(String astr) {
        Set<Character> uniqueSet = new HashSet<>(astr.length());
        for (char character : astr.toCharArray()) {
            if (!uniqueSet.add(character)) {
                return false;
            }
        }
        return true;
    }
}
