package com.leetcode.example.other;

import java.util.HashMap;

public class _1396_DesignUndergroundSystem {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1396_DesignUndergroundSystem c = new _1396_DesignUndergroundSystem();
            c.start();
        }

    }

    public void start() {
        //Example 1
        if (true) {
            double averageTime;

            UndergroundSystem undergroundSystem = new UndergroundSystem();
            undergroundSystem.checkIn(45, "Leyton", 3);
            undergroundSystem.checkIn(32, "Paradise", 8);
            undergroundSystem.checkIn(27, "Leyton", 10);
            undergroundSystem.checkOut(45, "Waterloo", 15);
            undergroundSystem.checkOut(27, "Waterloo", 20);
            undergroundSystem.checkOut(32, "Cambridge", 22);
            averageTime = undergroundSystem.getAverageTime("Paradise", "Cambridge");       // return 14.0. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
            System.out.println(averageTime);
            averageTime = undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.0. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.0
            System.out.println(averageTime);
            undergroundSystem.checkIn(10, "Leyton", 24);
            averageTime = undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.0
            System.out.println(averageTime);
            undergroundSystem.checkOut(10, "Waterloo", 38);
            averageTime = undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 12.0
            System.out.println(averageTime);
        }
    }


    class UndergroundSystem {
        HashMap<String, HashMap<Integer, Integer>> checkInMap;
        HashMap<String, HashMap<Integer, Integer>> checkOutMap;

        public UndergroundSystem() {
            checkInMap = new HashMap<>();
            checkOutMap = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            HashMap<Integer, Integer> idMap = checkInMap.getOrDefault(stationName, new HashMap<>());
            idMap.put(id, t);

            checkInMap.put(stationName, idMap);
        }

        public void checkOut(int id, String stationName, int t) {
            HashMap<Integer, Integer> idMap = checkOutMap.getOrDefault(stationName, new HashMap<>());
            idMap.put(id, t);

            checkOutMap.put(stationName, idMap);
        }

        public double getAverageTime(String startStation, String endStation) {
            double averageTime = 0;

            HashMap<Integer, Integer> checkInTravellers = checkInMap.get(startStation);
            HashMap<Integer, Integer> checkOutTravellers = checkOutMap.get(endStation);

            int totalTime = 0;
            int travellers = 0;

            if (checkInTravellers != null && checkOutTravellers != null) {
                for (int key : checkInTravellers.keySet()) {
                    if (checkOutTravellers.get(key) != null) {
                        totalTime += (checkOutTravellers.get(key) - checkInTravellers.get(key));
                        travellers++;
                    }
                }
            }

            if (travellers > 0) {
                averageTime = totalTime / (double) travellers;
            }

            return averageTime;
        }
    }


}
