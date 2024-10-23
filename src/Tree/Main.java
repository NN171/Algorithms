package Tree;

public class Main {
    public static void main(String[] args) {
        AbstractBinaryTree<Integer> tree = new BinaryTreeImpl<>();
        tree.setKey(1);
        AbstractBinaryTree<Integer> treeLeft = new BinaryTreeImpl<>();
        AbstractBinaryTree<Integer> treeRight = new BinaryTreeImpl<>();
        treeLeft.setKey(2);
        treeRight.setKey(3);

        tree.asIndentedPreOrder(2);
    }
}
