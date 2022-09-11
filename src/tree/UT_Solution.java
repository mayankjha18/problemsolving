package tree;

import java.util.ArrayList;
import java.util.List;

class UT_Solution{
        public static void main(String[]args){
            getListwhendistanceisvalid();
        }

    public static void getListwhendistanceisvalid()
        {
        int distance=3;

        //populate tree
        TreeNode node=new TreeNode(5);

        node.left=new TreeNode(4);
        node.left.parent = node;

        node.right=new TreeNode(6);
        node.right.parent  =  node;

        node.left.left=new TreeNode(7);
        node.left.left.parent = node.left;

        node.left.right=new TreeNode(9);
        node.left.right.parent = node.left;


        List<Integer> lst=new ArrayList<>();

        TreeNode test=node.left.right;

        List<Integer> actual=Solution.distanceK(test, 3);

        System.out.println(actual.toString());

//        System.out.println(actual.get(0)==6);
        }
}
