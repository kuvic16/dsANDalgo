package codeforce.problemset.c;

import java.util.ArrayList;
import java.util.List;

public class Task1729C {
    public static void main(String[] args){
        char[] letter = new char[]{'$', 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String tiles = "codeforces";
        char[] tc = tiles.toCharArray();
        int fi = findIndex(letter, tc[0]);
        int li = findIndex(letter, tc[tiles.length()-1]);
        if(fi > li){
            int tmp = fi;
            fi = li;
            li = tmp;
        }
        int m = li - fi;

        for(int i=0; i<tc.length; i++){
            for(int j=i+1; j<tc.length; j++){
                if(tc[i] > tc[j]){
                    char tmp = tc[i];
                    tc[i] = tc[j];
                    tc[j] = tmp;
                }
            }
        }

        //int[] jumps = new int[tc.length];
        List<Integer> jumps = new ArrayList<>();
        int ji = 0;
//        jumps[ji++] = 1;
//        jumps[m-1] = tc.length;
        jumps.add(1);

        int globalc = 0, counter =0;
        for(int j=fi+1; j<li; j++) {
            boolean hasFound = false;
            for (int i = 0; i <tc.length; i++) {
                if(tc[i] == letter[j]){
                    hasFound = true;
                    break;
                }
            }
            counter += 1;
            if(hasFound){
        //        jumps[ji++] = globalc + counter;
                jumps.add(globalc + counter);
                globalc += 1;
                counter = 0;
            }

        }
        jumps.add(tc.length);

        System.out.print(m + " ");
        System.out.println(jumps.size() + " ");
        for(Integer i : jumps){
            System.out.print(i + " ");
        }
    }

    public static int findIndex(char[] letter, char source){
        for(int i=0; i<letter.length; i++){
            if(letter[i] == source) return i;
        }
        return 0;
    }
}
