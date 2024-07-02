package org.greenbook;

import org.greenbook.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an tree of `TreeNode`, starting from a node considered its root, prints all elements using depth-first search
 *
 * Example 1:
 *
 * Input:
 *
 * ![tree](doc/img/tree1.png)
 *
 * Output - considering node 1 as root node.
 *
 * 1 4 3 10 9 2 8 7 5 6
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
 * 5 -> 11, 12
 *
 * 6 -> 9
 *
 * 7 -> 10
 *
 * 11 -> 13
 *
 * 13 -> 14
 *
 * Output - considering node 1 as root node.
 *
 * 1 2 4 8 5 11 13 14 12 3 6 9 7 10
 */
public class DFS {

    public static <T> String traverse(TreeNode<T> root) {
        List<TreeNode<T>> visited = new ArrayList<>();
        List<T> elements = new ArrayList<>();

        visit(root, visited, elements);

        String output = "";
        for (T element: elements) {
            output += element + " ";
        }

        return output.trim();
    }

    private static <T> void visit(TreeNode<T> node, List<TreeNode<T>> visited, List<T> elements) {
        visited.add(node);
        if (!elements.contains(node.getValue())) {
            elements.add(node.getValue());
        }
        if (node.getChildren() != null && !node.getChildren().isEmpty()) {
            for (TreeNode child: node.getChildren()) {
                if (!visited.contains(child)) {
                    visit(child, visited, elements);
                }
            }
        }
    }

}
