package org.greenbook;

import org.greenbook.model.LinkedNode;
import org.junit.Test;

import static org.greenbook.GroupEvenOddLinkedList.group;
import static org.greenbook.GroupEvenOddLinkedList.groupKeepingOrder;
import static org.junit.Assert.*;

public class GroupEvenOddLinkedListTest {

    @Test
    public void testGroupKeepingOrderCase1() {
        LinkedNode<Integer> node6 = new LinkedNode<>(6);
        LinkedNode<Integer> node14 = new LinkedNode<>(14);
        LinkedNode<Integer> node10 = new LinkedNode<>(10);
        LinkedNode<Integer> node7 = new LinkedNode<>(7);
        LinkedNode<Integer> node2 = new LinkedNode<>(2);
        LinkedNode<Integer> node3 = new LinkedNode<>(3);
        LinkedNode<Integer> node8 = new LinkedNode<>(8);

        node6.setNext(node14);
        node14.setNext(node10);
        node10.setNext(node7);
        node7.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node8);

        LinkedNode rootNode = groupKeepingOrder(node6);
        LinkedNode secondNode = rootNode.getNext();
        LinkedNode thirdNode = secondNode.getNext();
        LinkedNode forthNode = thirdNode.getNext();
        LinkedNode fifthNode = forthNode.getNext();
        LinkedNode sixthNode = fifthNode.getNext();
        LinkedNode seventhNode = sixthNode.getNext();

        assertEquals(new Integer(6), rootNode.getValue());
        assertEquals(new Integer(14), secondNode.getValue());
        assertEquals(new Integer(10), thirdNode.getValue());
        assertEquals(new Integer(2), forthNode.getValue());
        assertEquals(new Integer(8), fifthNode.getValue());
        assertEquals(new Integer(7), sixthNode.getValue());
        assertEquals(new Integer(3), seventhNode.getValue());
    }

    @Test
    public void testGroupKeepingOrderCase2() {
        LinkedNode<Integer> node1 = new LinkedNode<>(1);
        LinkedNode<Integer> node2 = new LinkedNode<>(2);
        LinkedNode<Integer> node3 = new LinkedNode<>(3);
        LinkedNode<Integer> node4 = new LinkedNode<>(4);
        LinkedNode<Integer> node5 = new LinkedNode<>(5);
        LinkedNode<Integer> node6 = new LinkedNode<>(6);
        LinkedNode<Integer> node7 = new LinkedNode<>(7);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);

        LinkedNode rootNode = groupKeepingOrder(node1);
        LinkedNode secondNode = rootNode.getNext();
        LinkedNode thirdNode = secondNode.getNext();
        LinkedNode forthNode = thirdNode.getNext();
        LinkedNode fifthNode = forthNode.getNext();
        LinkedNode sixthNode = fifthNode.getNext();
        LinkedNode seventhNode = sixthNode.getNext();

        assertEquals(new Integer(2), rootNode.getValue());
        assertEquals(new Integer(4), secondNode.getValue());
        assertEquals(new Integer(6), thirdNode.getValue());
        assertEquals(new Integer(1), forthNode.getValue());
        assertEquals(new Integer(3), fifthNode.getValue());
        assertEquals(new Integer(5), sixthNode.getValue());
        assertEquals(new Integer(7), seventhNode.getValue());
    }

    @Test
    public void testGroupKeepingOrderCase3() {
        LinkedNode<Integer> node1 = new LinkedNode<>(1);
        LinkedNode<Integer> node2 = new LinkedNode<>(2);
        LinkedNode<Integer> node3 = new LinkedNode<>(3);
        LinkedNode<Integer> node4 = new LinkedNode<>(5);
        LinkedNode<Integer> node5 = new LinkedNode<>(4);
        LinkedNode<Integer> node6 = new LinkedNode<>(6);
        LinkedNode<Integer> node7 = new LinkedNode<>(7);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);

        LinkedNode rootNode = groupKeepingOrder(node1);
        LinkedNode secondNode = rootNode.getNext();
        LinkedNode thirdNode = secondNode.getNext();
        LinkedNode forthNode = thirdNode.getNext();
        LinkedNode fifthNode = forthNode.getNext();
        LinkedNode sixthNode = fifthNode.getNext();
        LinkedNode seventhNode = sixthNode.getNext();

        assertEquals(new Integer(2), rootNode.getValue());
        assertEquals(new Integer(4), secondNode.getValue());
        assertEquals(new Integer(6), thirdNode.getValue());
        assertEquals(new Integer(1), forthNode.getValue());
        assertEquals(new Integer(3), fifthNode.getValue());
        assertEquals(new Integer(5), sixthNode.getValue());
        assertEquals(new Integer(7), seventhNode.getValue());
    }

    @Test
    public void testGroupCase1() {

        LinkedNode<Integer> node1 = new LinkedNode<>(1);
        LinkedNode<Integer> node2 = new LinkedNode<>(2);
        LinkedNode<Integer> node3 = new LinkedNode<>(3);
        LinkedNode<Integer> node4 = new LinkedNode<>(4);
        LinkedNode<Integer> node5 = new LinkedNode<>(5);
        LinkedNode<Integer> node6 = new LinkedNode<>(6);
        LinkedNode<Integer> node7 = new LinkedNode<>(7);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);

        LinkedNode rootNode = group(node1);
        LinkedNode secondNode = rootNode.getNext();
        LinkedNode thirdNode = secondNode.getNext();
        LinkedNode forthNode = thirdNode.getNext();
        LinkedNode fifthNode = forthNode.getNext();
        LinkedNode sixthNode = fifthNode.getNext();
        LinkedNode seventhNode = sixthNode.getNext();

        assertEquals(new Integer(6), rootNode.getValue());
        assertEquals(new Integer(4), secondNode.getValue());
        assertEquals(new Integer(2), thirdNode.getValue());
        assertEquals(new Integer(1), forthNode.getValue());
        assertEquals(new Integer(3), fifthNode.getValue());
        assertEquals(new Integer(5), sixthNode.getValue());
        assertEquals(new Integer(7), seventhNode.getValue());
    }

    @Test
    public void testGroupCase2() {
        LinkedNode<Integer> node1 = new LinkedNode<>(2);
        LinkedNode<Integer> node2 = new LinkedNode<>(5);
        LinkedNode<Integer> node3 = new LinkedNode<>(7);
        LinkedNode<Integer> node4 = new LinkedNode<>(8);
        LinkedNode<Integer> node5 = new LinkedNode<>(11);
        LinkedNode<Integer> node6 = new LinkedNode<>(9);
        LinkedNode<Integer> node7 = new LinkedNode<>(12);
        LinkedNode<Integer> node8 = new LinkedNode<>(6);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);

        LinkedNode rootNode = group(node1);
        LinkedNode secondNode = rootNode.getNext();
        LinkedNode thirdNode = secondNode.getNext();
        LinkedNode forthNode = thirdNode.getNext();
        LinkedNode fifthNode = forthNode.getNext();
        LinkedNode sixthNode = fifthNode.getNext();
        LinkedNode seventhNode = sixthNode.getNext();
        LinkedNode eighthNode = seventhNode.getNext();

        assertEquals(new Integer(6), rootNode.getValue());
        assertEquals(new Integer(12), secondNode.getValue());
        assertEquals(new Integer(8), thirdNode.getValue());
        assertEquals(new Integer(2), forthNode.getValue());
        assertEquals(new Integer(5), fifthNode.getValue());
        assertEquals(new Integer(7), sixthNode.getValue());
        assertEquals(new Integer(11), seventhNode.getValue());
        assertEquals(new Integer(9), eighthNode.getValue());
    }

}