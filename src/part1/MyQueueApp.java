package part1;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueueApp {


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");
        myQueue.add("4");
        myQueue.add("5");
        System.out.println("Element: " + myQueue.element()); //возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, инициируется исключение NoSuchElementException.
        System.out.println("Remove: " + myQueue.remove()); // удаляет элемент из головы очереди, возвращая его. Инициирует исключение NoSuchElementException, если очередь пуста.
        System.out.println(myQueue.print());
        System.out.println("Pool: " + myQueue.pool());//возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.
        System.out.println("Peek: " + myQueue.peek());//возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.
        System.out.println(myQueue.print());
        myQueue.clear();

    }

}


