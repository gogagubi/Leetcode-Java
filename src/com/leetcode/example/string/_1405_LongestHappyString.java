package com.leetcode.example.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class _1405_LongestHappyString {
    public static void main(String[] args) {
        //example 1
        if (false) {
            _1405_LongestHappyString instance = new _1405_LongestHappyString();
            int a = 1, b = 1, c = 7;
            System.out.println("Longest happy string = " + instance.longestDiverseString(a, b, c));
        }

        //example 1
        if (false) {
            _1405_LongestHappyString instance = new _1405_LongestHappyString();
            int a = 2, b = 2, c = 1;
            System.out.println("Longest happy string = " + instance.longestDiverseString(a, b, c));
        }

        //example 1
        if (true) {
            _1405_LongestHappyString instance = new _1405_LongestHappyString();
            int a = 7, b = 1, c = 0;
            System.out.println("Longest happy string = " + instance.longestDiverseString(a, b, c));
        }

        if (false) {
            _1405_LongestHappyString instance = new _1405_LongestHappyString();
            int a = 4, b = 4, c = 3;
            System.out.println("Longest happy string = " + instance.longestDiverseString(a, b, c));
        }
    }


    public String longestDiverseString(int a, int b, int c) {
        StringBuilder result = new StringBuilder();

        while ((a + b + c) != 0) {
            int length = result.length();

            if (a == max(a, b, c) || (length == 0 || length - 1 >= 0 && result.charAt(length - 1) != 'a')) {
                result.append('a');
                a--;
            } else if (b == max(a, b, c) || (length == 0 || length - 1 >= 0 && result.charAt(length - 1) != 'b')) {
                result.append('b');
                b--;
            } else if (c == max(a, b, c) || (length == 0 || length - 1 >= 0 && result.charAt(length - 1) != 'c')) {
                result.append('c');
                c--;
            }
        }

        return result.toString();
    }

    public int max(int a, int b, int c) {
        a = Math.max(a, b);
        a = Math.max(a, c);

        return a;
    }


    public String longestDiverseString1(int a, int b, int c) {
        StringBuilder result = new StringBuilder();

        PriorityQueue<Integer> queue = new PriorityQueue<>(3, Collections.reverseOrder());
        queue.add(a);
        queue.add(b);
        queue.add(c);

        List<Integer> amounts = new ArrayList<>(3);
        List<Character> characters = new ArrayList<>(3);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (a == current && !characters.contains('a')) {
                characters.add('a');
            } else if (b == current && !characters.contains('b')) {
                characters.add('b');
            } else if (c == current && !characters.contains('c')) {
                characters.add('c');
            }

            amounts.add(current);
        }

        int counter = 0;
        int prevPointer = -1;
        int pointer = 0;
        int nextPointer = 1;

        while (pointer < amounts.size()) {
            result.append(characters.get(pointer));
            amounts.set(pointer, amounts.get(pointer) - 1);
            counter++;

            if (counter == 2 || amounts.get(pointer) == 0) {
                if (prevPointer != -1) {
                    if (amounts.get(pointer) == 0) {
                        while (true) {
                            nextPointer++;
                            if (nextPointer == amounts.size() || amounts.get(nextPointer) != 0) {
                                break;
                            }
                        }
                    }

                    pointer = prevPointer;
                    prevPointer = -1;
                    counter = 0;
                } else if (counter == 2) {
                    if (amounts.get(pointer) != 0) {
                        prevPointer = pointer;
                    }

                    pointer = nextPointer;

                    if (prevPointer == -1) {
                        while (true) {
                            nextPointer++;
                            if (nextPointer == amounts.size() || amounts.get(nextPointer) != 0) {
                                break;
                            }
                        }
                    }

                    counter = 0;
                } else {
                    pointer = nextPointer;
                }
            }
        }

        return result.toString();
    }

}
