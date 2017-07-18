package Algorithm.LinearList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 21:13.
 */
public class ListArray implements List {
    private final int LEN = 8;//定义数组的默认大小
    private Strategy strategy;
    private int size;
    private Object[] elements;

    public ListArray(Strategy strategy) {
        this.strategy = strategy;
        size = 0;
        elements = new Object[LEN];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++)
            if (strategy.equals(e, elements[i])) return true;
        return false;
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (strategy.equals(e, elements[i])) return i;
        return -1;
    }

    @Override
    public void insert(int i, Object e) throws OutOfBoundaryException {
        if (i < 0 || i > size)
            throw new OutOfBoundaryException("error");
        if (size > elements.length)
            expandSpace();
        for (int j = size; j > i; j--)
            elements[j] = elements[j - 1];
        elements[i] = e;
        size++;
        return;
    }

    private void expandSpace() {
        Object[] a = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++)
            a[i] = elements[i];
        elements = a;
    }

    @Override
    public boolean insertBefore(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0) return false;
        insert(i, e);
        return true;
    }

    @Override
    public boolean insertAfter(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0) return false;
        insert(i + 1, e);
        return true;
    }

    @Override
    public Object remove(int i) throws OutOfBoundaryException {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) throws OutOfBoundaryException {
        return null;
    }

    @Override
    public Object get(int i) throws OutOfBoundaryException {
        return null;
    }
}
