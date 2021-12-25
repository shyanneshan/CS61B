/**
 * @author Shyanne Shan
 * @created 12/20/21/12/2021 - 5:31 PM
 */
public class List {
    public int first;
    public List rest;

    public List(int f, List r) {
        first = f;
        rest = r;
    }

    public void addFirst(int x){
        int tmp = first;
        this.first = x;
        this.rest = new List(tmp, rest);

    }
    public int size(){
        if (rest == null){
            return 1;
        }else {
            return 1 + rest.size();
        }

    }
    public int itSize(){
        List p = this;
        int len = 0;
        while(p!=null){
            len = len + 1;
            p = p.rest;
        }
        return len;
    }

    public int get(int i){
        if (i == 0){
            return first;
        }
        return rest.get(i - 1);


    }


}