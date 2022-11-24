package part1;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueueApp {


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.addFirst("1");
        myQueue.addFirst("2");
        myQueue.addFirst("3");
        myQueue.addFirst("4");
        myQueue.addFirst("5");
        System.out.println(myQueue.prt());
        System.out.println("First: " + myQueue.getFirst());
        System.out.println("Last: " + myQueue.getLast());
        System.out.println("Element: " + myQueue.element());
        System.out.println("Remove: " + myQueue.remove());
        System.out.println("Pool: " + myQueue.pool());
        System.out.println(myQueue.prt());
        qua(); //debug for me


    }

    public static void qua(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        }
    }


