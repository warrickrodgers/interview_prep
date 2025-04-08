package algorithms.search.bfs;

import common.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class bfs {

    /**
     * BFS for tree based BFS. Assumes tree is already populated/externally managed
     * @param root
     * @param <T>
     */
    public static <T extends Comparable<T>> void iterativeTreeBFS(TreeNode<T> root) {
        Queue<TreeNode<T>> queue = new LinkedList<>();
        Set<T> visited = new HashSet<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            T value = current.getValue();

            if(!visited.contains(value)) {
                visited.add(value);
                System.out.print(value + " ");
                for (TreeNode<T> child : current.getChildren()) {
                    if(!visited.contains(child.getValue())) {
                        queue.add(child);
                    }
                }
            }
        }
    }
}
