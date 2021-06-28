package com.leetcode.example.string;

public class _1812_DetermineColorOfChessboardSquare {
    public static void main(String[] args) {
        if (true) {
            _1812_DetermineColorOfChessboardSquare o = new _1812_DetermineColorOfChessboardSquare();
            String coordinates = "a1";

            System.out.println(o.squareIsWhite(coordinates));
        }

        if (true) {
            _1812_DetermineColorOfChessboardSquare o = new _1812_DetermineColorOfChessboardSquare();
            String coordinates = "h3";

            System.out.println(o.squareIsWhite(coordinates));
        }

        if (true) {
            _1812_DetermineColorOfChessboardSquare o = new _1812_DetermineColorOfChessboardSquare();
            String coordinates = "c7";

            System.out.println(o.squareIsWhite(coordinates));
        }
    }


    public boolean squareIsWhite(String coordinates) {
        int code = coordinates.charAt(0);
        int num = coordinates.charAt(1) - '0';

        return (code % 2 == 1 && num % 2 == 0) || (code % 2 == 0 && num % 2 == 1);
    }

}
