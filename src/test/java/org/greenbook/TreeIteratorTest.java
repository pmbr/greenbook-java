package org.greenbook;

import org.greenbook.tree.Tree;
import org.greenbook.tree.TreeNode;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TreeIteratorTest {

    @Test
    public void testTreeIteratorWhereTreeHasOnlyRoot() {
        TreeNode<Integer> root = new TreeNode<>(1);
        Tree<TreeNode<Integer>> tree = new Tree<>(root);

        Iterator iterator = tree.iterator();

        assertTrue(iterator.hasNext());
        assertEquals(root, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testTreeIteratorWhereTreeRootHasOnlyOneLevelOfChildren() {
        TreeNode<Integer> root = new TreeNode<>(1);

        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(4);

        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);

        Tree<TreeNode<Integer>> tree = new Tree<>(root);
        Iterator iterator = tree.iterator();

        assertEquals(root, iterator.next());
        assertEquals(node2, iterator.next());
        assertEquals(node3, iterator.next());
        assertEquals(node4, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testTreeIterator() {
        TreeNode<Integer> root = new TreeNode<>(1);

        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(4);
        TreeNode<Integer> node5 = new TreeNode<>(5);
        TreeNode<Integer> node6 = new TreeNode<>(6);
        TreeNode<Integer> node7 = new TreeNode<>(7);
        TreeNode<Integer> node8 = new TreeNode<>(8);
        TreeNode<Integer> node9 = new TreeNode<>(9);
        TreeNode<Integer> node10 = new TreeNode<>(10);
        TreeNode<Integer> node11 = new TreeNode<>(11);
        TreeNode<Integer> node12 = new TreeNode<>(12);
        TreeNode<Integer> node13 = new TreeNode<>(13);
        TreeNode<Integer> node14 = new TreeNode<>(14);
        TreeNode<Integer> node15 = new TreeNode<>(15);
        TreeNode<Integer> node16 = new TreeNode<>(16);
        TreeNode<Integer> node17 = new TreeNode<>(17);
        TreeNode<Integer> node18 = new TreeNode<>(18);
        TreeNode<Integer> node19 = new TreeNode<>(19);
        TreeNode<Integer> node20 = new TreeNode<>(20);

        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);

        node2.addChild(node5);
        node2.addChild(node6);
        node2.addChild(node7);

        node5.addChild(node9);
        node5.addChild(node11);

        node11.addChild(node12);
        node11.addChild(node13);
        node11.addChild(node14);
        node11.addChild(node15);

        node7.addChild(node8);

        node3.addChild(node16);

        node16.addChild(node18);

        node18.addChild(node20);

        node4.addChild(node10);

        node10.addChild(node17);
        node10.addChild(node19);

        Tree<TreeNode<Integer>> tree = new Tree<>(root);
        Iterator<TreeNode<Integer>> iterator = tree.iterator();

        assertEquals(root, iterator.next());
        assertEquals(node2, iterator.next());
        assertEquals(node5, iterator.next());
        assertEquals(node9, iterator.next());
        assertEquals(node11, iterator.next());
        assertEquals(node12, iterator.next());
        assertEquals(node13, iterator.next());
        assertEquals(node14, iterator.next());
        assertEquals(node15, iterator.next());
        assertEquals(node6, iterator.next());
        assertEquals(node7, iterator.next());
        assertEquals(node8, iterator.next());
        assertEquals(node3, iterator.next());
        assertEquals(node16, iterator.next());
        assertEquals(node18, iterator.next());
        assertEquals(node20, iterator.next());
        assertEquals(node4, iterator.next());
        assertEquals(node10, iterator.next());
        assertEquals(node17, iterator.next());
        assertEquals(node19, iterator.next());
        assertFalse(iterator.hasNext());
    }

}
