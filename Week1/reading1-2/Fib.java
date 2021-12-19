/**
 * @author Shyanne Shan
 * @created 12/19/21/12/2021 - 10:29 PM
 */
public class Fib {
    public static void main(String[] args){
        System.out.println(Fib(2, 0, 0, 1));
    }

    /*
    k increases till k == n
     */
    public static int Fib(int n, int k, int f0, int f1){
        if (n == k) {
            return f0;
        }else{
            return Fib(n, k+1, f1, f0+f1);
        }

    }
}
