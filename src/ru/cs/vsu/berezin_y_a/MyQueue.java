package ru.cs.vsu.berezin_y_a;

public class MyQueue<T> {

    private final MyStack<T> firstStack = new MyStack<>();
    private final MyStack<T> secondStack = new MyStack<>();
    private int size;

    public void push(T value) {
        firstStack.push(value);
        size++;
    }

    public void pop() {
        if (secondStack.size() == 0) {
            for (int i = 0; i < size; i++) {
                secondStack.push(firstStack.top());
                firstStack.pop();
            }
        }

        secondStack.pop();
        size--;

        for (int i = 0; i < size; i++) {
            firstStack.push(secondStack.top());
            secondStack.pop();
        }
    }

    @Override
    public String toString() {
        return new StringBuilder(firstStack.toString() + secondStack.toString()).reverse().toString();
    }

    public int size() {
        return size;
    }

}
