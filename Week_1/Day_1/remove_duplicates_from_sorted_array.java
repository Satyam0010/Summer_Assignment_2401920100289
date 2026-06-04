package Week_1.Day_1;

class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1 ; i < nums.length;i++){
            if(nums[k] != nums[i]){
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}