class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                if(map.get(diff)<i){
                    ans[0]=map.get(diff);
                    ans[1]=i;
                    break;
                }
                else if(map.get(diff)>i){
                    ans[0]=i;
                    ans[1]=map.get(diff);
                    break;
                }
            }
        }
        return ans;
    }
}
