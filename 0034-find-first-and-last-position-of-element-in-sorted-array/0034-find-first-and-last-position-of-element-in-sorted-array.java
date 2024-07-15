class Solution {
    public int first(int[] nums, int target,int n){
        int start = 0, end = n-1, ans=-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else end = mid-1;

        }

        return ans;
    }

    public int last(int[] nums, int target, int n ){
        int start = 0, end = n-1, ans=-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                ans = mid;
                start = mid+1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else end = mid-1;

        }

        return ans;
    }




    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        res[0] = first(nums, target, n);
        if(res[0] == -1) return new int [] {-1,-1};
        res[1] = last(nums, target, n); 
        return res;   
    }
}