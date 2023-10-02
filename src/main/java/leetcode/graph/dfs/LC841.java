package leetcode.graph.dfs;

import java.util.*;

public class LC841 {

    Stack<Integer> visited = new Stack<Integer>();
    List<List<Integer>> adjLists;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        adjLists = rooms;
        traverse(0);
        return visited.size() == rooms.size();
    }

    public void traverse(int vertex){
        visited.push(vertex);
        //System.out.println(vertex + " ");

        List<Integer> room = adjLists.get(vertex);
        for(Integer index  : room){
            if(!visited.contains(index)) traverse(index);
        }
    }
}

class LC841Test {
    public static void main(String[] args){
        LC841 lc841 = new LC841();

        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room = new ArrayList<>();

        room = new ArrayList<>();
        room.add(1);
        rooms.add(room);

        room = new ArrayList<>();
        room.add(2);
        rooms.add(room);

        room = new ArrayList<>();
        room.add(3);
        rooms.add(room);

        room = new ArrayList<>();
        rooms.add(room);


        System.out.println(lc841.canVisitAllRooms(rooms));
    }
}