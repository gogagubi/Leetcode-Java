package com.leetcode.example.array;

public class _904_FruitIntoBasket {
    public static void main(String[] args) {
        //example 1
        if (false) {
            _904_FruitIntoBasket c = new _904_FruitIntoBasket();
            int[] arr = {1, 2, 1};
            System.out.println("Frouts amount = " + c.totalFruit(arr));
        }

        //example 2
        if (false) {
            _904_FruitIntoBasket c = new _904_FruitIntoBasket();
            int[] arr = {0, 1, 2, 2};
            System.out.println("Frouts amount = " + c.totalFruit(arr));
        }

        //example 3
        if (false) {
            _904_FruitIntoBasket c = new _904_FruitIntoBasket();
            int[] arr = {1, 2, 3, 2, 2};
            System.out.println("Frouts amount = " + c.totalFruit(arr));
        }

        //example 4
        if (true) {
            _904_FruitIntoBasket c = new _904_FruitIntoBasket();
            int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
            System.out.println("Frouts amount = " + c.totalFruit(arr));
        }

        //example 5
        if (false) {
            _904_FruitIntoBasket c = new _904_FruitIntoBasket();
            int[] arr = {0, 0, 1, 1};
            System.out.println("Frouts amount = " + c.totalFruit(arr));
        }
    }

    public int totalFruit(int[] tree) {
        int previousFruit = -1;
        int beforePreviousFruit = -1;
        int previousFruitCount = 0;
        int currentMax = 0;
        int max = 0;

        for (Integer fruit : tree) {
            if (fruit == previousFruit || fruit == beforePreviousFruit) {
                currentMax += 1;
            } else {
                currentMax = previousFruitCount + 1;
            }

            if (fruit == previousFruit) {
                previousFruitCount += 1;
            } else {
                previousFruitCount = 1;
            }

            max = Math.max(currentMax, max);

            if (fruit != previousFruit) {
                beforePreviousFruit = previousFruit;
                previousFruit = fruit;
            }
        }


        return max;
    }

}
