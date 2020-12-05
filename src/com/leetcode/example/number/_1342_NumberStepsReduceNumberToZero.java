package com.leetcode.example.number;

public class _1342_NumberStepsReduceNumberToZero {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1342_NumberStepsReduceNumberToZero c = new _1342_NumberStepsReduceNumberToZero();
            int num = 14;
            System.out.println("Num of steps = " + c.numberOfSteps(num));
        }

        //example 1
        if (true) {
            _1342_NumberStepsReduceNumberToZero c = new _1342_NumberStepsReduceNumberToZero();
            int num = 8;
            System.out.println("Num of steps = " + c.numberOfSteps(num));
        }
    }

    public int numberOfSteps(int num) {
        int actions = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }

            actions++;
        }

        return actions;
    }


}
