import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    private int size;
    private E[] dynamicArray;

    /**
     * Default constructor that instantiates an array of length 10.
     */
    public MyArrayList() {
        //Must create an array of Objects and must then be casted to type E
        dynamicArray = (E[]) new Object[10];
        size = 0;
    }

    /**
     * A method that returns the length of the ArrayList.
     */
    public int length() {
        return dynamicArray.length;
    }

    /**
     * A method that trims the ArrayList to its size.
     */
    public void trimToSize() {
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < size; i++)
            newArray[i] = dynamicArray[i];
        dynamicArray = newArray;
    }

    /**
     * A method that doubles the current ArrayList size.
     */
    public void doubleArraySize() {
        E[] newArray = (E[]) new Object[2*size];
        for (int i = 0; i < size; i++) 
            newArray[i] = dynamicArray[i];
        dynamicArray = newArray;
    }

    /**
     * A method that adds an element to the end of the AL.
     */
    public boolean add(E e) {
        //If arrayList is full
        if (size == dynamicArray.length)
            this.doubleArraySize();
        dynamicArray[size] = e;
        size++;
        return true;
    }

    /**
     * A method that adds an element to the specific index of the AL.
     */
    public void add(int index, E e) {
        //If the index is the first free space in the AL
        if (index == size)
            add(e);
        else if (index >= size) //If the index is bigger than current size
            System.out.println("Unable to add at index " + index + " since null elements will exist between the current size and the given index.");
        else { //If the index is within the size
            //Double the array size if your AL is full
            if (size == dynamicArray.length)
                doubleArraySize();
            shiftArrayRight(index, e);
            size++;
        }
    }

    /**
     * A method that shifts the array to make room for an element to be inserted.
     */
    public void shiftArrayRight(int index, E e){
        for (int i = (size - 1); i >= index; i--) {
            E temp = dynamicArray[i];
            dynamicArray[i + 1] = temp;
        }
        dynamicArray[index] = e;
    }

    /**
     * A method that shifts the array to the left once an element is removed.
     * @param index
     * @return
     */
    public E shiftArrayLeft(int index) {
        E toReturn = dynamicArray[index];
        for (int i = index; i < size - 1; i++) {
            E temp = dynamicArray[i + 1];
            dynamicArray[i] = temp;
        }
        return toReturn;
    }

    /**
     * A method that sets the whole AL to null and resets the size to 0.
     */
    public void clear() {
        for (int i = 0; i < size; i++)
            dynamicArray[i] = null;
        dynamicArray = (E[])new Object[10];
        size = 0;
    }

    /**
     * A method that removes an element at a specified index.
     */
    public E remove(int index) {
        if (index >= size) {
            System.out.println("Cannot remove the element since the index is invalid.");
            return null;
        }
        else {
            E elem = shiftArrayLeft(index);
            size--;
            return elem;
        }
    }

    /**
     * A method that removes an element if it is found.
     */
    public boolean remove (Object o) {
        E myObj = (E) o;
        int index = -1;
        for (int i = 0; i < size; i++){
            if (dynamicArray[i].equals(myObj)){
                index = i;
                break;
            }
        }
        if (index == -1) {
            // System.out.println("Cannot remove the element " + myObj  + " since the Object was not found.");
            return false;
        }
        remove(index);
        return true;
    }

    /**
     * A toString() method that displays the ArrayList.
     */
    public String toString() {
        if (size == 0)
            return "The ArrayList is empty.";
        else {
            String s = "MyArrayList:[ ";
            for (int i = 0; i < size; i++) {
                s += dynamicArray[i] + " ";
            }
            s += "]";
            return s;
        }
    }

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