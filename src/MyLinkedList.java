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

        /**
         *  Parameterized constructor that creates a Node with a non-empty element, has null prev and next
         */
        public Node(E e) {
            element = e;
            size++;
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
        boolean flag = false;
        Node myNode = new Node(e);

        //If list is empty
        if (head == null) {
            head = tail = myNode;
            flag = true;
        } else { //if list is not empty
            tail.next = myNode;
            myNode.prev = tail;
            tail = myNode;
            flag = true;
        }
        return flag;
    }

    /**
     * Adds e to position index of the LinkedList
     * @param index An index value
     * @param e An element of type E
     */
    public void add(int index, E e) {
        if (index >= size) //if index does not exist
            System.out.println("Invalid index. Cannot add Node to an index that does not exist.");
        else { //if index is valid
            Node current = head;
            int listIndex = 0;
            while (current != null) { //find the index you want to be at
                if (listIndex == index)
                    break;
                current = current.next;
                listIndex++;
            }
            Node newNode = new Node(e);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev = newNode;
            if (index != 0) //if you're not adding the Element to be the new head
                current.prev.prev.next = newNode;
            if (index == 0) //if at index 0, you want it to be at head
                head = newNode;
            current = null;
            }
    }
    
    /**
     * Clears the LinkedList.
     */
    public void clear() {
        head = tail = null;
        size = 0;
    }

    /**
     * Removes the element at the specified position and returns the element
     */
    public E remove(int index) {
        if (head == null) { //if list is empty 
            System.out.println("Cannot remove at index " + index + " since the LinkedList is empty.");
            return null;
        }
        else if (index >= size) {
           System.out.println("Invalid index.");
           return null; 
        }
        else { //if list is not empty
            if (size == 1 && index == 0) { //if there is only one element in the LinkedList and you want to delete it
                Node curr = head;
                this.clear();
                return (E) curr.element;
            }
            else if (index == 0) {//if you want to get rid of the first element
                Node curr = head;
                head = head.next;
                curr.next.prev = null; 
                curr.next = null;
                size--;
                return (E) curr.element;
            }
            else if (index == (size - 1)) {//if you want to get rid of tail
                Node curr = tail;
                tail = tail.prev;
                curr.prev.next = null;
                curr.prev = null;
                size--;
                return (E) curr.element;
            }
            else { //if the element to be removed is in the middle
                Node current = head;
                int listIndex = 0;
                while (current != null) { //find the index you want to be at
                    if (listIndex == index)
                        break;
                    current = current.next;
                    listIndex++;
                }
                //When you get here, current should be at the proper index
                current.prev.next = current.next;
                current.prev.next.prev =  current.prev;
                size--;
                return (E) current.element;
            }
        }
    }

    /**
     * A method that removes the first occurence of the specified element from the LL. Returns TRUE if successful
     */
    public boolean remove(Object o) {
        // E obj = (E) o;
        if (head == null) {
            System.out.println("Cannot remove the element since the LinkedList is empty.");
            return false;
        }
        else {
            Node current = head;
            int index = 0;
            while (current.next != null && !current.element.equals(o)) {
                current = current.next;
                index++;
            }
            //When you get here, either current has iterated through the LL and did not find the element (current == null)
            //OR current has iterated through the LL and found the element
            if (current == null)
                return false;
            else {
                this.remove(index);
                return true;
            }
        }
    }

    /**
     * Returns a string representation of this LL
     */
    public String toString() {
        if (head == null)
            return "This LinkedList is empty."; 
        else {
            return "This LinkedList is of size " + size + ". The head is LinkedList[0]: " + head.element + ", and the tail is LinkedList[" + (size-1) + "]: " + tail.element;
        }
    }

    /**
     * Returns size of the LL
     */
    public int size() {
        return size;
    }

    /**
     * Displays the LinkedList
     */
    public void displayList() {
        if (head != null) {
            System.out.println("Now showing displayList()...");
            Node current = head;
            int i = 0;
            while (current != null) {
                System.out.println("LinkedList[" + i + "]: " + current.element);
                current = current.next;
                i++;
            }
        }
        else {
            System.out.println("Cannot display LinkedList since the list is empty.");
        }
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