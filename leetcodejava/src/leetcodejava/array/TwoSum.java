package leetcodejava.array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int[] results = new int[2];
        
        for(int i=0; i<nums.length-1; i++){
            int left = nums[i];
            
            for(int j=i+1; j<nums.length; j++){
                int right = nums[j];
                
                if(left + right == target){
                    results[0] = i;
                    results[1] = j;
                }
            }
        }
        
        return results;
        
    }
}
