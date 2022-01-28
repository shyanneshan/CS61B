/**
 * @author Shyanne Shan
 * @created 1/27/22/2022 - 2:38 PM
 */
public class ArrayDeque<T> {
    private int size;
    private T[] arrays;
    private int nextFirst = 0;
    private int nextLast = 1;


    public ArrayDeque(){
        size = 0;
        arrays = (T[]) new Object[8];
        nextFirst = 3;
        nextLast = 4;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(T item){
        arrays[nextFirst] = item;
        nextFirst -= 1;
    }

    public void addLast(T item){
        arrays[nextLast] = item;
        nextLast += 1;
    }


}
