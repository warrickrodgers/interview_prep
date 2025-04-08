package common;

import com.sun.source.tree.Tree;

import java.util.List;

public class TreeNode<T extends Comparable<T>> {
    /*
    Class to hold node data and children
     */
    T value;
    List<TreeNode<T>> children;

    public T getValue() {
        return value;
    }

    public void setValue(T data) {
        this.value = data;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode<T>> children) {
        this.children = children;
    }

    public void addToCholdren(TreeNode<T> child) {
        if(child != null && child.value != null) {
            children.add(child);
        }
        else {
            System.out.println("child is invalid/null");
        }
    }
}
