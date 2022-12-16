package part1;

import java.util.*;

public class MyQueue {
    private Stack<Object> stackMain = new Stack<Object>();
    private Stack<Object> stackTakeover = new Stack<Object>();

    public boolean offer(Object object) {
        return stackMain.add(object);
    }

    public void clear() {
        stackMain.clear();
        stackTakeover.clear();
    }

    public Object element() {
        revertStack();
        if (stackTakeover.empty()) {
            throw new NoSuchElementException();
        }
        return stackTakeover.peek();
    }

    public Object peek() {
        revertStack();
        if (stackTakeover.empty() ) {
            return null;
        }
        return stackTakeover.peek();
    }

    public Object remove() {
        revertStack();
        if (stackTakeover.empty()) {
            throw new NoSuchElementException();
        }
        return stackTakeover.pop();
    }

    public Object pool() {
        revertStack();
        if (stackTakeover.empty()) {
            return null;
        }
        return stackTakeover.pop();
    }


    public Object print() {
        revertStack();
        if (stackTakeover.empty()) {
            return null;
        }
        return stackTakeover.toString();

    }

    private void revertStack() {
        if (stackTakeover.empty() && !stackMain.empty()) {
            Iterator<Object> itr = stackMain.iterator();
            while (itr.hasNext()) {
                stackTakeover.push(stackMain.pop());
            }
        }
    }
}
