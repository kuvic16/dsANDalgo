package leetcode.graph.dfs;

import java.util.*;

public class LC399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] result = {};

        Map<String, List<Object[]>> adjList = new HashMap<>();
        for(int i=0; i<equations.size(); i++){
            double value = values[i];
            String source = equations.get(i).get(0);
            String destination = equations.get(i).get(1);

            Object[] edgeAndCost = {destination, value};
            Object[] reverseEdgeAndCost = {source, 1/value};

            // source -> destination
            if(adjList.containsKey(source)){
                adjList.get(source).add(edgeAndCost);
            }else{
                List<Object[]> adj = new ArrayList<>();
                adj.add(edgeAndCost);
                adjList.put(source, adj);
            }

            // destination -> source
            if(adjList.containsKey(destination)){
                adjList.get(destination).add(reverseEdgeAndCost);
            }else{
                List<Object[]> adj = new ArrayList<>();
                adj.add(reverseEdgeAndCost);
                adjList.put(destination, adj);
            }
        }

        return result;
    }

    public static void main(String[] args){
        LC399 lc399 = new LC399();
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.stream(new String[]{"a", "b"}).toList());
        equations.add(Arrays.stream(new String[]{"b", "c"}).toList());
        double[] values = {2, 3};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.stream(new String[]{"a", "c"}).toList());
        queries.add(Arrays.stream(new String[]{"b", "a"}).toList());
        queries.add(Arrays.stream(new String[]{"a", "e"}).toList());
        queries.add(Arrays.stream(new String[]{"a", "a"}).toList());
        queries.add(Arrays.stream(new String[]{"x", "x"}).toList());

        double[] result = lc399.calcEquation(equations, values, queries);

    }
}
