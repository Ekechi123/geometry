package geometry;

/**
 * Custom LinkedList class for storing 2D and 3D geometry shapes.
 * Provides basic functionalities to add, remove, retrieve, and search shapes.
 */
public class LinkedList<T> {
    private java.util.LinkedList<T> list;

    /**
     * Constructor to initialize the LinkedList.
     */
    public LinkedList() {
        list = new java.util.LinkedList<>();
    }

    /**
     * Adds an item to the list.
     * 
     * @param item The item to be added.
     */
    public void add(T item) {
        list.add(item);
    }

    /**
     * Removes an item from the list.
     * 
     * @param item The item to be removed.
     */
    public void remove(T item) {
        if (list.contains(item)) {
            list.remove(item);
            System.out.println(item + " has been removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    /**
     * Retrieves an item by its index.
     * 
     * @param index The index of the item.
     * @return The item at the specified index.
     */
    public T get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            return null;  // Return null if the index is out of bounds.
        }
    }

    /**
     * Finds an item in the list based on a condition.
     * 
     * @param condition The condition to find the item.
     * @return The item that matches the condition, or null if not found.
     */
    public T find(java.util.function.Predicate<T> condition) {
        for (T item : list) {
            if (condition.test(item)) {
                return item;  // Return the first matching item.
            }
        }
        return null;  // Return null if no item matches.
    }

    /**
     * Prints all items in the list.
     */
    public void print() {
        if (list.isEmpty()) {
            System.out.println("No shapes stored.");
        } else {
            for (T item : list) {
                System.out.println(item);
            }
        }
    }

    /**
     * Gets the size of the list.
     * 
     * @return The number of items in the list.
     */
    public int size() {
        return list.size();
    }
}
