package com.leetcode.example.dfs;


import com.leetcode.statics.util.Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class _721_AccountsMerge {
    public static void main(String[] args) {
        _721_AccountsMerge s = new _721_AccountsMerge();

        //Test Sample 1
        if (true) {
            s.runTestCase("in/union_find/_721_AccountsMerge_Sample1");
        }
    }

    private void runTestCase(String fileName) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            List<List<String>> accounts = new ArrayList<>();

            String line = in.readLine();
            line = line.substring(2, line.length() - 2);
            String[] arr = line.split("], \\[");
            for (String s : arr) {
                String el[] = s.split(",");

                List<String> inList = new ArrayList<>();
                for (String e : el) inList.add(e.replace("\"", ""));
                accounts.add(inList);
            }

            List<List<String>> res = accountsMerge(accounts);
            System.out.println(res);

            in.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> ans = new ArrayList<>();

        List<List<String>> emails = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> list = new ArrayList<>();
            for (int j = 1; j < accounts.get(i).size(); j++) {
                list.add(accounts.get(i).get(j));
            }
            emails.add(list);
        }

        Map<String, String> emailToName = new HashMap<>();
        Map<String, Set<String>> graph = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> curr = accounts.get(i);
            String name = curr.get(0);

            for (int j = 1; j < curr.size(); j++) {
                String email = curr.get(j);
                Set<String> set = graph.getOrDefault(email, new HashSet<>());
                set.addAll(emails.get(i));
                graph.put(email, set);
                emailToName.put(email, name);
            }
        }

        Set<String> visited = new HashSet<>();
        for (String key : emailToName.keySet()) {
            List<String> result = new ArrayList<>();
            dfs(key, graph, visited, result);
            if (result.size() > 0) {
                Collections.sort(result);
                result.add(0, emailToName.get(key));
                ans.add(result);
            }
        }

        return ans;
    }

    private void dfs(String email, Map<String, Set<String>> graph, Set<String> visited, List<String> result) {
        if (visited.contains(email)) return;
        visited.add(email);
        result.add(email);

        if (!graph.containsKey(email)) return;
        for (String e : graph.get(email)) {
            dfs(e, graph, visited, result);
        }
    }
}
