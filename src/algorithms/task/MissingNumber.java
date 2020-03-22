package algorithms.task;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (min > nums[i]) min = nums[i];
        }

        // TODO: think how to make it prettier
        int arithmeticalProgression = (int) ((min + min + nums.length) / 2.0F * (nums.length + 1));

        return arithmeticalProgression - sum;
    }
}
