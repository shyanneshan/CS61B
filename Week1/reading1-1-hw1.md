## [Static Typing ](https://joshhug.gitbooks.io/hug61b/content/chap1/chap11.html)
变量有不可改变的类型  
Java compiler performs a static type check at first before the program runs.

static typed language: JAVA   
dynamically typed language: Python


## declaring functions
``` public static```


## HW1
```
/* Drawing a Triangle*/
public class Zeno {
    public static void main(String[] args) {
        String a = "*";
        int i = 1;
        while(i < 6){
           int j = i;
           while(j > 0){
             System.out.print(a);
              j = j - 1;
           }
           System.out.println();
           i = i + 1;
 
    }
    }
}
```

### Exercise 1
```
public class Zeno {
   public static void drawTriangle(int N){
      String a = "*";
      int row = N;
      int curRow = 1;
      while (curRow < row){
         int col = curRow;
         while (col > 0){
            System.out.print(a);
            col = col - 1;
         }
         System.out.println();
         curRow = curRow + 1;

      }
      
   }
   
    public static void main(String[] args) {
       int N = 10;
       drawTriangle(N);
          
    }
}
```

### Exercise 2
```
public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
       int len = m.length;
       int max = m[0];
       int curNode = 1;
       while(len>curNode+1){
          if(m[curNode] > max){
             max = m[curNode];
          }
          curNode = curNode + 1;
       }
       return  max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.print(max(numbers));
    }
}
```


### Exercise 3
```
public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
       int max = m[0];
       for(int len = m.length,curNode = 1;
           len>curNode+1;
           curNode+=1){
          if(m[curNode] > max){
             max = m[curNode];
          }
       }
       return  max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.print(max(numbers));
    }
}
```

### Exercise 4
```


public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
     int length = a.length;
     for (int curNode = 0; curNode < length; curNode+=1){
        
        int sum = 0;
        
        if (a[curNode] > 0){
           for (int curN = curNode + 1; 
                curN <= curNode + n && curN < length;
                curN += 1){
              a[curNode] += a[curN];

           }
        }
        
     }
     
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
```
