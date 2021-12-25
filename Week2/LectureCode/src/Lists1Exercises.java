public class Lists1Exercises {
    public static class IntList {
        public int first;
        public IntList rest;

        public IntList(int f, IntList r) {
            first = f;
            rest = r;
        }

        /** Return the size of the list using... recursion! */
        public int size() {
            if (rest == null) {
                return 1;
            }
            return 1 + this.rest.size();
        }

        /** Return the size of the list using no recursion! */
        public int iterativeSize() {
            IntList p = this;
            int len = 0;
            while(p!=null){
                len = len + 1;
                p = p.rest;
            }
            return len;	}

        /** Returns the ith value in this list.*/
        public int get(int i) {
            if (i == 0){
                return first;
            }
            else{
                return rest.get(i-1);
            }
        }

    }
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList p = L;
        IntList cur = new IntList(L.first+x, null);
        IntList res = cur;
        while(p.rest!=null){
            cur.rest = new IntList(p.rest.first+x, null);
            cur = cur.rest;
            p = p.rest;
        }
        return res;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        IntList p = L;
        while(p!=null){
            p.first += 3;
            p = p.rest;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
         System.out.println(L.get(0));
//         System.out.println(incrList(L, 3).get(0));
//         System.out.println(incrList(L, 3).get(1));
//         System.out.println(incrList(L, 3).get(2));
         System.out.println(dincrList(L, 3));
    }
}