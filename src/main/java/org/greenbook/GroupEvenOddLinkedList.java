package org.greenbook;

import org.greenbook.model.LinkedNode;

public class GroupEvenOddLinkedList {

    public static LinkedNode<Integer> groupKeepingOrder(LinkedNode<Integer> rootNode) {
        if ((rootNode == null) || (rootNode.getNext() == null)) {
            return rootNode;
        }
        LinkedNode<Integer> currentNode = null;

        LinkedNode evenMark = null;
        LinkedNode firstOdd = null;
        LinkedNode previousNode = null;

        do {
            if (currentNode == null) {
                currentNode = rootNode;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (isOdd(currentNode.getValue())) {
                if (firstOdd == null) {
                    firstOdd = currentNode;
                }
            } else {
                if (firstOdd != null) {
                    previousNode.setNext(currentNode.getNext());
                    currentNode.setNext(firstOdd);
                    if (evenMark == null) {
                        rootNode = currentNode;
                    } else {
                        evenMark.setNext(currentNode);
                    }
                }
                evenMark = currentNode;
            }

        } while (currentNode.getNext() != null);


        return rootNode;
    }

    public static LinkedNode<Integer> group(LinkedNode<Integer> rootNode) {
        if ((rootNode == null) || (rootNode.getNext() == null)) {
            return rootNode;
        }
        LinkedNode<Integer> currentNode = rootNode.getNext();
        LinkedNode<Integer> previousNode = rootNode;
        LinkedNode<Integer> next;
        do {
            next = currentNode.getNext();
            if (isEven(currentNode.getValue())) {
                previousNode.setNext(next);
                currentNode.setNext(rootNode);
                rootNode = currentNode;
            } else {
                previousNode = currentNode;
            }
            currentNode = next;

        } while (currentNode != null);
        return rootNode;
    }

    private static boolean isOdd(Integer value) {
        return value.intValue() % 2 != 0;
    }

    private static boolean isEven(Integer value) {
        return value.intValue() % 2 == 0;
    }


}
