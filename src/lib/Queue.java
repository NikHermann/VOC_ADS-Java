package lib;

import lecture.chapter03.IFIterator;
import lecture.chapter03.IRIterator;

public class Queue {
    protected int size = 0;
    protected lecture.chapter03.DList list = new lecture.chapter03.DList();
    
    public void enqueue(Object data) {
        list.prepend(data);
        size++;
    }
    
    public Object peek() {
        Object data = null;

        IRIterator it = list.rIterator();
        if (it.hasPrevious()) {
            data = it.previous();
        }
        
        return data;
    }
    
    public Object dequeue() {
        Object data = peek();
        
        if (data != null) {
            list.reverseRemove(data);
            size--;
        }
        
        return data;
    }
    
    public void rewind() {
        IFIterator it = list.fIterator();
        if (it.hasNext()) {
            Object data = it.next();
            list.forwardRemove(data);
        }
    }
    
    public boolean empty() {
        return size == 0;
    }
}
