package org.greenbook;

import org.greenbook.tree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeBoundary {

    public static final int ROOT = 0;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;

    public static <T> String boundaries(BinaryTreeNode<T> root) {
        List<T> boundaries = new ArrayList<>();
        findNextBoundaries(root, 0, 0, boundaries);
        String output = "";
        for (T element: boundaries) {
            output += element.toString() + " ";
        }

        return output.trim();
    }

    private static <T> void findNextBoundaries(BinaryTreeNode<T> node, int currentDirection, int originalDirection, List<T> boundaries) {
        if ( (node.getLeft() == null && node.getRight() == null)) {
            boundaries.add(node.getValue());
            return;
        }
        if (currentDirection == ROOT || (currentDirection == LEFT && currentDirection == originalDirection)) {
            boundaries.add(node.getValue());
        }
        if (node.getLeft() != null) {
            findNextBoundaries(node.getLeft(), LEFT, originalDirection == ROOT ? LEFT : originalDirection, boundaries);
        }
        if (node.getRight() != null) {
            findNextBoundaries(node.getRight(), RIGHT, originalDirection == ROOT ? RIGHT : originalDirection, boundaries);
        }
        if (currentDirection == RIGHT && currentDirection == originalDirection) {
            boundaries.add(node.getValue());
        }
    }

}

