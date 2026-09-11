class Solution {
    int removeDuplicates(int[] nums) {
        int r=0;int l=0;
        while(r<nums.length){
            nums[l]=nums[r];
            while(r<nums.length&&nums[r]==nums[l]){
                r++;
            }
            l++;
        }
        return l;
    }
}

