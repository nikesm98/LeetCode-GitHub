class Solution {
    public int findMin(int[] nums) {
        int s = 0 , h = nums.length-1;
        int ans = Integer. MAX_VALUE;
        while (s <= h){
            int mid = s + (h-s) / 2;
            if(nums[s] <= nums[h]){
                ans = Math.min(ans,nums[s]);
                break;
            }else if(nums[s] <= nums[mid]){
                ans = Math.min(ans,nums[s]);
                s = mid+1;
            }else{
                ans = Math.min(ans,nums[mid]);
                h = mid-1;
            }
        }
        return ans;
    }
}