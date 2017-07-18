package Algorithm.LinearList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 15:38.
 */
@SuppressWarnings("all")
public interface List {
    public int getSize();
    public boolean isEmpty();
    public boolean contains(Object e);
    public int indexOf(Object e);
    public void insert(int i , Object e) throws OutOfBoundaryException;
    public boolean insertBefore(Object obj, Object e);
    public boolean insertAfter(Object obj, Object e);
    public Object remove(int i ) throws  OutOfBoundaryException;
    public boolean remove(Object e);
    public Object replace(int i, Object e) throws OutOfBoundaryException;
    public Object get(int i) throws OutOfBoundaryException;
}
