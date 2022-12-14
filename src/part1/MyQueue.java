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
        if (stackTakeover.empty() && !stackMain.empty()) {
            Iterator<Object> itr = stackMain.iterator();
            while (itr.hasNext()) {
                stackTakeover.push(stackMain.pop());
            }
        } else if (stackTakeover.empty() && stackMain.empty()) {
            throw new NoSuchElementException();
        }
        return stackTakeover.peek();
    }
    public Object peek() {
        if (stackTakeover.empty() && !stackMain.empty()) {
            Iterator<Object> itr = stackMain.iterator();
            while (itr.hasNext()) {
                stackTakeover.push(stackMain.pop());
            }
        } else if (stackTakeover.empty() && stackMain.empty()) {
            return null;
        }
        return stackTakeover.peek();
    }
    public Object remove() {
        if (stackTakeover.empty() && !stackMain.empty()) {
            Iterator<Object> itr = stackMain.iterator();
            while (itr.hasNext()) {
                stackTakeover.push(stackMain.pop());
            }
        } else if (stackTakeover.empty() && stackMain.empty()) {
            throw new NoSuchElementException();
        }
        return stackTakeover.pop();
    }
    public Object pool() {
        if (stackTakeover.empty() && !stackMain.empty()) {
            Iterator<Object> itr = stackMain.iterator();
            while (itr.hasNext()) {
                stackTakeover.push(stackMain.pop());
            }
        } else if (stackTakeover.empty() && stackMain.empty()) {
            return null;
        }
        return stackTakeover.pop();
    }

    public boolean print() {
        for (Object item : stackMain) {
            System.out.println(item);
        }
        return true;
    }
}
