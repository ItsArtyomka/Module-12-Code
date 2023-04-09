package ToDoList;

import java.util.Arrays;

public class DynamicArray {
    // Variables
    private int size;
    private Object[] data;
    private static final int DEFAULT_CAPACITY = 5;

    // Constructors
    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int initialCapacity) {
        data = new Object[initialCapacity];
        size = 0;
    }

    public void add(Object value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }

    public Object get(int index){
        return data[index];
    }

    private Object[] grow(Object[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length + 1);
    }

    @Override
    public String toString() {
        return "DynamicArray { " +
                "data = " + Arrays.toString(data) + "}";
    }
}
