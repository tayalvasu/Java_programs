package programs;

public class SumElementsWithKSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int sumOfElementsWithKSetBits(int[] nums, int k) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countSetBits(i) == k) {
                totalSum += nums[i];
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 3};
        int k = 2;
        int result = sumOfElementsWithKSetBits(nums, k);
        System.out.println("Sum of elements with " + k + " set bits in indices: " + result);
    }
}
