package org.greenbook;

import org.greenbook.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an tree of `TreeNode`, starting from a node considered its root, prints all elements using breadth-first search
 *
 * Example 1:
 *
 * Input:
 *
 * ![tree](img/tree1.png)
 *
 * Output - considering node 1 as root node.
 *
 * 1 4 2 3 5 7 8 10 9 6
 *
 * Example 2:
 *
 * Input - a tree with nodes and respective children:
 *
 * 1 -> 2, 3
 *
 * 2 -> 4, 5
 *
 * 3 -> 6, 7
 *
 * 4 -> 8
 *
 * 6 -> 9
 *
 * 7 -> 10
 *
 * Output - considering node 1 as root node.
 *
 * 1 2 3 4 6 7 8 9 10
 */
public class BFS {

    public static <T> String traverse(TreeNode<T> root) {
        List<TreeNode<T>> queue = new ArrayList<>();
        List<TreeNode<T>> visited = new ArrayList<>();
        List<T> elements = new ArrayList<>();

        queue.add(root);

        visit(queue, visited, elements);

        String output = "";
        for (T element: elements) {
            output += element.toString() + " ";
        }

        return output.trim();
    }

    private static <T> void visit(List<TreeNode<T>> queue, List<TreeNode<T>> visited, List<T> elements) {
        if (queue.isEmpty()) {
            return;
        }
        TreeNode<T> root = queue.get(0);
        if (root == null) {
            return;
        }
        if (!visited.contains(root)) {
            elements.add(root.getValue());
            visited.add(root);
            for (TreeNode child: root.getChildren()) {
                if (!visited.contains(child)) {
                    queue.add(child);
                }
            }
        }
        queue.remove(root);
        visit(queue, visited, elements);
    }

}
