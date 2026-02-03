package lc;

public class LC3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0, left = 0, right = 0;
        for(int i = 0; i<colors.length; i++){
            if(i == 0) left = colors.length - 1;
            else left = i - 1;
            if(i == colors.length - 1) right = 0;
            else right = right + 1;

            if(colors[left] != colors[i] && colors[i] != colors[right]) count++;
        }
        return count;
    }
}


class LC3206Test {
    public static void main(String[] args){
        LC3206 lc3206 = new LC3206();
        int[] colors = {0,1,0,0,1};
        int result = lc3206.numberOfAlternatingGroups(colors);
        System.out.println(result);
    }
}