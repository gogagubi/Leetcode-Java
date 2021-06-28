package com.leetcode.example.string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1268_SearchSuggestionSystem {
    public static void main(String[] args) {
        if (true) {
            _1268_SearchSuggestionSystem c = new _1268_SearchSuggestionSystem();

            String searchWord = "mouse";
            String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
            System.out.println("Result " + c.suggestedProducts(products, searchWord));
        }

        if (true) {
            _1268_SearchSuggestionSystem c = new _1268_SearchSuggestionSystem();

            String searchWord = "havana";
            String[] products = {"havana"};
            System.out.println("Result " + c.suggestedProducts(products, searchWord));
        }

        if (true) {
            _1268_SearchSuggestionSystem c = new _1268_SearchSuggestionSystem();

            String searchWord = "bags";
            String[] products = {"bags", "baggage", "banner", "box", "cloths"};
            System.out.println("Result " + c.suggestedProducts(products, searchWord));
        }

        if (true) {
            _1268_SearchSuggestionSystem c = new _1268_SearchSuggestionSystem();

            String searchWord = "tatiana";
            String[] products = {"havana"};
            System.out.println("Result " + c.suggestedProducts(products, searchWord));
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);
        for (int i = 0; i < searchWord.length(); i++) {
            String sword = searchWord.substring(0, i + 1);
            List<String> currentList = new ArrayList<>();

            for (int j = 0; j < products.length; j++) {
                if (products[j].startsWith(sword)) {
                    currentList.add(products[j]);
                }
                if (currentList.size() >= 3) break;
            }

            result.add(currentList);
        }

        return result;
    }

}
