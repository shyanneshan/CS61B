import java.util.Arrays;

/**
 * @author Shyanne Shan
 * @created 12/20/21/12/2021 - 5:31 PM
 */
public class Main {
    public static void main(String[] args){
//        int[] array = new int[]{1,2};
//        SLList L = new SLList(array);
//
//        L.printAll();
//        L.reverseIterative();
//        L.printAll();
//        System.out.println(L.size());
        int[] array = new int[]{3,4,1};
        int[] newArr = replicate(array);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] insert(int[] arr, int item, int position){
        if(position >= arr.length){
            int[] a = new int[arr.length + 1];
            System.arraycopy(arr, 0, a, 0, arr.length);
            a[arr.length] = item;
            return a;
        }else{
            int[] a = new int[arr.length + 1];
            System.arraycopy(arr, 0, a, 0, position);
            a[position] = item;
            System.arraycopy(arr, position, a, position + 1, arr.length - position);
            return a;
        }

    }
    public static int[] replicate(int[] arr){
        int position = 0;
        for ( int index = 0; index < arr.length; index += 1){
            for ( int innerIndex = 1; innerIndex < arr[index]; innerIndex += 1){
                arr = insert(arr, arr[index], position);
                index += 1;
            }

            position = position + arr[index];

        }
        return arr;

        /* standard solution
        int total = 0;
        for (int item:arr) total += item;
        int[] result = new int[total];
        */
    }

}
