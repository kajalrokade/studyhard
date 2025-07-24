package com.kajal.code.DSA.Tree;


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

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        if(root ==null)
            return null;
        if(root.val == val){
            return root;
        }else if(root.val > val){
            searchBST(root.left, val);
        }else{
            searchBST(root.right,val);
        }
        return null;
    }

    public static void main(String[] args) {
       TreeNode root = new TreeNode(4);
       root.left = new TreeNode(2);
       root.right = new TreeNode(1);
    }
}