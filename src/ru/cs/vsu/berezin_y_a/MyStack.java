package ru.cs.vsu.berezin_y_a;

public class MyStack<T> {

    private MyStackNode top = null;
    private int size;

    private class MyStackNode {

        public T value;
        public MyStackNode next;

        public MyStackNode(T value, MyStackNode next) {
            this.value = value;
            this.next = next;
        }

        public MyStackNode(T value) {
            this(value, null);
        }

    }

    private void checkEmptyError() {
        if (size == 0) {
            throw new IllegalStateException("Empty list");
        }
    }

    public void push(T value) {
        if (size == 0) {
            top = new MyStackNode(value);
        } else {
            top = new MyStackNode(value, top);
        }

        size++;
    }

    public void pop() {
        checkEmptyError();

        if (size == 1) {
            top = null;
        } else {
            top = top.next;
        }

        size--;
    }

    @Override
    public String toString() {
        MyStackNode currentNode = top;
        StringBuilder stringBuilder = new StringBuilder();

        while (currentNode != null) {
            stringBuilder.append(currentNode.value).append(" ");
            currentNode = currentNode.next;
        }

        return stringBuilder.toString();
    }

    public int size() {
        return size;
    }

    public T top() {
        return top.value;
    }

}
