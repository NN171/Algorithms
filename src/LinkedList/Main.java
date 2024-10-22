package LinkedList;

import Stack.CustomStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{



        final Minion bob1 = new Minion(24, "Bob", 1);
        final Minion bob2 = new Minion(24, "Bob", 2);
        final Minion rob = new Minion(24, "Rob", 2);
        final Minion jacob = new Minion(32, "Jacob", 3);
        final Minion jason = new Minion(13, "Jason", 2);
        final Minion sam = new Minion(41, "Sam", 1);

//        LinkedListRealization<Minion> minionsLinkedList = new LinkedListRealization();
//
//        minionsLinkedList.add(bob1, 0);
//        minionsLinkedList.add(rob, 1);
//        minionsLinkedList.add(jacob, 2);
//        minionsLinkedList.add(jason, 2);
//        minionsLinkedList.add(sam, 1);
//
//        minionsLinkedList.getFromStart();
//        System.out.println();
//
//        minionsLinkedList.remove(2);
//        minionsLinkedList.remove(3);
//
//        minionsLinkedList.getFromStart();
//        System.out.println();
//
//        minionsLinkedList.edit(new Minion(51, "Donald", 1), 2);
//
//        minionsLinkedList.getFromEnd();
//        System.out.println();
//
//        minionsLinkedList.getFromStart();
//
//        for (Minion minion : minionsLinkedList) {
//            System.out.println(minion.toString());
//        }

        MinionComparator comparator = new MinionComparator();
        List<Minion> minionsList = new ArrayList<>();

        minionsList.add(bob1);
        minionsList.add(bob2);
        minionsList.add(rob);
        minionsList.add(jacob);
        minionsList.add(jason);

        minionsList.sort(comparator);

        for (Minion minion : minionsList) {
            System.out.println(minion);
        }

//        System.out.println();

//        CustomStack<Minion> stack = new CustomStack<>();
//
//        stack.push(bob1);
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


//        for (int i = 1; i <= 9; i++) {
//            numStack.push(i);
//        }
//
//        CustomStack<Integer> newStack = numStack.clone();
//
//        for (int i = newStack.size()-1; i > 0; i--) {
//            int popNum = newStack.pop();
//            if (popNum == 3) {
//                System.out.println(popNum);
//                break;
//            }
//        }
//
//        //System.out.println(numStack.getByElement(3));
//        numStack.getStack();
//        System.out.println();

//        final String brackets = "{[{[}]]}";
//
//        CustomStack<Character> numStack = new CustomStack<>();
//
//        for (char bracket : brackets.toCharArray()) {
//            if (bracket == '[' || bracket == '{' || bracket == '(') {
//                numStack.push(bracket);
//            }
//            else if (bracket == ']' && numStack.peek() == '['
//                    || bracket == '}' && numStack.peek() == '{'
//                    || bracket == ')' && numStack.peek() == '(') {
//                numStack.pop();
//            }
//        }
//        if (numStack.isEmpty()) {
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
    }
}
