### primitive type
byte, short, int, long, float, double, boolean, char  

声明时分配内存，不设默认值，无法知道变量地址 *与C不同*
*analogy* heartbeat


### reference type
+ Reference Variable Declaration
    1. allocate 64bits
    2. the bits are set to 
        + NULL (all zeros)
            ``` 
                Walrus someWalrus;
                someWarus = null;
            ```
        + address of a specific instace of that class(returned by new)
            ``` 
                Walrus someWalrus; // creat a box of 64bits
                someWarus = new Warus(1,2);
            ```
            **walrus instance:96bits; address:64bits**


+ object instantiation
    1. allocate bits, fill with default value
    2. construcor fill other value

### pass parameter


## hw
### C level
1. done
2. If doubles are more versatile than ints, why don’t we always use them? Are there any disadvantages to doing this?
doubles take up more memory  
double:64bits  
int:32bits  
3. How much does the memory cost differ between the storing of an address of a 32 entry int array and a 300 entry int array?
no difference

### B level
1. Rewrite the size, iterativeSize, and get
```
public class IntList {
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
   
   	public static void main(String[] args) {
   		IntList L = new IntList(15, null);
   		L = new IntList(10, L);
   		L = new IntList(5, L);
   
         System.out.println(L.get(2));
   	}
   } 
```

2. 


