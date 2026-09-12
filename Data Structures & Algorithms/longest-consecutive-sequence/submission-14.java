class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        } // 2,20,10,3,4,5
        int count=1,maxCount=1;

        //find minimum
        int min=Integer.MAX_VALUE;
        for(int ele:nums){
            if(ele<=min) min=ele;
        }
        int key=min;//key=2
        while(!set.isEmpty()){
            if(set.contains(key+1)){ //2 3 4 5
                count++;// 3
                set.remove(key); //20,10,5
                key++;//5
                
            }
            else{
                set.remove(key);//20,10
                min=Integer.MAX_VALUE;
                for(int ele:set){
                    if(ele<=min) min=ele;
                }
                key = min;
                maxCount = Math.max(count,maxCount);
                count=1;
            }
        }
        return maxCount;
    }
}
