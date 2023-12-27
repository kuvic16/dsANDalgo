package gfg;

import java.util.ArrayList;
import java.util.List;

public class GFG221223 {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> result = new ArrayList<>();


        for(int i=0; i<N; i++){
            int max = 0;
            ArrayList<Integer> r = new ArrayList<>();

            if (S[i] <= F[i]) {
                r.add(i + 1);
                max = F[i];
            }else continue;

            for(int j=i+1; j<N; j++) {
                if (S[j] <= F[j] && S[j] > max) {
                    r.add(j + 1);
                    max = F[j];
                }
            }
            if(r.size() > result.size()) result = r;
        }
        return result;
    }

    public static void main(String[] args){

        int N = 0;
        int[] S = {};
        int[] F = {};

        N = 6;
        S = new int[]{1,3,0,5,8,5};
        F = new int[]{2,4,6,7,9,9};

        N = 10;
        S = new int[]{12, 6 , 16, 12, 6 , 9 , 16, 6 , 17, 5 };
        F = new int[]{17, 13, 16, 18, 17, 10, 18, 12, 18, 11};

        ArrayList<Integer> result = maxMeetings(N,S,F);
        for(Integer r : result) System.out.print(r + " ");
    }
}
