class Solution {
    public int[] applyOperations(int[] nums) {
        int current = 0,next = 1;

        while(next<=nums.length-1){
            if(nums[current]==nums[next]){
                nums[current] *= 2;
                nums[next] = 0;
            }
            next++;
            current++;
            
        }
        current = 0;
        next = 1;

        while(next<=nums.length-1){
            if(nums[current]==0 && nums[next]!=0){
                int temp = nums[current];
                nums[current++] = nums[next];
                nums[next] = temp;
            }
            if(nums[current]!=0){
                current++;
            }
            next++;
        }

        return nums;
    }
}