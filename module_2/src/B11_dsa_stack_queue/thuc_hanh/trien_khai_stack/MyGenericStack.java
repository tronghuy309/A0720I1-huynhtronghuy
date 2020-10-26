package B11_dsa_stack_queue.thuc_hanh.trien_khai_stack;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyGenericStack<T>{

    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push( T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return  stack.removeFirst();
        }
    }

    public int size() {
        return  stack.size();
    }

    public boolean isEmpty() {
        if( stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
