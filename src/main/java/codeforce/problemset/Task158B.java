package codeforce.problemset;

import java.util.Scanner;

public class Task158B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int taxi = 0;
        for(int i=0; i<n; i++){
            int groupMembers = in.nextInt();
            if(groupMembers == 4) taxi += 1;
            else sum += groupMembers;
        }

        int additionalTaxi = sum / 4;
        if(sum % 4 != 0){
            additionalTaxi += 1;
        }
        int totalTaxi = taxi + additionalTaxi;
        System.out.println(totalTaxi);
    }
}
