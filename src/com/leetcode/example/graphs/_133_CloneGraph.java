package com.leetcode.example.graphs;


import java.util.*;

public class _133_CloneGraph {
    public static void main(String[] args) {
        if (true) {
            _133_CloneGraph s = new _133_CloneGraph();
            Node node1 = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);

            node1.neighbors = Arrays.asList(node2, node4);
            node2.neighbors = Arrays.asList(node1, node3);
            node3.neighbors = Arrays.asList(node2, node4);
            node4.neighbors = Arrays.asList(node1, node3);

            System.out.println("Result " + s.cloneGraph(node1).val);
        }

    }

    private Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Integer, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    private Node dfs(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.val)) return map.get(node.val);

        Node newNode = new Node(node.val);
        newNode.neighbors = new ArrayList<>();
        map.put(node.val, newNode);

        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(dfs(neighbor, map));
        }

        return newNode;
    }


    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
