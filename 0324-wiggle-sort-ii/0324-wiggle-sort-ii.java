class Solution {
    public void wiggleSort(int[] nums) {
        int size = nums.length;
        int[] copyNums = nums.clone();
        Arrays.sort(copyNums);

        int mid = (size+1)/2;
        int left = mid - 1;
        int right = size-1;

        for(int i =0;i<size;i++){
            if(i%2==0){
                nums[i] = copyNums[left--];
            }else{
                nums[i] = copyNums[right--];
            }
        }
    }
}
