package com.company;

public class _10_problem_solve_leetcode {
    public static void main(String[] args) {

        // Q. find even no. between array.
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]+",");
                count++;
            }
        }
        System.out.println(" are even numbers");
        System.out.println("how many even no. in array => " + count);



        int[] nums2={12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums2));
        System.out.println(digits(-56942));
        System.out.println(digits2(-569842));
    }

    // Q. Find Numbers with Even Number of Digits


    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    private static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }


    // Q.Richest Customer Wealth :
    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {

            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
               sum+=accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

