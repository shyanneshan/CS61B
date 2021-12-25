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

}
