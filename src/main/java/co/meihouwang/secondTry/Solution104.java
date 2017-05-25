package co.meihouwang.secondTry;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by wangbin7cmcm.com on 17/5/3.
 */
public class Solution104 {

    public static void main(String[] args){
        TreeNode root = null;
        root = new TreeNode(0);
        root.left = null;
        root.right = new TreeNode(1);

        Solution104 solution104 = new Solution104();

        int depth = solution104.maxDepth(root);

        System.out.println(depth);
    }

    public int maxDepth(TreeNode root) {

        ArrayList<Integer> allDepths = new ArrayList<Integer>();

        if ( null == root ){
            return 0;
        }

        getDeepestDepth(root,1,allDepths);
        Collections.sort(allDepths);

        return allDepths.get(allDepths.size()-1);
    }

    private static void getDeepestDepth(TreeNode cur, int depth, ArrayList<Integer> allDepths) {
        if( null == cur.left && null == cur.right) {
            allDepths.add(depth);
            return;
        }
        else{
            if( cur.left != null ){
                getDeepestDepth(cur.left,depth+1,allDepths);
            }
            if( cur.right != null ){
                getDeepestDepth(cur.right,depth+1,allDepths);
            }

        }

    }
}
