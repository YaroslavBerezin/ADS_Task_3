package ru.cs.vsu.berezin_y_a;

public class MainStandard {

    public static void main(String[] args) {
        StandardQueue<Integer> queue = new StandardQueue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue);

        queue.pop();
        queue.pop();

        System.out.println(queue);
    }

}
