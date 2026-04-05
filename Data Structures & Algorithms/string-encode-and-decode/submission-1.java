class Solution {

    public String encode(List<String> strs) {
            StringBuilder sb=new StringBuilder();
            for(String s:strs){
                sb.append(s.length()+"@@@"+s);
            }
            return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> ans=new ArrayList<>();
         int i=0;
         while(i<str.length()){
            int j=i;
            while(!(str.charAt(j) == '@' && str.charAt(j+1) == '@' && str.charAt(j+2) == '@')){
                 j++;
            } 
            int detectNum=Integer.parseInt(str.substring(i,j));
            j+=3;
            String extractWord=str.substring(j,j+detectNum);
            ans.add(extractWord);
            i=j+detectNum;
         }
         return ans;
    }
}
