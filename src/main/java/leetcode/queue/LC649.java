package leetcode.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    public String predictPartyVictoryX2(String senate) {
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

    public String predictPartyVictory(String senate) {
        List<Character> list = new ArrayList<>();
        for(int i=0; i<senate.length(); i++){
            list.add(senate.charAt(i));
        }

        boolean victory = false;
        while(!victory){
            Character prev = null;
            int i=0;
            while(i<list.size()){
                Character curr = list.get(i);
                int j=0; boolean found = false;
                while(j<list.size()){
                    if(i != j){
                        if(list.get(i) != list.get(j)){
                            list.remove(j);
                            found = true;
                            break;
                        }
                    }
                    j++;
                }
                i++;
                if(!found){victory = true; break;}
            }
            break;
        }
        return list.get(0) == 'R' ? "Radiant" : "Dire";
    }
}

class LC649Test {
    public static void main(String[] args){
        LC649 lc649 = new LC649();
//        System.out.println(lc649.predictPartyVictory("RD")); //Radiant
//        System.out.println(lc649.predictPartyVictory("RDD")); //Dire
//        System.out.println(lc649.predictPartyVictory("DDRRR")); //Dire
//        System.out.println(lc649.predictPartyVictory("DDR")); //Dire
//        System.out.println(lc649.predictPartyVictory("DRRDRDRDRDDRDRDR")); //Radiant
        System.out.println(lc649.predictPartyVictory("DDRRRR")); //Radiant
    }
}

/**

 In the world of Dota2, there are two parties: the Radiant and the Dire.

 The Dota2 senate consists of senators coming from two parties.
 Now the Senate wants to decide on a change in the Dota2 game.
 The voting for this change is a round-based procedure.
 In each round, each senator can exercise one of the two rights:

 Ban one senator's right: A senator can make another senator lose all his rights in this
 and all the following rounds.

 Announce the victory: If this senator found the senators who still have rights to vote are
 all from the same party, he can announce the victory and decide on the change in the game.

 Given a string senate representing each senator's party belonging.
 The character 'R' and 'D' represent the Radiant party and the Dire party.
 Then if there are n senators, the size of the given string will be n.

 The round-based procedure starts from the first senator to the last senator in the given order.
 This procedure will last until the end of voting.
 All the senators who have lost their rights will be skipped during the procedure.

 Suppose every senator is smart enough and will play the best strategy for his own party.
 Predict which party will finally announce the victory and change the Dota2 game.
 The output should be "Radiant" or "Dire".



 Example 1:

 Input: senate = "RD"
 Output: "Radiant"
 Explanation:
 The first senator comes from Radiant and he can just ban the next senator's right in round 1.
 And the second senator can't exercise any rights anymore since his right has been banned.
 And in round 2, the first senator can just announce the victory since he is the only guy in the senate
 who can vote.
 Example 2:

 Input: senate = "RDD"
 Output: "Dire"
 Explanation:
 The first senator comes from Radiant and he can just ban the next senator's right in round 1.
 And the second senator can't exercise any rights anymore since his right has been banned.
 And the third senator comes from Dire and he can ban the first senator's right in round 1.
 And in round 2, the third senator can just announce the victory since he is the only guy in the
 senate who can vote.


 DDRRR - Dire
 Round 1
 1. D -> ban R (index 3)
 2. D -> ban R (index 4)
 3. R -> No right
 4. R -> No right
 5. R -> ban D (index 1)

 Round 2
 2. D -> ban R (index 5)
 5. R -> No right

 Round 3
 2. D -> [[Announce victory]]


 DDR - Dire
 Round 1
 1. D -> ban R (index 3)
 2. D -> [[Announce victory]]


 DRRDRDRDRDDRDRDR - Radiant
 Round 1
 1. D -> ban R (index 2)
 2. R -> No right
 3. R -> ban D (index 4)
 4. D -> No right
 5. R -> ban D (index 6)
 6. D -> No right
 7. R -> ban D (index 8)
 8. D -> No right
 9. R -> ban D (index 10)
 10. D -> No right
 11. D -> ban R (index 12)
 12. R -> No right
 13. D -> ban R (index 14)
 14. R -> No right
 15. D -> ban R (index 16)
 16. R -> No right

 Round 2
 1. D -> ban R (index 3)
 3. R -> No right
 5. R -> ban D (index 11)
 7. R -> ban D (index 13)
 9. R -> ban D (index 15)
 11. D -> No right
 13. D -> No right
 15. D -> No right


 Round 3
 1. D -> ban R (index 5)
 5. R -> No right
 7. R -> ban D (index 1)
 9. R -> [[Announce victory]]


 **/
