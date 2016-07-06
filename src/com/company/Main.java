package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

    }
    public String doubleChar(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            String appendThis = Character.toString(str.charAt(i));
            result += appendThis + appendThis;
        }
        return result;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && (cigars <= 60 || isWeekend));
    }

    public int[] rotateLeft3(int[] nums) {
        int[] resultArr = new int[3];
        for (int i = 0; i < nums.length; i++)
            resultArr[i] = nums[(i + 1) % 3];
        return resultArr;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;
    }
    
    public boolean makeBricks(int small, int big, int goal) {
        return big * 5 >= goal ? (goal % 5) <= small : (goal - 5 * big) <= small;
    }
}
