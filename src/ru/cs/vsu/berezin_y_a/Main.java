package ru.cs.vsu.berezin_y_a;

public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println(queue);

        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println(queue);
    }

}
