package LEETCODE;
//arrays practice
import java.util.*;

class ThreeSumSolver {

    int[] nums = {-1,0,1,2,-1,-4};

    public List<List<Integer>> findTriplets() {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);  // Step 1: sort array

        for(int i = 0; i < nums.length - 2; i++) {

            // skip duplicates for i
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // skip duplicates for right
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if(sum < 0) {
                    left++;   // need bigger sum
                } else {
                    right--;  // need smaller sum
                }
            }
        }

        return result;
    }
}

public class ThreeSumMain {

    public static void main(String[] args) {

        ThreeSumSolver obj = new ThreeSumSolver();

        System.out.println("Array: [-1,0,1,2,-1,-4]");

        List<List<Integer>> result = obj.findTriplets();

        System.out.println("Triplets are: " + result);
    }
}