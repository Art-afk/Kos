package part1;

import java.util.*;

public class MyQueue {

    private Stack<Object> stackMain = new Stack<Object>();

    public void addFirst(Object object) {
        stackMain.add(object);
    }

    public void addLast(Object object) {
        Stack<Object> stackTakeover = new Stack<Object>();
        for (Object st : stackMain) {
            stackTakeover.add(st);
        }
        stackTakeover.add(object);
        stackMain.clear();
        for (Object st : stackTakeover) {
            stackMain.add(st);
        }

    }

    public Object element() {
        if (stackMain.empty()) throw new NoSuchElementException();
        else return stackMain.firstElement();
    }

    public Object peek() {
        if (stackMain.empty()) throw new NoSuchElementException();
        else return stackMain.firstElement();
    }

    /**
     * Если очередь пуста, генерирует исключение NoSuchElementException
     *
     * @return возвращает с удалением элемент из начала очереди.
     */
    public Object remove() {
        Stack<Object> stackTakeover = new Stack<Object>();
        Object ret;
        if (stackMain.empty()) throw new NoSuchElementException();
        else {
            Iterator<Object> itr = stackMain.iterator();
            {
                while (itr.hasNext()) {
                    stackTakeover.push(stackMain.pop());
                }
                ret = stackTakeover.pop();
                Iterator<Object> itr2 = stackTakeover.iterator();
                while (itr2.hasNext()) {
                    stackMain.push(stackTakeover.pop());
                }
            }
            return ret;
        }
    }

    public Object pool() {
        Stack<Object> stackTakeover = new Stack<Object>();
        Object ret;
        if (stackMain.empty()) throw new NoSuchElementException();
        else {
            Iterator<Object> itr = stackMain.iterator();
            {
                while (itr.hasNext()) {
                    stackTakeover.push(stackMain.pop());
                }
                ret = stackTakeover.pop();
                Iterator<Object> itr2 = stackTakeover.iterator();
                while (itr2.hasNext()) {
                    stackMain.push(stackTakeover.pop());
                }
            }
            return ret;
        }
    }

    public Object getLast() {
        return stackMain.peek();

    }

    public Object getFirst() {

        return stackMain.firstElement();

    }

    public Object prt() {
        for (Object item : stackMain) {
            System.out.println(item);
        }
        return true;
    }


}
