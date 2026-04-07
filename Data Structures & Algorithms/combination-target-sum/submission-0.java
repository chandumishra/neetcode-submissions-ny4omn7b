class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans =new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,0,nums,res,target);
        return ans;
    }
    private void helper(int i,int total,int[] nums,List<Integer> res,int target){
        if(total==target){
            ans.add(new ArrayList<>(res));
            return;
        }
        
        for(int j=i;j<nums.length;j++){
            if(total+nums[j]>target){
                return;
            }
            res.add(nums[j]);
            helper(j,total+nums[j],nums,res,target);
            res.remove(res.size()-1);
        }
    }

}
