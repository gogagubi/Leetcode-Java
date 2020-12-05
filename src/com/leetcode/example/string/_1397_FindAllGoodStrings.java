package com.leetcode.example.string;


public class _1397_FindAllGoodStrings {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1397_FindAllGoodStrings c = new _1397_FindAllGoodStrings();
            int n = 2;
            String s1 = "aa";
            String s2 = "da";
            String evil = "b";
            System.out.println("Number of good strings " + c.findGoodStrings(n, s1, s2, evil));
        }

        //example 2
        if (true) {
            _1397_FindAllGoodStrings c = new _1397_FindAllGoodStrings();
            int n = 8;
            String s1 = "leetcode";
            String s2 = "leetgoes";
            String evil = "leet";
            System.out.println("Number of good strings " + c.findGoodStrings(n, s1, s2, evil));
        }

        //example 3
        if (true) {
            _1397_FindAllGoodStrings c = new _1397_FindAllGoodStrings();
            int n = 2;
            String s1 = "gx";
            String s2 = "gz";
            String evil = "x";
            System.out.println("Number of good strings " + c.findGoodStrings(n, s1, s2, evil));
        }


        //example 4
        if (true) {
            _1397_FindAllGoodStrings c = new _1397_FindAllGoodStrings();
            int n = 3;
            String s1 = "szc";
            String s2 = "zyi";
            String evil = "p";
            System.out.println("Number of good strings " + c.findGoodStrings(n, s1, s2, evil));
        }

        //example 4
        if (false) {
            _1397_FindAllGoodStrings c = new _1397_FindAllGoodStrings();
            int n = 8;
            String s1 = "pzdanyao";
            String s2 = "wgpmtywi";
            String evil = "sdka";
            System.out.println("Number of good strings " + c.findGoodStrings(n, s1, s2, evil));
        }

    }


    public int findGoodStrings(int n, String s1, String s2, String evil) {
        StringBuilder st1 = new StringBuilder(s1);
        StringBuilder st2 = new StringBuilder(s2);

        int result = 0, pointer = s1.length() - 1;
        char start = 'a', end = 'z';

        while (st1.toString().compareTo(st2.toString()) <= 0) {

            String candidate = st1.toString();
            if(!candidate.contains(evil)){
                result ++;
            }
            //System.out.println(candidate);


            if(st1.charAt(pointer) != end) {
                st1.setCharAt(pointer, (char) (st1.charAt(pointer) + 1));
            }

            if(st1.charAt(pointer) == end) {
                candidate = st1.toString();
                if(!candidate.contains(evil)){
                    result ++;
                }
                //System.out.println(candidate);

                for (int i = pointer - 1; i >= 0; i--) {
                    if (st1.charAt(i) != end) {
                        st1.setCharAt(i, (char) (st1.charAt(i) + 1));


                        for (int j = i + 1; j <= pointer; j++) {
                            st1.setCharAt(j, start);
                        }

                        break;
                    }
                }
            }

        }

        return result % 1000000007;
    }


    public int findGoodStrings11(int n, String s1, String s2, String evil) {
        int result;
        char start = 'a', end = 'z';

        char[] set = new char[end - start + 1];
        for (char i = start; i <= end; i++) {
            set[i - start] = i;
        }

        result = findGoodStringsRec(set, "", n, s1, s2, evil);
        return result % 1000000007;
    }

    public int findGoodStringsRec(char[] set, String candidate, int n, String s1, String s2, String evil) {
        int result = 0;

        if (n == 0) {
            System.out.println(candidate);
            if (candidate.compareTo(s1) >= 0 && candidate.compareTo(s2) <= 0 && !candidate.contains(evil)) {
                result++;

            }
            return result;
        }


        for (int i = 0; i < set.length; ++i) {
            String newStr = candidate + set[i];
            result += findGoodStringsRec(set, newStr, n - 1, s1, s2, evil);
        }

        return result;
    }


    public int findGoodStrings1(int n, String s1, String s2, String evil) {
        int result = 0;
        char start = 'a', end = 'z';

        char[] chars = new char[end - start + 1];
        for (char i = start; i <= end; i++) {
            chars[i - start] = i;
        }

        /*char[] rchars = new char[end - start + 1];
        for (char i = end; i >= start; i--) {
            rchars[end - i] = i;
        }*/

        int[] cursors = new int[n];
        for (int i = 0; i < n; i++) {
            cursors[i] = 0;
        }

        while ((cursors[0] + cursors.length) <= chars.length) {

            StringBuilder builder = new StringBuilder();
            for (int i : cursors) {
                builder.append(chars[i]);
            }
            String candidate = builder.toString();

            if (candidate.compareTo(s1) >= 0 && candidate.compareTo(s2) <= 0 && !candidate.contains(evil)) {
                result++;
            }

            if (chars[cursors[cursors.length - 1]] == end) {
                if (cursors.length <= 2 || cursors[cursors.length - 1] - cursors[cursors.length - 2] == 1) {
                    cursors[0]++;
                    for (int i = 1; i < n; i++) {
                        cursors[i] = cursors[i - 1];
                    }
                } else {
                    for (int i = 1; i < n - 1; i++) {
                        cursors[i] = cursors[i] + 1;
                    }
                }
            } else {
                cursors[cursors.length - 1]++;
            }
        }

        return result;
    }



    /*public int findGoodStrings(int n, String s1, String s2, String evil) {
        int result = 0;
        char start = 'a', end = 'f';

        char[] chars = new char[end - start + 1];
        for (char i = start; i <= end; i++) {
            chars[i - start] = i;
        }

        int counter;

        for (int i = 0; i < chars.length; i++) {
            StringBuilder builder = new StringBuilder(n);
            builder.append(chars[i]);
            counter = 1;

            for (int j = 0; j < chars.length; j++) {
                builder.append(chars[j]);
                counter++;

                if (counter == n) {
                    String candidate = builder.toString();
                    if (candidate.compareTo(s1) >= 0 && candidate.compareTo(s2) <= 0 && !candidate.contains(evil)) {
                        result++;
                    }

                    System.out.println(candidate);


                    builder = new StringBuilder();
                    builder.append(chars[i]);
                    counter = 1;
                    j =
                }
            }
        }

        return result;
    }*/

    public int toNumber(String st) {
        int number = 0;
        for (int i = 0; i < st.length(); i++) {
            number += (st.charAt(i) - '0');
        }

        return number;
    }

}
