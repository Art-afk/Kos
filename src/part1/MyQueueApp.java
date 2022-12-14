package part1;


public class MyQueueApp {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer("1");
        myQueue.offer("2");
        myQueue.offer("3");
        myQueue.offer("4");
        myQueue.offer("5");
        System.out.println("Element: " + myQueue.element()); //возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, инициируется исключение NoSuchElementException.
        System.out.println("Remove: " + myQueue.remove()); // удаляет элемент из головы очереди, возвращая его. Инициирует исключение NoSuchElementException, если очередь пуста.
        System.out.println(myQueue.print());
        System.out.println("Pool: " + myQueue.pool());//возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.
        System.out.println("Peek: " + myQueue.peek());//возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.
        System.out.println("Element: " + myQueue.element()); //возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, инициируется исключение NoSuchElementException.

        myQueue.clear();
        System.out.println("Peek null: " + myQueue.peek());//возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.
        System.out.println("Element after clear: " + myQueue.element()); //возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, инициируется исключение NoSuchElementException.

    }
}


