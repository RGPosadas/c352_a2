import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    private E obj;

    public boolean add(E e) {
        return true;
    }

    public void add(int index, E e) {

    }

    public void clear() {

    }

    public E remove(int index) {
        return obj;
    }

    public boolean remove (Object o) {
        return false;
    }

    public String toString() {
        return "";
    }

    public int size() {
        return 0;
    }

    /////////////////////////////////////////////////
    // METHODS THAT WE ARE NOT IMPLEMENTING
    /////////////////////////////////////////////////
    public boolean addAll(Collection<? extends E> c) {
        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException err) {
            err.printStackTrace();
        }
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException err) {
            err.printStackTrace();
        }
        return false;
    }

    public boolean contains(Object o) {
       try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return false;
    }

    public boolean containsAll(Collection<?> c) {
       try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return false;
    }

    public boolean equals(Object o) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           err.printStackTrace();
       }
       return false;
    }

    public E get(int index) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           err.printStackTrace();
       }
       return null;
    }

    public int hashCode() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           err.printStackTrace();
       }
       return 0;
    }

    public int indexOf(Object o) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           err.printStackTrace();
       }
       return 0;
    }

    public boolean isEmpty() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           err.printStackTrace();
       }
       return false;
    }

    public Iterator<E> iterator() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }

    public int lastIndexOf(Object o) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return 0;
    }

    public ListIterator<E> listIterator() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }

    public ListIterator<E> listIterator(int index) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }

    public boolean removeAll(Collection<?> c) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return false;
    }

    public boolean retainAll(Collection<?> c) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return false;
    }

    public E set(int index, E element) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }

    public Object[] toArray() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }

    public <T> T[] toArray(T[] a) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            err.printStackTrace();
       }
       return null;
    }
}