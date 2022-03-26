package ru.cs.vsu.berezin_y_a;

import java.util.Stack;

public class StandardQueue<T> {

    private final Stack<T> firstStack = new Stack<>();
    private final Stack<T> secondStack = new Stack<>();
    private int size;

    public void push(T value) {
        firstStack.push(value);
        size++;
    }

    public void pop() {
        if (secondStack.size() == 0) {
            for (int i = 0; i < size; i++) {
                secondStack.push(firstStack.peek());
                firstStack.pop();
            }
        }

        secondStack.pop();
        size--;

        for (int i = 0; i < size; i++) {
            firstStack.push(secondStack.peek());
            secondStack.pop();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (firstStack.size() != 0) {
            for (T t : firstStack) {
                stringBuilder.append(t.toString());
                stringBuilder.append(" ");
            }
        }
        if (secondStack.size() != 0) {
            for (T t : secondStack) {
                stringBuilder.append(t.toString());
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append(" ");
        return stringBuilder.toString();
    }

    public int size() {
        return size;
    }

}
