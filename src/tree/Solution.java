package tree;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> distanceK(TreeNode target, int k) {

        List<Integer> lst  = new ArrayList<>();
        getListAt(lst,  k, target);
        return  lst;

    }


    static void getListAt(List<Integer> lst, int distance, TreeNode node)
    {
        if(node == null )
        {
            return;
        }

        if(distance  ==  0)
        {
            lst.add(node.val);
            return;

        }

        getListAt(lst, distance-1,  node.left);
        getListAt(lst, distance-1,  node.right);
        getListAt(lst, distance-1,  node.parent);

    }
}
