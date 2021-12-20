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
    public int size(){
        if (rest == null){
            return 1;
        }else {
            return 1 + rest.size();
        }

    }
    public int itSize(){
        int len = 1;
        while(rest!=null){
            len = len + 1;
            rest = rest.rest;
        }
        return len;
    }

    public int get(int i){

        for(int index = 1; rest!=null; index +=1){
            if(index == i ){
                return first;
            }
            else{
                first = rest.first;
                rest = rest.rest;
            }
        }
        return -1;
    }


}