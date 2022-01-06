/**
 * @author Shyanne Shan
 * @created 12/24/21/12/2021 - 7:59 PM
 */
public class SLList {

    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList(){
         sentinel = new IntNode(63,null);
         size = 0;

    }
    public SLList(int x){
        sentinel = new IntNode(63,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList(int[] array){
        sentinel = new IntNode(63, null);
        for(int x:array){
            addLast(x);
        }
    }

    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public void addLast(int x){
        IntNode p = sentinel;

        while(p.next!=null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;


    }

    public void deleteFirst(){

        sentinel.next = sentinel.next.next;
        size -= 1;
    }

    /* a helper method that returns the size of the list starts at p
    private static int size(IntNode p){
        if(p.next == null){
            return 1;
        }else{
            return 1 + size(p.next);
        }
    }*/
    public int size(){

        return size;
        /* a recursive one will use the static method above
        return size(first);*/

        /* a iterative one
        int res = 1;
        IntNode next = first.next;
        while(next!=null){
            res +=1;
            next = next.next;
        }
        return res;*/
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public void printAll(){
        IntNode next = sentinel.next;
        while(next!=null){
            System.out.println(next.item);
            next = next.next;
        }
    }

    public void insert(int x, int position){
        // my solution

        IntNode cur = sentinel;
        IntNode next = cur.next;
        int count = 0;
        if(cur == null){
            addFirst(x);
            return;
        }

        while(count < position){
            if (next == null){
                cur.next = new IntNode(x, null);break;
            }
            count += 1;
            cur = cur.next;
            next = next.next;
        }
        cur.next = new IntNode(x, next);
        size += 1;

        // standard solution
        if (sentinel.next == null || position == 0){
            addFirst(x);
        }
        IntNode current = sentinel.next;
        while(position > 1 && current.next!=null){
            position--;
            current = current.next;
        }
        current.next = new IntNode(x, current.next);

    }
    // no use new
    public void reverseIterative(){
        if (sentinel.next == null || sentinel.next.next == null){
            return;
        }

        IntNode cur = sentinel.next;
        for(int index = 1; index < size; index += 1){
            int steps = size - index;
            deleteFirst();
            insert(cur.item, steps);
            cur = sentinel.next;
        }
    }

    // recursively remove item
    public void removeItem(int x){
        removeItemHelper(x, sentinel);
    }

    private IntNode removeItemHelper(int x, IntNode current){
        // my solution
        if(current == null) {
            return null;
        }
        IntNode realCur = current.next;
        if (realCur.item == x){
            current.next = realCur.next;
            size = size - 1;
        }
        return removeItemHelper(x, current.next);

        /* standard solution
        if(current == null) {
            return null;
        }else if (current.item == x){
            return removeItemHelper(x, current.next);
        }else{
            current.next = removeItemHelper(x,current.next);
            return current;
        }
        */
    }
}
