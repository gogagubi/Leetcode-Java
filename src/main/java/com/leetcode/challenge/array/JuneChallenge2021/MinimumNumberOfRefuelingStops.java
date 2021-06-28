package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

//2021-06-12
public class MinimumNumberOfRefuelingStops {

    @Test
    public void testCase1() {
        MinimumNumberOfRefuelingStops c = new MinimumNumberOfRefuelingStops();
        int target = 1;
        int startFuel = 1;
        int[][] stations = {};

        assertEquals(0, c.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void testCase2() {
        MinimumNumberOfRefuelingStops c = new MinimumNumberOfRefuelingStops();
        int target = 100;
        int startFuel = 1;
        int[][] stations = {{10, 100}};

        assertEquals(-1, c.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void testCase3() {
        MinimumNumberOfRefuelingStops c = new MinimumNumberOfRefuelingStops();
        int target = 100;
        int startFuel = 10;
        int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};

        assertEquals(2, c.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void testCase4() {
        MinimumNumberOfRefuelingStops c = new MinimumNumberOfRefuelingStops();
        int target = 100;
        int startFuel = 50;
        int[][] stations = {{60, 50}};

        assertEquals(-1, c.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void testCase5() {
        MinimumNumberOfRefuelingStops c = new MinimumNumberOfRefuelingStops();
        int target = 1000;
        int startFuel = 299;
        int[][] stations = {{14, 123}, {145, 203}, {344, 26}, {357, 68}, {390, 35}, {478, 135}, {685, 108}, {823, 186}, {934, 217}, {959, 80}};

        assertEquals(5, c.minRefuelStops(target, startFuel, stations));
    }

    @Test
    public void testCase6() {
        MinimumNumberOfRefuelingStops c = new MinimumNumberOfRefuelingStops();
        int target = 100;
        int startFuel = 50;
        int[][] stations = {{25, 50}, {50, 25}};

        assertEquals(1, c.minRefuelStops(target, startFuel, stations));
    }


    class Pair {
        int position;
        int fuel;

        Pair(int position, int fuel) {
            this.position = position;
            this.fuel = fuel;
        }
    }

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int ans = 0;
        if (startFuel >= target) return ans; //if we are given enough fuel to reach the target

        Pair[] routes = new Pair[stations.length + 2];
        routes[0] = new Pair(0, 0);
        for (int i = 0; i < stations.length; i++) routes[i + 1] = new Pair(stations[i][0], stations[i][1]);
        routes[routes.length - 1] = new Pair(target, 0);

        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int fuelRemaining = startFuel;

        for (int i = 0; i < routes.length; i++) {
            if (routes[i].position == target) return ans;
            maxHeap.add(routes[i].fuel);

            int milesToNextStation = routes[i + 1].position - routes[i].position;
            if (fuelRemaining >= milesToNextStation) {
                fuelRemaining -= milesToNextStation;
            } else {
                while (!maxHeap.isEmpty() && fuelRemaining < milesToNextStation) {
                    fuelRemaining += maxHeap.poll();
                    ans++;
                }

                if (fuelRemaining < milesToNextStation) return -1;
                fuelRemaining -= milesToNextStation;
            }
        }

        return -1;
    }

}
