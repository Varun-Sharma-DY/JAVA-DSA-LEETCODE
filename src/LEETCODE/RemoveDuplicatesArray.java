package LEETCODE;

class RemoveDup {

    int[] nums = {0,0,1,1,1,2,2,3,3,4};

    public int removeDuplicates() {

        int k = 1;  // first element is always unique

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {

                nums[k] = nums[i];
                k++;

            }
        }

        return k;
    }

    public void printArray(int k) {

        System.out.print("Array after removing duplicates: ");

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

}

public class RemoveDuplicatesArray {

    public static void main(String[] args) {

        RemoveDup rd = new RemoveDup();

        System.out.println("Original array: {0,0,1,1,1,2,2,3,3,4 }");

        int k = rd.removeDuplicates();

        System.out.println("Number of unique elements: " + k);

        rd.printArray(k);

    }
}