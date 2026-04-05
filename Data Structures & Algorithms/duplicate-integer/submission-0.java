class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        if(nums.length != s.size()){

         return true;
        }
        return false;
    }
}