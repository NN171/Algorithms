package LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListRealization<T> implements Iterable<T> {

    private static class Node<T> {
        Node<T> previous;
        Node<T> next;
        T data;

        Node(T data) {
            this.previous = null;
            this.next = null;
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedListRealization() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(T data, int index) {

        if (index == 0) {
            addFirst(data);
        }
        else if (index == size-1) {
            addLast(data);
        }
        else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;

            int currPosition = 0;

            while (current != null && currPosition < index) {
                current = current.next;
                currPosition++;
            }

            if (current == null) {
                addLast(data);
            }
            else {
                newNode.next = current;
                newNode.previous = current.previous;
                current.previous.next = newNode;
                current.previous = newNode;
                size++;
            }
        }
    }

    public void removeFirst() {
        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            Node<T> newNode = head;
            head = newNode.next;
            head.previous = null;
            newNode.next = null;
        }
        size--;
    }

    public void removeLast() {
        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            Node<T> newNode = tail;
            tail = newNode.previous;
            tail.next = null;
            newNode.previous = null;
        }
        size--;
    }

    public void remove(int index) {

        if (index == 0) {
            removeFirst();
        }
        else if (index == size-1) {
            removeLast();
        }
        else {
            Node<T> current = head;

            int currPosition = 0;

            while (current != null && currPosition < index) {
                current = current.next;
                currPosition++;
            }

            if (current == null) {
                throw new IllegalArgumentException("Wrong index");
            }
            else {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                current.previous = null;
                current.next = null;
                size--;
            }
        }
    }

    public void edit(T oldData, T newData) {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(oldData)) {
                break;
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Minion doesn't exist");
        }

        current.data = newData;
    }

    public void edit(T data, int index) {

        Node<T> current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Minion doesn't exist");
        }

        current.data = data;
    }

    public void display() {
        Node<T> temp = head;
        int counter = 0;

        if (temp == null)
            throw new NoSuchElementException("Nothing to return");

        while (temp != null) {
            System.out.printf("%d. %s\n", counter, temp.data);
            temp = temp.next;
            counter++;
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current;

        public LinkedListIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
