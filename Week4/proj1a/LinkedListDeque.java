/**
 * @author Shyanne Shan
 */
public class LinkedListDeque<T> {
    private static int size;
    private TNode sentinel;
    private TNode last;

    public LinkedListDeque() {
        size = 0;
        sentinel = new TNode(null, null, null);
        last = new TNode(null, null, null);
    }

    public class TNode {
        private TNode prev;
        private T item;
        private TNode next;

        public TNode(TNode pre, T it, TNode nex) {
            item = it;
            prev = pre;
            next = nex;
        }
    }

    public void addFirst(T item) {

        size = size + 1;
        if (size == 1) {
            TNode newNode = new TNode(sentinel, item, last);
            sentinel.next = newNode;
            last.prev = newNode;
        } else {
            TNode newNode = new TNode(sentinel, item, sentinel.next);
            sentinel.next.prev = newNode;
            sentinel.next = newNode;

        }
    }

    public void addLast(T item) {
        size = size + 1;
        TNode newNode;
        if (size == 1) {
            newNode = new TNode(sentinel, item, last);
            sentinel.next = newNode;
        } else {
            newNode = new TNode(last.prev, item, last);
            last.prev.next = newNode;
        }
        last.prev = newNode;
    }

    public T getFirst(){
        return sentinel.next.item;
    }
    public T getLast(){
        return last.prev.item;
    }
    public T removeFirst(){
        T result = sentinel.next.item;

        if (size == 0){
            return null;
        }else if (size ==1){
            size = 0;
            sentinel = new TNode(null, null, null);
            last = new TNode(null, null, null);
        } else {
            sentinel.next.next.prev = sentinel;
            sentinel.next = sentinel.next.next;
        }

        size -= 1;
        return result;
    }

    public T removeLast(){
        T result = last.prev.item;

        if (size == 0){
            return null;
        }else if (size == 1){
            size = 0;
            sentinel = new TNode(null, null, null);
            last = new TNode(null, null, null);
        } else {
            last.prev.prev.next = last;
            last.prev = last.prev.prev;
        }

        size -= 1;
        return result;
    }

    /** iteration **/
    public T get(int index){
        TNode p = sentinel.next;
        for (int i = 0; i < index && p != null; i += 1){
            p = p.next;
        }
        if (p != null){
            return p.item;
        } else {
            return null;
        }
    }



    public T getRecursive(int index){
        return getRecursive(index, sentinel.next);
    }

    private T getRecursive(int index, TNode tNode){
        if (index < 0){
            return null;
        }else if (index == 0){
            return tNode.item;
        }
        return getRecursive(index - 1, tNode.next);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printDeque(){
        TNode tNode = sentinel.next;
        for (int index = 0; index < size; index += 1){
            System.out.println(tNode.item);
            tNode = tNode.next;
        }
    }
}
