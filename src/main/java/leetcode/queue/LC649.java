package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC649 {
    public String predictPartyVictoryX(String senate) {
        Queue<Character> queue = new LinkedList<>();
        Character old = null;
        for(int i=0; i<senate.length(); i++){
            if(old == null) {queue.add(senate.charAt(i)); old = senate.charAt(i);}
            else if(old != senate.charAt(i)) {queue.add(senate.charAt(i)); old = null;}
        }

        boolean prevSenateLostRight = false;
        for(int i=0; i<queue.size(); i++){
            if(i == 0) {continue;}
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

    public String predictPartyVictory(String senate) {
        Queue<Character> team1 = new LinkedList<>();
        Queue<Character> team2 = new LinkedList<>();
        Character first = null;
        for(int i=0; i<senate.length(); i++){
            char c = senate.charAt(i);
            if(i == 0) first = c;
            if(c == first) team1.add(c);
            else team2.add(c);
        }

        // DDRRR
        while(!team1.isEmpty() && !team2.isEmpty()){
            team2.poll();
            if(!team2.isEmpty()) {
                team1.poll();
                if(!team1.isEmpty())
                    team2.poll();
            }
        }

        Character r = !team1.isEmpty() ? team1.poll() : team2.poll();


        return r == 'R' ? "Radiant" : "Dire";
    }
}

class LC649Test {
    public static void main(String[] args){
        LC649 lc649 = new LC649();
//        System.out.println(lc649.predictPartyVictory("RD")); //Radiant
//        System.out.println(lc649.predictPartyVictory("RDD")); //Dire
//        System.out.println(lc649.predictPartyVictory("DDRRR")); //Dire
//        System.out.println(lc649.predictPartyVictory("DDR")); //Dire
        System.out.println(lc649.predictPartyVictory("DRRDRDRDRDDRDRDR")); //Radiant
    }
}

DRRDRDRDRDDRDRDR
