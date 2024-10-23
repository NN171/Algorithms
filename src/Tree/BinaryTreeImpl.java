package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class BinaryTreeImpl<T> implements AbstractBinaryTree<T> {
    private T value;
    private BinaryTreeImpl<T> left;
    private BinaryTreeImpl<T> right;

    public BinaryTreeImpl() {
        this.left = null;
        this.right = null;
    }

    @Override
    public T getKey() {
        return this.value;
    }

    @Override
    public AbstractBinaryTree<T> getLeft() {
        return this.left;
    }

    @Override
    public AbstractBinaryTree<T> getRight() {
        return this.right;
    }

    @Override
    public void setKey(T key) {
        this.value = key;
    }

    @Override
    public String asIndentedPreOrder(int indent) {
        List<T> elements = new ArrayList<>();
        int depth = 0;

        if (left != null) {
            elements.add(left.value);
            depth++;
            asIndentedPreOrder(indent);
        }
        if (right != null) {
            elements.add(right.value);
            asIndentedPreOrder(indent);
        }

        return structurize(elements, indent, depth);
    }

    private String structurize(List<T> elements, int indent, int depth) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        while (counter++ < depth) {
            int nodes = (counter+1)*2;
            for (int i = 0; i < nodes; i++) {
                sb.append(" ".repeat(depth - i)).append(elements).append(" ".repeat(indent));
            }
        }
        return sb.toString();
    }

    @Override
    public List<AbstractBinaryTree<T>> preOrder() {
        List<AbstractBinaryTree<T>> trees = new ArrayList<>();
        preOrderCalc(trees);
        return trees;
    }

    private void preOrderCalc(List<AbstractBinaryTree<T>> trees) {
        trees.add(this);

        if (left != null) {
            left.preOrderCalc(trees);
        }
        if (right != null) {
            right.preOrderCalc(trees);
        }
    }

    @Override
    public List<AbstractBinaryTree<T>> inOrder() {
        return List.of();
    }

    @Override
    public List<AbstractBinaryTree<T>> postOrder() {
        return List.of();
    }

    @Override
    public void forEachInOrder(Consumer<T> consumer) {

    }
}
