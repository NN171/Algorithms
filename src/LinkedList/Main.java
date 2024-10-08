package LinkedList;

import Stack.CustomStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        final Minion bob = new Minion(27, "Bob", 1);
        final Minion rob = new Minion(24, "Rob", 2);
        final Minion jacob = new Minion(32, "Jacob", 3);
        final Minion jason = new Minion(13, "Jason", 2);
        final Minion sam = new Minion(41, "Sam", 1);

//        LinkedListRealization<Minion> minionsLinkedList = new LinkedListRealization();
//
//        minionsLinkedList.add(bob, 0);
//        minionsLinkedList.add(rob, 1);
//        minionsLinkedList.add(jacob, 2);
//        minionsLinkedList.add(jason, 3);
//        minionsLinkedList.add(sam, 4);
//
//        minionsLinkedList.remove(2);
//        minionsLinkedList.remove(3);
//
//        minionsLinkedList.edit(new Minion(51, "Donald", 1), 2);
//
//        for (Minion minion : minionsLinkedList) {
//            System.out.println(minion.toString());
//        }
//
//        System.out.println();

//        MinionComparator comparator = new MinionComparator();
//        List<Minion> minionsList = new ArrayList<>();
//
//        minionsList.add(bob);
//        minionsList.add(rob);
//        minionsList.add(jacob);
//        minionsList.add(jason);
//
//        minionsList.sort(comparator);
//
//        for (Minion minion : minionsList) {
//            System.out.println(minion);
//        }
//
//        System.out.println();

//        CustomStack<Minion> stack = new CustomStack<>();
//
//        stack.push(bob);
//        stack.push(rob);
//        stack.push(jacob);
//        stack.push(jason);
//        stack.push(sam);
//
//        for (Minion minion : stack) {
//            System.out.println(minion.toString());
//        }
//        System.out.println();
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println();
//
//        System.out.println(stack.peek());
//        System.out.println();
//
//        for (Minion minion : stack) {
//            System.out.println(minion.toString());
//        }

        CustomStack<Integer> numStack = new CustomStack<>();

        for (int i = 1; i <= 9; i++) {
            numStack.push(i);
        }

        CustomStack<Integer> newStack = numStack.clone();

        for (int i = newStack.size()-1; i > 0; i--) {
            int popNum = newStack.pop();
            if (popNum == 3) {
                System.out.println(popNum);
                break;
            }
        }

        //System.out.println(numStack.getByElement(3));
        numStack.getStack();
        System.out.println();
        newStack.getStack();
    }
}
