/**
 * @author Shyanne Shan
 * @created 1/27/22/2022 - 2:37 PM
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
        if (size == 1) {
            TNode newNode = new TNode(sentinel, item, last);
            sentinel.next = newNode;
            last.prev = newNode;
        } else {
            TNode newNode = new TNode(last.prev, item, last);
            last.prev.next = newNode;
            last.prev = newNode;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printDeque(){
        TNode tNode = sentinel.next;
        for (int index = 0; index < size; index += 1){
            System.out.println(tNode.item);
            tNode = tNode.next;
        }
    }
}
