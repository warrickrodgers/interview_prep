package algorithms.search.dfs;

import common.TreeNode;

import java.util.*;

public class dfs<T extends Comparable<T>> {

    /**
     * Iterative DFS, Assumes the Tree is populated correctly
     * @param root
     * @param <T>
     */
    public static <T extends Comparable<T>> void iterativeTreeDFS(TreeNode<T> root) {
        Stack<TreeNode<T>> stack = new Stack<>();
        Set<T> visited = new HashSet<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<T> current = stack.pop();
            T value = current.getValue();
            if(!visited.contains(value)) {
                visited.add(value);
                System.out.print(value + " ");

                for (TreeNode<T> child : current.getChildren()) {
                    if(!visited.contains(child.getValue())) {
                        stack.push(child);
                    }
                }

            }

        }
    }


}
