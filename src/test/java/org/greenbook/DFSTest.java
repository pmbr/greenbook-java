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
        two.addChild(five);
        two.addChild(seven);
        two.addChild(eight);

        three.addChild(ten);
        three.addChild(nine);

        five.addChild(six);
        five.addChild(seven);
        five.addChild(eight);

        eight.addChild(seven);

        assertEquals("1 4 3 10 9 2 5 6 7 8", traverse(one));
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
        TreeNode fourteen = new TreeNode(14);

        one.addChild(two);
        one.addChild(three);

        two.addChild(four);
        two.addChild(five);

        three.addChild(six);
        three.addChild(seven);

        four.addChild(eight);

        five.addChild(eleven);
        five.addChild(twelve);

        six.addChild(nine);

        seven.addChild(ten);

        eleven.addChild(thirteen);

        thirteen.addChild(fourteen);

        assertEquals("1 2 4 8 5 11 13 14 12 3 6 9 7 10", traverse(one));
    }
}