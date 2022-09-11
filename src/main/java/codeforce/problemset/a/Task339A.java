package codeforce.problemset.a;

import java.util.Scanner;

public class Task339A {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        String is = in.next();
        String[] nums = is.split("\\+");
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Integer.parseInt(nums[i]) > Integer.parseInt(nums[j])){
                    String tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        String r = "";
        for(int i=0; i<nums.length; i++){
            r += nums[i];
            if(i+1 != nums.length){
                r += "+";
            }
        }
        System.out.println(r);
    }
}
