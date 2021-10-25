package Assignment2;

import java.util.*;
public class Indices {


    // Time complexity: O(n^2)
    private static int[] Indices(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the element of array : ");
        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        
        System.out.println("Enter Target value which we want : ");
        int target = keyboard.nextInt();

        keyboard.close();

        int[] indices = Indices(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
