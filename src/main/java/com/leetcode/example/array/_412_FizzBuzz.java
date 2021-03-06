package com.leetcode.example.array;

import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _412_FizzBuzz c = new _412_FizzBuzz();
            int n = 15;
            System.out.println("Result = " + c.fizzBuzz(n));
        }

    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(new Integer(i).toString());
            }
        }

        return list;
    }

}
