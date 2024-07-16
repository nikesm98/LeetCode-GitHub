class Solution {
    public int search(int[] nums, int target) {
        int s = 0 , h = nums.length-1;
        while (s <= h){
            int mid = s + (h-s) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[s] <= nums[mid]){
                if((target >= nums[s]) && (target <= nums[mid])) { 
                    h = mid-1;
                }else{
                    s = mid+1;
                }
            }else{
                if((target >= nums[mid]) && (target <= nums[h])) { 
                    s = mid+1;
                }else{
                    h = mid-1;
                }
            }
        }
        return -1;
    }
}