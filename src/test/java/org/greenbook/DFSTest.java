package org.greenbook;

import org.greenbook.model.TreeNode;
import org.junit.Test;

import static org.greenbook.DFS.traverse;
import static org.junit.Assert.assertEquals;

public class DFSTest {

    @Test
    public void testTraverse1() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);

        one.addChild(four);
        one.addChild(two);

        four.addChild(three);

        two.addChild(three);
        two.addChild(eight);
        two.addChild(five);
        two.addChild(seven);

        three.addChild(ten);
        three.addChild(nine);

        five.addChild(seven);
        five.addChild(eight);
        five.addChild(six);

        eight.addChild(seven);
        eight.addChild(five);

        assertEquals("1 4 3 10 9 2 8 7 5 6", traverse(one));
    }

    @Test
    public void testTraverse2() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);
        TreeNode eleven = new TreeNode(11);
        TreeNode twelve = new TreeNode(12);
        TreeNode thirteen = new TreeNode(13);

        one.addChild(two);
        one.addChild(three);

        two.addChild(four);
        two.addChild(five);

        three.addChild(six);
        three.addChild(seven);

        four.addChild(eight);

        six.addChild(nine);

        seven.addChild(ten);

        five.addChild(eleven);
        five.addChild(twelve);

        eleven.addChild(thirteen);

        assertEquals("1 2 4 8 5 11 13 12 3 6 9 7 10", traverse(one));
    }
}