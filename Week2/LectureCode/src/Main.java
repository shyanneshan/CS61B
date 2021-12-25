/**
 * @author Shyanne Shan
 * @created 12/20/21/12/2021 - 5:31 PM
 */
public class Main {
    public static void main(String[] args){
        int[] array = new int[]{12,2,3,4,5};
        SLList L = new SLList(array);

        L.printAll();
        System.out.println(L.size());
    }
}
