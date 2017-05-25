package co.meihouwang.firstTry;
import java.util.*;

/**
 * Created by wangbin7cmcm.com on 17/5/3.
 */

/*

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Subscribe to see which companies asked this question.

*/

public class Solution104 {
    public static void main(String[] args){
        //Mimic the tree
    //    TreeNode root = new TreeNode(0);
    //    root.left = new TreeNode(1);
    //    root.right = new TreeNode(2);
    //    root.right.right = new TreeNode(3);
    //    root.right.right.right = new TreeNode(4);

        TreeNode root = new TreeNode(0);
        Solution104 solution104 = new Solution104();

        int deepestDepth = solution104.maxDepth(root);

        System.out.println(deepestDepth);

    }

    public int maxDepth(TreeNode root){

        //Map<TreeNode,Integer> allDepths = new HashMap<TreeNode, Integer>();

        List<Integer> allDepths = new ArrayList<Integer>();


        getMaxDepth(root,1,allDepths);

        Collections.sort(allDepths);

        return allDepths.get(allDepths.size() - 1);
    }

    private void getMaxDepth(TreeNode cur,int depth, List<Integer> allDepths) {
        if( null == cur){
            allDepths.add(0);
            return;
        }
        if( null == cur.left && null == cur.right ){
            allDepths.add(depth);
            return;
        }else
        {
            if(cur.left != null ){
                getMaxDepth(cur.left,depth + 1,allDepths);
            }
            if(cur.right != null ) {
                getMaxDepth(cur.right,depth+1,allDepths);
            }
            return;
        }
    }

}
