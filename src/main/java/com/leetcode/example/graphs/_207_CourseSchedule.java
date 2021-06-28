package com.leetcode.example.graphs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _207_CourseSchedule {
    public static void main(String[] args) {
        if (true) {
            _207_CourseSchedule s = new _207_CourseSchedule();
            int numCourses = 2;
            int[][] prerequisites = {{1, 0}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }

        if (true) {
            _207_CourseSchedule s = new _207_CourseSchedule();
            int numCourses = 2;
            int[][] prerequisites = {{1, 0}, {0, 1}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }

        if (true) {
            _207_CourseSchedule s = new _207_CourseSchedule();
            int numCourses = 5;
            int[][] prerequisites = {{0, 1}, {2, 1}, {4, 2}, {2, 3}, {3, 4}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }

        if (true) {
            _207_CourseSchedule s = new _207_CourseSchedule();
            int numCourses = 5;
            int[][] prerequisites = {{1, 0}, {2, 1}, {4, 2}, {3, 2}};

            System.out.println("Result " + s.canFinish(numCourses, prerequisites));
        }
    }

    private boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> directionsMap = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            int beforeDegreeRequired = prerequisites[i][1];
            int goalDegree = prerequisites[i][0];

            List<Integer> list = directionsMap.getOrDefault(beforeDegreeRequired, new ArrayList<>());
            list.add(goalDegree);
            directionsMap.put(beforeDegreeRequired, list);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] history = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visited, history, directionsMap, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(boolean[] visited, boolean[] history, Map<Integer, List<Integer>> map, int course) {
        if (visited[course]) return history[course];
        visited[course] = true;

        if (map.containsKey(course)) {
            for (int eachCourse : map.get(course)) {
                if (!dfs(visited, history, map, eachCourse)) {
                    history[eachCourse] = false;
                    return false;
                }
            }
        }

        history[course] = true;
        return true;
    }

}
