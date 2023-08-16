package leetcode.divide_and_conquer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class LC108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        
        return null;
    }


}

class LC108Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC108 lc108 = new LC108();
        int[] nums = {-10,-3,0,5,9};
        lc108.sortedArrayToBST(nums);
    }
}
