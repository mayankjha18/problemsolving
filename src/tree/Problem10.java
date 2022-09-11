package tree;
/*
https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1
        10                       10 ------> NULL
      / \                       /      \
     3   5       =>            3 ------> 5 --------> NULL
    / \   \                  /  \         \
   4   1   2               4 --> 1 -----> 2 -------> NULL
 */
public class Problem10 {
}

//Approach -> level order traversal and store it in an array. Then point every node to next  right node
//Optimisation -> just like problem9, we can keep a prev node and then point it to current node. This will remove extra space for array.
