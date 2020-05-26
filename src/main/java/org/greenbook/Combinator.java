package org.greenbook;

import java.util.ArrayList;
import java.util.List;

public class Combinator {

    public static List<List<Integer>> combinations(List<Integer> values) {
        List<List<Integer>> combinations = new ArrayList<>();
        combinations(0, values, combinations);
        return combinations;
    }

    private static void combinations(int pos, List<Integer> values, List<List<Integer>> combinations) {
        Integer value = values.get(pos);
        combinations.addAll(cloneWithValues(combinations, value));
        combinations.add(withValue(value));
        if (pos + 1 < values.size()) {
            combinations(pos + 1, values, combinations);
        }
    }

    private static List<Integer> withValue(Integer value) {
        List<Integer> newCombination = new ArrayList<>();
        newCombination.add(value);
        return newCombination;
    }

    private static List<List<Integer>> cloneWithValues(List<List<Integer>> combinations, Integer value) {
        List<List<Integer>> newCombinations = new ArrayList<>();
        for (List<Integer> combination: combinations) {
            newCombinations.add(cloneWithValue(combination, value));
        }
        return newCombinations;
    }

    private static List<Integer> cloneWithValue(List<Integer> result, Integer value) {
        List<Integer> newCombination = new ArrayList<>();
        newCombination.addAll(result);
        newCombination.add(value);
        return newCombination;
    }

}
