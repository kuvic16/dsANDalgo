package leetcode.graph.dfs;

import java.util.*;

public class LC399 {

    Map<String, List<Object[]>> adjList = new HashMap<>();
    double gcost = 1;
    List<String> visited = new ArrayList<>();
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
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

        double[] result = new double[queries.size()];
        for(int i=0; i<queries.size(); i++){
            String q1 = queries.get(i).get(0);
            String q2 = queries.get(i).get(1);
            gcost = -1;
            visited = new ArrayList<>();
            traverse(q1, q2, 1);
            result[i] = gcost;
        }
        return result;
    }

    public void traverse(String source, String destination, double cost){
        if(!adjList.containsKey(source)) {
            gcost = -1;
            return;
        }
        if(source.equalsIgnoreCase(destination)) {
            gcost = 1;
            return;
        }
        visited.add(source);
        List<Object[]> nodes = adjList.get(source);
        for(Object[] node : nodes){
            if(!visited.contains(String.valueOf(node[0]))) {
                if (String.valueOf(node[0]).equalsIgnoreCase(destination)) {
                    gcost = cost * Double.parseDouble(node[1].toString());
                    return;
                }else {
                    traverse(String.valueOf(node[0]), destination, cost * Double.parseDouble(node[1].toString()));
                }
            }
        }
    }

    public static void main(String[] args){
        LC399 lc399 = new LC399();
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.stream(new String[]{"a", "b"}).toList());
        equations.add(Arrays.stream(new String[]{"b", "c"}).toList());
        double[] values = {2, 3};
        List<List<String>> queries = new ArrayList<>();
//        queries.add(Arrays.stream(new String[]{"a", "c"}).toList());
//        queries.add(Arrays.stream(new String[]{"b", "a"}).toList());
        queries.add(Arrays.stream(new String[]{"a", "e"}).toList());
//        queries.add(Arrays.stream(new String[]{"a", "a"}).toList());
//        queries.add(Arrays.stream(new String[]{"x", "x"}).toList());


//        equations.add(Arrays.stream(new String[]{"a", "b"}).toList());
//        equations.add(Arrays.stream(new String[]{"b", "c"}).toList());
//        equations.add(Arrays.stream(new String[]{"bc", "cd"}).toList());
//        double[] values = {1.5,2.5,5.0};
//        List<List<String>> queries = new ArrayList<>();
//        queries.add(Arrays.stream(new String[]{"a", "c"}).toList());
//        queries.add(Arrays.stream(new String[]{"c", "b"}).toList());
//        queries.add(Arrays.stream(new String[]{"bc", "cd"}).toList());
//        queries.add(Arrays.stream(new String[]{"cd", "bc"}).toList());

//        equations.add(Arrays.stream(new String[]{"a", "b"}).toList());
//        double[] values = {0.5};
//        List<List<String>> queries = new ArrayList<>();
//        queries.add(Arrays.stream(new String[]{"a", "b"}).toList());
//        queries.add(Arrays.stream(new String[]{"b", "a"}).toList());
//        queries.add(Arrays.stream(new String[]{"a", "c"}).toList());
//        queries.add(Arrays.stream(new String[]{"x", "y"}).toList());

//        equations.add(Arrays.stream(new String[]{"x1","x2"}).toList());
//        equations.add(Arrays.stream(new String[]{"x2","x3"}).toList());
//        equations.add(Arrays.stream(new String[]{"x3","x4"}).toList());
//        equations.add(Arrays.stream(new String[]{"x4","x5"}).toList());
//        double[] values = {3.0,4.0,5.0,6.0};
//        List<List<String>> queries = new ArrayList<>();
////        queries.add(Arrays.stream(new String[]{"x1", "x5"}).toList());
////        queries.add(Arrays.stream(new String[]{"x5", "x2"}).toList());
//        queries.add(Arrays.stream(new String[]{"x2", "x4"}).toList());
////        queries.add(Arrays.stream(new String[]{"x2", "x2"}).toList());
////        queries.add(Arrays.stream(new String[]{"x2", "x9"}).toList());
////        queries.add(Arrays.stream(new String[]{"x9", "x9"}).toList());



        double[] result = lc399.calcEquation(equations, values, queries);
        for(double d : result){
            System.out.print(d + " ");
        }

    }
}
