package leetcode.stack;

import java.util.Iterator;
import java.util.Stack;

public class LC735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while(i<asteroids.length){
            if(!stack.isEmpty()){
                if(stack.peek() > 0 && asteroids[i] < 0){
                    if(stack.peek() < asteroids[i] * -1) {stack.pop(); continue;}
                    else if(stack.peek() == asteroids[i] * -1) {stack.pop();}
                }else stack.push(asteroids[i]);
            }else{
                stack.push(asteroids[i]);
            }
            i+=1;
        }

        int[] result = new int[stack.size()];
        int j = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[j--] = stack.pop();
        }
        return result;
    }
}

class LC735Test {
    public static void main(String[] args){
        LC735 lc735 = new LC735();
        //int[] result = lc735.asteroidCollision(new int[]{5,10,-5});
        //int[] result = lc735.asteroidCollision(new int[]{8,-8});
        //int[] result = lc735.asteroidCollision(new int[]{10,2,-5});
        int[] result = lc735.asteroidCollision(new int[]{-2,-1,1,2});
        //int[] result = lc735.asteroidCollision(new int[]{-2,-2,-2,-2});
        for(int r : result) System.out.print(r + " ");
    }
}