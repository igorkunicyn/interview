package lesson_2_1;

import java.util.Arrays;

public class MyArrayList<T extends Comparable<? super T>> {
    private Object[] array;
    private int size;
    private int capacity;
    private final static int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity can not be <=0 " + capacity);
        }
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.array = new Object[capacity];
    }

    public boolean add(T item) {
        ensureCapacity();
        array[size] = item;
        size++;
        return true;
    }

    public void add(int index, T item) {
        ensureCapacity();
        correctIndex(index);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = item;
        size++;
    }

    public Object remove(int index) {
        correctIndex(index);
        Object temp = array[index];
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        array[size] = null;
        return temp;
    }

    public boolean remove(T item) {
        int i = indexOf(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int index) {
        correctIndex(index);
        return array[index];
    }

    public void set(int index, T item) {
        correctIndex(index);
        array[index] = item;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append(", ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }

        sb.append(" ]");
        return sb.toString();
    }

    public void ensureCapacity(){
        if (size >= (int)(capacity*0.75)){
            capacity = (capacity*3)/2 + 1;
            array = Arrays.copyOf(array,capacity);
        }
    }

    public void trimToSize() {
        if (size < capacity) {
            capacity = size;
            array = Arrays.copyOf(array, capacity);
        }
    }

    public void correctIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("This index is not correct "+ index);
        }
    }
    private boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (less((T) array[j], (T) array[i])) {
                    swap(i, j);
                }
            }
        }
    }


}
