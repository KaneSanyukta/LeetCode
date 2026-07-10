class Solution {
    public void sortColors(int[] nums) {
        int mid ,first;
        int last = nums.length -1;
        first = mid = 0;
        while(mid<=last){
            int temp = 0;
            if(nums[mid]==0){
                temp = nums[mid];
                nums[mid] = nums[first];
                nums[first] = temp;
                first += 1;
                mid += 1;
            }else if(nums[mid]==2){
                temp = nums[last];
                nums[last] = nums[mid];
                nums[mid] = temp;
                last -= 1;
            }else{
                mid+=1;
            }
        }
    }
}