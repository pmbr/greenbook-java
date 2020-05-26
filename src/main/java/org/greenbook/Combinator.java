package org.greenbook;

import java.util.ArrayList;
import java.util.List;

public class Combinator {

    public static <T> List<List<T>> combinations(List<T> values) {
        List<List<T>> combinations = new ArrayList<>();
        combinations(0, values, combinations);
        return combinations;
    }

    private static <T> void combinations(int pos, List<T> values, List<List<T>> combinations) {
        T value = values.get(pos);
        combinations.addAll(cloneWithValues(combinations, value));
        combinations.add(withValue(value));
        if (pos + 1 < values.size()) {
            combinations(pos + 1, values, combinations);
        }
    }

    private static <T> List<T> withValue(T value) {
        List<T> newCombination = new ArrayList<>();
        newCombination.add(value);
        return newCombination;
    }

    private static <T> List<List<T>> cloneWithValues(List<List<T>> combinations, T value) {
        List<List<T>> newCombinations = new ArrayList<>();
        for (List<T> combination: combinations) {
            newCombinations.add(cloneWithValue(combination, value));
        }
        return newCombinations;
    }

    private static <T> List<T> cloneWithValue(List<T> result, T value) {
        List<T> newCombination = new ArrayList<>();
        newCombination.addAll(result);
        newCombination.add(value);
        return newCombination;
    }

}
