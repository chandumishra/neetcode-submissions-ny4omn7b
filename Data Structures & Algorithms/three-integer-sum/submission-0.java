class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=n-1;
            int k=i+1;
            while(k<j){
                if(nums[i]+nums[j]+nums[k]==0){
                    ans.add(Arrays.asList(nums[i],nums[k],nums[j]));
                    k++;
                    j--;
                    while(k<j&&nums[k]==nums[k-1]) k++;
                    while(k<j&&nums[j]==nums[j+1]) j--;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    j--;
                }
                else{
                    k++;
                }
            }
        }
        
       return ans; 
    }
}
