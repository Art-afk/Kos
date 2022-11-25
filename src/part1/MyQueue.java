package part1;

import java.util.*;

public class MyQueue {

    private Stack<Object> stackMain = new Stack<Object>();

    public void add(Object object) {
        stackMain.add(object);
    }

    public void clear() {
        stackMain.clear();
    }

    public Object element() {
        if (stackMain.empty()) throw new NoSuchElementException();
        else {
            Stack<Object> stackTakeover = new Stack<Object>();
            Object ret;
            if (stackMain.empty()) throw new NoSuchElementException();
            else {
                Iterator<Object> itr = stackMain.iterator();
                while (itr.hasNext()) {
                    stackTakeover.push(stackMain.pop());
                }
                ret = stackTakeover.peek();
                Iterator<Object> itr2 = stackTakeover.iterator();
                while (itr2.hasNext()) {
                    stackMain.push(stackTakeover.pop());
                }
            }
            return ret;

        }
    }

    public Object peek() {
        if (stackMain.empty()) return null;
        else {
            Stack<Object> stackTakeover = new Stack<Object>();
            Object ret;
            if (stackMain.empty()) throw new NoSuchElementException();
            else {
                Iterator<Object> itr = stackMain.iterator();
                while (itr.hasNext()) {
                    stackTakeover.push(stackMain.pop());
                }
                ret = stackTakeover.peek();
                Iterator<Object> itr2 = stackTakeover.iterator();
                while (itr2.hasNext()) {
                    stackMain.push(stackTakeover.pop());
                }
            }
            return ret;
        }
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

    public boolean print() {
        for (Object item : stackMain) {
            System.out.println(item);
        }
        return true;
    }


}
