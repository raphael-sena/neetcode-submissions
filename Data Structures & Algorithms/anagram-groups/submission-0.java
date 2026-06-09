class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> ordered = new ArrayList<>();

        for (String s : strs) {
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            ordered.add(new String(sChars));
        }

        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < ordered.size(); i++) {
            if (visited[i]) continue;
            
            List<String> newList = new ArrayList<>();
            newList.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < ordered.size(); j++) {

                if (ordered.get(i).equals(ordered.get(j))) {
                    newList.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(newList);
        }

        return ans;
    }
}