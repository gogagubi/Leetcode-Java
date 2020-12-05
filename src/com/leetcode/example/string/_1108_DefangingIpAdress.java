package com.leetcode.example.string;

public class _1108_DefangingIpAdress {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1108_DefangingIpAdress c = new _1108_DefangingIpAdress();
            String address = "1.1.1.1";
            System.out.println("Defanged ip address = " + c.defangIPaddr(address));
        }

        //example 1
        if (true) {
            _1108_DefangingIpAdress c = new _1108_DefangingIpAdress();
            String address = "255.100.50.0";
            System.out.println("Defanged ip address = " + c.defangIPaddr(address));
        }
    }

    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder(address.length() + 2 * 3);
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            builder.append(c == '.' ? "[.]" : c);
        }

        return builder.toString();
    }

    public String defangIPaddrV2(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
