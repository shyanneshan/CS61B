/**
 * @author Shyanne Shan
 * @created 12/19/21/12/2021 - 9:21 PM
 */
public class ArgsDemo {
    public static void main(String[] args){
        int N = args.length;
        int i = 0;
        int sum = 0;
        while(i < N){
            sum = sum + Integer.parseInt(args[i]);
            i = i + 1;
        }
        System.out.println(sum);
    }
}
