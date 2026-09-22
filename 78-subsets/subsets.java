class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
    generate(nums, 0, new ArrayList<>(), ans);
    return ans;
    }
    public static void generate(int[] nums, int idx,List<Integer> current, List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        generate(nums, idx+1, current,ans);

        current.remove(current.size()-1);
        generate(nums, idx+1,current,ans);

    }
}