package codeforce.problemset.b;

import java.util.Scanner;

public class Task158B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int taxi = 0;
        int four = 0, three=0, two=0, one=0;

        for(int i=0; i<n; i++){
            int groupMembers = in.nextInt();
            if(groupMembers == 4) four += 1;
            if(groupMembers == 3) three += 1;
            if(groupMembers == 2) two += 1;
            if(groupMembers == 1) one += 1;
        }

        taxi = four;
        if(three > 0){
            one = (one >= three) ? one - three : 0;
            taxi += three;
        }

        int totalTwo = (two * 2) + one;
        if(totalTwo > 4) {
            taxi += totalTwo / 4;
            taxi += totalTwo % 4 != 0 ? 1 : 0;
        }else if(totalTwo > 0){
            taxi += 1;
        }
        System.out.println(taxi);
    }
}
