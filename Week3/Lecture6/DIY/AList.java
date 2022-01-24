//import sun.jvm.hotspot.utilities.IntArray;

/** Array based list.
 *  @author Josh Hug
 */
// make this generic
public class AList<Item> {
    public static int size;
    public Item[] arrays;
    /** Creates an empty list. */
    public AList() {
        size = 0;
        // cant new generic arrays. (Item[]) is a kind of cast
        arrays = (Item[]) new Object[100];
    }

    private void resize(int capacity){
        Item[] a = (Item[]) new Object[size * 2];
        System.arraycopy(arrays, 0, a, 0, size);
        arrays = a;

    }
    /** Inserts X into the back of the list. */
    public void addLast(Item x) {

        //resize
        if (arrays.length == size){
            resize(size+1);
        }
        arrays[size] = x;
        size = size + 1;

    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return arrays[size-1];

    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {

        return arrays[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        arrays[size-1] = null; //unnecessary
        size -= 1;
        return 0;
    }
} 