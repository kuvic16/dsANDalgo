package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC649 {
    public String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<senate.length(); i++){
            if(!queue.contains(senate.charAt(i))) queue.add(senate.charAt(i));
        }

        boolean prevSenateLostRight = false; Character old = null;
        for(int i=0; i<queue.size(); i++){
            if(old == null) {old = queue.peek(); continue;}
            if (prevSenateLostRight) {
                prevSenateLostRight = false;
                queue.poll();
            }else{
                prevSenateLostRight = true;
                queue.remove();
            }

        }
        return !queue.isEmpty() && queue.peek() == 'R' ? "Radiant" : "Dire";
    }
}

class LC649Test {
    public static void main(String[] args){
        LC649 lc649 = new LC649();
        System.out.println(lc649.predictPartyVictory("RDD"));
        //System.out.println(lc649.predictPartyVictory("DDR"));
    }
}
