package org.greenbook;

import java.util.ArrayList;
import java.util.List;

public class PermComb {

    public static List<List<Integer>> permComb(List<Integer> values) {
        List<List<Integer>> results = new ArrayList<>();
        permComb(0, values, results);
        return results;
    }
    
    private static void permComb(int pos, List<Integer> values, List<List<Integer>> results) {
        Integer value = values.get(pos);
        results.addAll(cloneWithValues(results, value));
        results.add(withValue(value));
        if (pos + 1 < values.size()) {
            permComb(pos + 1, values, results);
        }
    }

    private static List<Integer> withValue(Integer value) {
        List<Integer> newResult = new ArrayList<>();
        newResult.add(value);
        return newResult;
    }

    private static List<List<Integer>> cloneWithValues(List<List<Integer>> results, Integer value) {
        List<List<Integer>> newResults = new ArrayList<>();
        for (List<Integer> result: results) {
            newResults.add(cloneWithValue(result, value));
        }
        return newResults;
    }

    private static List<Integer> cloneWithValue(List<Integer> result, Integer value) {
        List<Integer> newResult = new ArrayList<>();
        newResult.addAll(result);
        newResult.add(value);
        return newResult;
    }

}
