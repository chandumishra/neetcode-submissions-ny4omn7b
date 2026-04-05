class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();
        //List<String> subans=new ArrayList<>();
        for(String s1:strs){
            char[] currentstring=s1.toCharArray();
            Arrays.sort(currentstring);
            String s=new String(currentstring);
            if(!ans.containsKey(s)){
                ans.put(s,new ArrayList<>());
            }
            ans.get(s).add(s1);

        }
        return new ArrayList<>(ans.values());
    }
}