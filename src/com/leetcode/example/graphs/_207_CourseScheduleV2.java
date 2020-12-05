package com.leetcode.example.graphs;


import java.util.*;

public class _207_CourseScheduleV2 {
    public static void main(String[] args) {
        if (false) {
            _207_CourseScheduleV2 s = new _207_CourseScheduleV2();
            int numCourses = 2;
            int[][] prerequisites = {{1, 0}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }

        if (false) {
            _207_CourseScheduleV2 s = new _207_CourseScheduleV2();
            int numCourses = 2;
            int[][] prerequisites = {{1, 0}, {0, 1}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }

        if (false) {
            _207_CourseScheduleV2 s = new _207_CourseScheduleV2();
            int numCourses = 5;
            int[][] prerequisites = {{0, 1}, {2, 1}, {4, 2}, {2, 3}, {3, 4}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }

        if (true) {
            _207_CourseScheduleV2 s = new _207_CourseScheduleV2();
            int numCourses = 5;
            int[][] prerequisites = {{1, 0}, {2, 1}, {4, 2}, {3, 2}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }
    }

    private boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> destinationToSourceMap = new HashMap<>();
        int[] sources = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int source = prerequisites[i][1];
            int destination = prerequisites[i][0];

            List<Integer> list = destinationToSourceMap.getOrDefault(destination, new ArrayList<>());
            list.add(source);
            destinationToSourceMap.put(destination, list);

            sources[source]++;
        }

        int visited = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (sources[i] == 0) {
                queue.add(i);
                visited++;
            }
        }

        while (!queue.isEmpty()) {
            int destination = queue.poll();
            if (destinationToSourceMap.containsKey(destination)) {
                for (int source : destinationToSourceMap.get(destination)) {
                    if (--sources[source] == 0) {
                        queue.add(source);
                        visited++;
                    }
                }
            }
        }

        return visited == numCourses;
    }

}
