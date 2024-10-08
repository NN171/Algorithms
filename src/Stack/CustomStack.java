package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

public class CustomStack<T> implements Iterable<T>, Cloneable {

    private T[] array;
    private int index;
    private int size;

    public CustomStack() {
        array = (T[]) new Object[5];
        index = -1;
        size = 0;
    }

    public void push(T item) {
        isFull();
        array[++index] = item;
        size++;
    }

    public T pop() {
        isEmpty();
        T element = array[index];
        array[index--] = null;
        size--;
        return element;
    }

    public T peek() {
        isEmpty();
        return array[index];
    }

    public void isEmpty() {
        if (index == -1) {
            throw new EmptyStackException();
        }
    }

    public void isFull() {
        if (index == array.length - 1) {
            resizeArray();
        }
    }

    public void resizeArray() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public int size() {
        return size;
    }

    public T getByElement(T num) {
        T[] newArray = Arrays.copyOf(array, array.length);

        System.out.println();
        for (T obj : newArray) {
            if (obj.equals(num)) {
                return obj;
            }
        }

        return null;
    }

    public void getStack() {
        for (T num : array) {
            if (num != null) {
                System.out.print(num + "\t");
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length && array[index] != null;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}