class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=0;
        Arrays.sort(nums);
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n-2;i++){
           int j=i+1;
           int k=n-1;
           while(j<k){
           int s=nums[i]+nums[j]+nums[k];
           int diff=Math.abs(s-target);
           if(min>diff){
            min=diff;
            res=s;
           }
           if(s<target){
            j++;
           }
           else if (s>target){
            k--;
           }
           if (s==target){
           return s;
           }
           }



        }
        return res;
        
    }
}