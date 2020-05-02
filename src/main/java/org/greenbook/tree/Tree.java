package org.greenbook.tree;

import java.util.Iterator;
import java.util.LinkedList;

public class Tree<T extends TreeNode> {

    private T root;

    public Tree(T root) {
        this.root = root;
    }

    public Iterator<T> iterator() {
        return new TreeIterator();
    }

    private class TreeIterator<T extends TreeNode> implements Iterator<T> {

        private LinkedList<T> stack;

        TreeIterator() {
            stack = new LinkedList<>();
            stack.add((T) Tree.this.root);
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public T next() {
            T next = stack.pollLast();
            for (int i = next.getChildren().size() - 1; i >= 0; i--) {
                stack.add((T) next.getChildren().get(i));
            }
            return next;
        }
    }


}
