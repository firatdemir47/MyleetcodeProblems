/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemsolutions;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1*/
class Solution {

    public int singleNumber(int[] nums) {
        int num = 0;
        for (int number : nums) 
        {
            num = num ^ number;//xor işlemi yapılarak basit şekilde bulunur 
        }
        return num;
    }
}

public class problem2 {
     public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        Solution a = new Solution();
        int sayı = a.singleNumber(nums);
        System.out.println(sayı);

    }
}
