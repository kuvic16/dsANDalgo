package leetcode.beginners_guide;

/**
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 *
 */
public class StepsToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            if(num % 2 != 0){
                num -= 1;
            }else {
                num /= 2;
            }
            steps++;
        }
        return steps;
    }
}

class StepsToZeroTest{
    public static void main(String[] args){
        StepsToZero stepsToZero = new StepsToZero();
        System.out.println(stepsToZero.numberOfSteps(14));
    }
}


