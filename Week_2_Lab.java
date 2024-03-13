import java.util.Arrays;

public class Week_2_Lab {

    public static void main(String[] args) {
        int[] temperatures = new int[] {4,5,6,7,8};
        Solution obj = new Solution();
        int[] output = obj.getIndices(temperatures, 14);
        System.out.println(Arrays.toString(output));
    }
    
}

class Solution {

    public Solution() {}

    public int[] getIndices(int[] nums, int target) {
        int num1 = 0;
        int num2 = 0;
        

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
                    num1 = nums[i];
                    num2 = nums[j];
                    return new int[] {num1, num2};
                }
            }
        }
        return new int[0];
    }
}