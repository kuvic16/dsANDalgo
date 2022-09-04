package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.Node;
import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class SerializeDeserializeTree {

    public String serialize(TreeNode root) {
        String result = traverse(root);
        return result;
    }

    private String traverse(TreeNode currentNode){
        if(currentNode == null) return "";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<String> list = new ArrayList<String>();
        queue.offer(currentNode);
        list.add(String.valueOf(currentNode.val));

        while(!queue.isEmpty()){
            TreeNode curr = queue.peek();
            if(curr.left != null){
                queue.offer(curr.left);
                list.add(String.valueOf(curr.left.val));
            }else{
                list.add("null");
            }
            if(curr.right != null){
                queue.offer(curr.right);
                list.add(String.valueOf(curr.right.val));
            }else{
                list.add("null");
            }
            queue.poll();
        }

        String result = ""; boolean start = false;
        for(int i=list.size()-1; i>=0; i--){
            if(!start && list.get(i).equalsIgnoreCase("null")){
                continue;
            }else{
                start = true;
            }
            if(result.length() == 0) {
                result = list.get(i) + result;
            }else{
                result = list.get(i) + "," + result;
            }
        }

        return result;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(!(data != null && data.length() >0)) return null;
        String [] ss = data.split(",");
        Integer[] nodes = new Integer[ss.length];
        for(int i=0; i<ss.length; i++){
            if(ss[i].equalsIgnoreCase("null")){
                nodes[i] = null;
            }else {
                nodes[i] = Integer.valueOf(ss[i]);
            }
        }
        return prepareTree(nodes);
    }

    public TreeNode prepareTree(Integer[] nodes){
        Queue<TreeNode> parentQueue = new LinkedList<TreeNode>();
        TreeNode parent = null; int i=1;
        TreeNode root = null;
        for(Integer node : nodes){
            if(parent == null){
                parent = new TreeNode(node);
                root = parent;
                parentQueue.offer(parent);
                continue;
            }
            if(i==1){
                if(node != null) {
                    TreeNode curr = new TreeNode(node);
                    parent.left = curr;
                    parentQueue.offer(curr);
                }
                i += 1;
            }else if(i == 2){
                if(node != null) {
                    TreeNode curr = new TreeNode(node);
                    parent.right = curr;
                    parentQueue.offer(curr);
                }
                i = 1;
                parentQueue.poll();
                if(!parentQueue.isEmpty()) {
                    parent = parentQueue.peek();
                }
            }
        }
        return root;
    }

}


class SerializeDeserializeTreeTest {
    public static void main(String[] args){
        Integer[] nodes = new Integer[]{1,2,3,null,null,4,5};
        TreeNode root = new TreeNode ();
        root = root.prepareTree(nodes);

        SerializeDeserializeTree btpt = new SerializeDeserializeTree();
        String result = btpt.serialize(root);
        System.out.println(result);
    }
}