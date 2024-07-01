package org.greenbook;

import org.greenbook.tree.BinaryTreeNode;
import org.junit.Test;

import static org.greenbook.BinaryTreeBoundary.boundaries;
import static org.junit.Assert.assertEquals;

public class BinaryTreeBoundaryTest {

    @Test
    public void testBoundaries() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode(20);
        root.setLeft(new BinaryTreeNode<>(8));
        root.getLeft().setLeft(new BinaryTreeNode<>(4));
        root.getLeft().setRight(new BinaryTreeNode<>(12));
        root.getLeft().getRight().setLeft(new BinaryTreeNode<>(10));
        root.getLeft().getRight().setRight(new BinaryTreeNode<>(14));
        root.setRight(new BinaryTreeNode<>(22));
        root.getRight().setRight(new BinaryTreeNode<>(25));

        String boundaries = boundaries(root);

        assertEquals("20 8 4 10 14 25 22", boundaries);
    }

}