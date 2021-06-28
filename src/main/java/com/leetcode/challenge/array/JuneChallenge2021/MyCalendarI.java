package com.leetcode.challenge.array.JuneChallenge2021;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarI {
    public static void main(String[] args) {
        MyCalendarI c = new MyCalendarI();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            MyCalendar c = new MyCalendar();
            boolean res1 = c.book(10, 20);
            boolean res2 = c.book(15, 25);
            boolean res3 = c.book(20, 30);

            System.out.println(res1 + " " + res2 + " " + res3);
        }
    }

    class MyCalendar {
        List<int[]> list;

        public MyCalendar() {
            list = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            end -= 1;
            for (int[] i : list) {
                int x = i[0];
                int y = i[1];

                if (x >= start && x <= end || y >= start && y <= end || start >= x && start <= y) return false;
            }

            list.add(new int[]{start, end});
            return true;
        }
    }


}
