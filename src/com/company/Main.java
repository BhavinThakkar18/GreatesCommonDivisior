package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public  static int getGreatestCommonDivisor(int first, int second)
    {
        int ans=0;
        if(first<10 || second<10)
        {
            return -1;
        }
        if(first==second)
        {
            return first;
        }
        else if(first<second)
        {
            for(int i=(second/2)+1;i>0;i--)
            {
                if((first%i==0) && (second%i==0))
                {
                    ans=i;
                    break;
                }
            }
        }
        else{
            for(int i=(first/2)+1;i>0;i--)
            {
                if((first%i)==0 && (second%i)==0)
                {
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }

    public static  int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int ans=1;
        if(nums[l-1]==nums[0])
        {
            return nums[0];
        }
        else {
            for (int i = (nums[l - 1] / 2 + 1); i > 0; i--) {
                if (nums[l - 1] % i == 0 && nums[0] % i == 0) {
                    ans = i;
                    break;
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
	// write your code here
//        System.out.println(getGreatestCommonDivisor(12,30));
//        System.out.println(getGreatestCommonDivisor(25,15));
//        System.out.println(getGreatestCommonDivisor(9,18));
//        System.out.println(getGreatestCommonDivisor(81,153));
//        int[] array = new int[]{7,5,6,8,3};
        System.out.println(findGCD(new int[]{3,3}));
    }
}
