class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> subans = new ArrayList<>();
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);

            subans.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j]) continue;

                char[] s1 = strs[j].toCharArray();
                Arrays.sort(s1);

                if (Arrays.equals(s, s1)) {
                    subans.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(subans);
        }
        return ans;
    }
}