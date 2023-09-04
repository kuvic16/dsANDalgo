package leetcode.contest.Contest361;

public class LC8040 {
    public int minimumOperations(String num) {
        int count = 0; StringBuilder snum = new StringBuilder(num);
        if(snum.length() == 0){return 1;}
        while(true){
            int l = snum.length();
            if(l < 2) {if(snum.charAt(l-1) != '0') count +=1; break;}
            if(snum.charAt(l-2) == '0' && snum.charAt(l-1) == '0') break;
            if(Integer.valueOf(snum.substring(l-2, l)) % 25 == 0) break;
            if(snum.charAt(l-1) != '0') {snum.deleteCharAt(l-1);count++;continue;}
            if(snum.charAt(l-2) != '0') {snum.deleteCharAt(l-2);count++; continue;}
        }
        return count;
    }
}

class LC8040Test {
    public static void main(String[] args){
        LC8040 lc8040 = new LC8040();
        //System.out.println(lc8040.minimumOperations("2245047"));
        //System.out.println(lc8040.minimumOperations("2908305")); 
        //System.out.println(lc8040.minimumOperations("11"));
        //System.out.println(lc8040.minimumOperations("2713539"));
        System.out.println(lc8040.minimumOperations("2810533"));
    }
}
