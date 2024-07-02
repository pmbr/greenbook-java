package org.greenbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of values, return their combinations
 * Example:
 * Input: [1, 2, 3, 4]
 * Output: [[1], [1, 2], [2], [1, 3], [1, 2, 3], [2, 3], [3], [1, 4], [1, 2, 4], [2, 4], [1, 3, 4], [1, 2, 3, 4], [2, 3, 4], [3, 4], [4]]
 */
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
