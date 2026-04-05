
class Solution {
    public int characterReplacement(String s, int k) {
      Map<Character,Integer> map=new HashMap<>();
      int l=0;
      int r=0;
      int cnt=0;
      int maxfreq=0;
      while(r<s.length()){
        char ch=s.charAt(r);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq, map.get(ch));
        if((r-l+1)-maxfreq>k){
        char left=s.charAt(l);
        map.put(left,map.get(left)-1);
        l++;
        }
        cnt=Math.max(cnt,(r-l+1));
        r++;
      }
      return cnt;
    }
}