class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        Arrays.sort(nums);
        for(int i= 0 ; i< nums.length; i++){
            for(int j = i+1; j< nums.length;j++){
                if(nums[i] == nums[j]){
                    list.add(nums[i]);
                    break;
                }
            }
        }
        return list;
    }
}