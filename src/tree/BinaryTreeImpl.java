package tree;

import java.util.List;
import java.util.function.Consumer;

public class BinaryTreeImpl<T> implements AbstractBinaryTree<T>{
     private T value;
     private BinaryTreeImpl<T> parent;
     private List<BinaryTreeImpl<T>> children;

     @Override
     public T getKey() {
          return this.value;
     }

     @Override
     public AbstractBinaryTree<T> getLeft() {
          return this.children.get(0);
     }

     @Override
     public AbstractBinaryTree<T> getRight() {
          return this.children.get(1);
     }

     @Override
     public void setKey(T key) {
          this.value = key;
     }

     @Override
     public String asIndentedPreOrder(int indent) {
          return "";
     }

     @Override
     public List<AbstractBinaryTree<T>> preOrder() {
          return List.of();
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
