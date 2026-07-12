class Solution {
    public void moveZeroes(int[] nums) {
        int current = 0,next = 1;
        
        while(next<=nums.length-1){
            if(nums[next]!=0 && nums[current]==0){
                int temp = nums[next];
                nums[next] = nums[current];
                nums[current] = temp;

                current++;
                next++;
            }else if(nums[current]!=0){
                next++;
                current++;
            }else{
                next++;
            }
        }
    }
}