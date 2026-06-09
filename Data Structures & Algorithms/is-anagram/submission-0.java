class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String ogS = new String(sChars);
        String ogT = new String(tChars);

        if (ogS.equals(ogT)) {
            return true;
        }
        
        return false;
    }
}
