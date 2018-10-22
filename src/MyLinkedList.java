import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List <E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node<E> {
        private E element;
        private Node prev;
        private Node next;

        public Node() {
            element = null;
            prev = next = null;
        }

        /**
         * Adds a Node to the end of the LL
         */
        public Node(E e) {
            size++;
            element = e;
            // Node point = tail;
            // this.prev = tail;

        }
    }

    /**
     * Default constructor
     */
    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    /**
     * A method that adds an element to the end of the LinkedList and returns TRUE if addition is succesful
     * @param e An element of type E
     */
    public boolean add(E e) {
        return true;
    }

    /**
     * Adds e to position index of the LinkedList
     * @param index An index value
     * @param e An element of type E
     */
    public void add(int index, E e) {

    }
    
    /**
     * Clears the LinkedList.
     */
    public void clear() {
        head = tail = null;
    }

    /**
     * Removes the element at the specified position and returns the element
     */
    public E remove(int index) {
        Integer obj = new Integer(3);
        return null;
    }

    /**
     * A method that removes the first occurence of the specified element from the LL. Returns TRUE if successful
     */
    public boolean remove(Object o) {
        return true;
    }

    /**
     * Returns a string representation of this LL
     */
    public String toString() {
        return "";
    }

    /**
     * Returns size of the LL
     */
    public int size() {
        return size;
    }


    /////////////////////////////////////////////////
    // METHODS THAT WE ARE NOT IMPLEMENTING
    /////////////////////////////////////////////////
    public boolean addAll(Collection<? extends E> c) {
        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException err) {
            System.out.println(err);
        }
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException err) {
            System.out.println(err);
        }
        return false;
    }

    public boolean contains(Object o) {
       try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return false;
    }

    public boolean containsAll(Collection<?> c) {
       try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return false;
    }

    public boolean equals(Object o) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           System.out.println(err);
       }
       return false;
    }

    public E get(int index) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           System.out.println(err);
       }
       return null;
    }

    public int hashCode() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           System.out.println(err);
       }
       return 0;
    }

    public int indexOf(Object o) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           System.out.println(err);
       }
       return 0;
    }

    public boolean isEmpty() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
           System.out.println(err);
       }
       return false;
    }

    public Iterator<E> iterator() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }

    public int lastIndexOf(Object o) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return 0;
    }

    public ListIterator<E> listIterator() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }

    public ListIterator<E> listIterator(int index) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }

    public boolean removeAll(Collection<?> c) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return false;
    }

    public boolean retainAll(Collection<?> c) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return false;
    }

    public E set(int index, E element) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }

    public Object[] toArray() {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }

    public <T> T[] toArray(T[] a) {
        try {
           throw new UnsupportedOperationException();
       } catch (UnsupportedOperationException err) {
            System.out.println(err);
       }
       return null;
    }
}