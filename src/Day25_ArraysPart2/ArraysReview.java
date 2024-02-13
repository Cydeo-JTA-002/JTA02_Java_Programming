package Day25_ArraysPart2;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {

        int[] nums = new int[8];
        nums[0] = -5;
        nums[1] = 500;
        nums[2] = 77;
        nums[3] = 5;
        nums[4] = 5;
        nums[5] = 66;
        nums[6] = 0;
        nums[7] = 600;

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
        System.out.println(nums[7]);
        System.out.println(nums[nums.length - 1]);
        System.out.println(nums[3] + 10);

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }
        // find the sum of all numbers in array nums

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
        }

        System.out.println("sum = " + sum);
        // find the average
        System.out.println(sum / nums.length);

        System.out.println("===========================");

        String[] names = {"David", "Utku", "Ali", "Deha", "Seif"};

        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

        System.out.println(names[1]);
        System.out.println(names[1].toUpperCase());
        System.out.println(names[1].charAt(0));
        System.out.println(names[2].charAt(0));

        System.out.println("============================");

        for (String each : names) {
            System.out.print(each.charAt(0) + " ");
            System.out.println(each);

        }

        for (int each : nums) {
            System.out.println(each);
        }

        System.out.println("______________________");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int [] nums2= new int[5];
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.equals(nums,nums2));
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
