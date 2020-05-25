package org.greenbook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

import static org.greenbook.PermComb.permComb;
import static org.junit.Assert.assertEquals;


public class PermCombTest {

    @Test
    public void test() {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        List<List<Integer>> permCombs = permComb(values);

        System.out.println(permCombs);

        assertEquals(permCombs.toString(), "[[1], [1, 2], [2], [1, 3], [1, 2, 3], [2, 3], [3], [1, 4], [1, 2, 4], [2, 4], [1, 3, 4], [1, 2, 3, 4], [2, 3, 4], [3, 4], [4]]");
    }

}