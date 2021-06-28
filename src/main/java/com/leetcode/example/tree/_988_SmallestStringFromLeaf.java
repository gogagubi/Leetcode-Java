package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;

public class _988_SmallestStringFromLeaf {
    public static void main(String[] args) {
        _988_SmallestStringFromLeaf c = new _988_SmallestStringFromLeaf();
        c.start();

        System.out.println(Double.MAX_VALUE);
        System.out.println(new Double("32").isInfinite());
        System.out.println(new Double("107893880049").longValue());
    }

    public void start() {
        //example 1
        if (true) {
            _988_SmallestStringFromLeaf c = new _988_SmallestStringFromLeaf();

            TreeNode root = new TreeNode(0);
            root.left = new TreeNode(1, new TreeNode(3), new TreeNode(4));
            root.right = new TreeNode(2, new TreeNode(3), new TreeNode(4));
            System.out.println("Smallest String = " + c.smallestFromLeaf(root));
        }

        if (true) {
            _988_SmallestStringFromLeaf c = new _988_SmallestStringFromLeaf();

            TreeNode root = new TreeNode(25);
            root.left = new TreeNode(1, new TreeNode(1), new TreeNode(3));
            root.right = new TreeNode(3, new TreeNode(0), new TreeNode(2));
            System.out.println("Smallest String = " + c.smallestFromLeaf(root));
        }

        if (true) {
            _988_SmallestStringFromLeaf c = new _988_SmallestStringFromLeaf();

            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(2, null, new TreeNode(1));
            root.right = new TreeNode(1, new TreeNode(0), null);

            root.left.right.left = new TreeNode(0);
            System.out.println("Smallest String = " + c.smallestFromLeaf(root));
        }
    }


    String min = "";

    public String smallestFromLeaf(TreeNode root) {
        if (root == null) {
            return "";
        }

        smallestFromLeafRecursive(root, new LinkedList<>());
        return min;
    }

    public void smallestFromLeafRecursive(TreeNode root, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (root.left == null && root.right == null) {
            Iterator<Integer> it = list.descendingIterator();
            StringBuilder builder = new StringBuilder();
            while (it.hasNext()) {
                builder.append((char) (it.next() + 'a'));
            }
            String candidate = builder.toString();

            if (min.isEmpty() || candidate.compareTo(min) < 0) {
                min = candidate;
            }
        }

        smallestFromLeafRecursive(root.left, list);
        if (root.left != null) {
            list.removeLast();
        }

        smallestFromLeafRecursive(root.right, list);
        if (root.right != null) {
            list.removeLast();
        }
    }

    /*public String smallestFromLeaf(TreeNode root) {
        if (root == null) {
            return "";
        }

        Stack<Integer> indexes = new Stack<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            int min = Integer.MAX_VALUE;
            TreeNode minNode = null;
            int storeSize = size;

            while (size-- > 0) {
                TreeNode current = queue.poll();

                if (current.val < min) {
                    min = current.val;
                    minNode = current;
                }

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            if (minNode.left == null && minNode.right == null && storeSize == 1 && minNode.val >= indexes.peek()) {
                break;
            }

            indexes.add(min);
            //System.out.println(min);
        }

        StringBuilder builder = new StringBuilder();
        while(!indexes.isEmpty()){
            builder.append((char) (indexes.pop() + 'a'));
        }

        return builder.toString();
    }*/

}
