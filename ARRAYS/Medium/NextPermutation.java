import java.util.Arrays;

public class NextPermutation {
    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse the whole array
        if (index == -1) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }

        // Step 3: Find the first greater element from the right
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix
        int left = index + 1, right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        NextPermutation obj = new NextPermutation();

        int[] nums = {6,8,7,1,3,4,5,8,9,9};

        System.out.println("Before: " + Arrays.toString(nums));

        obj.nextPermutation(nums);

        System.out.println("After : " + Arrays.toString(nums));
    }
}