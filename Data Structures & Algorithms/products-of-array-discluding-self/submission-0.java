class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int curprod=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
               curprod=nums[j]*curprod;
                }
            }
            ans[i]=curprod;
        }
        return ans;
    }
}  
