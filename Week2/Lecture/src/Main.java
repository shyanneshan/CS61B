/**
 * @author Shyanne Shan
 * @created 12/20/21/12/2021 - 5:31 PM
 */
public class Main {
    public static void main(String[] args){
        List L = new List(5, null);
        L.rest = new List(10, null);
        L.rest.rest = new List(15, null);
        System.out.println(L.get(2));
    }
}
