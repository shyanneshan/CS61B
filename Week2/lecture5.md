### Reading 2.3
Exercise 2.3.1  
addLast&getLast will be fast
removeLast will be slow because we still need to iterate the list to change to *last to the second last node.

1. doubly linked list(add a previous pointer)
2. circular approach

#### Generics
+ like templates
+ only work with reference types, put Interger/String instead of int/string
```
public class DLList<BleepBlorp> {
    private IntNode sentinel;
    private int size;

    public class IntNode {
        public IntNode prev;
        public BleepBlorp item;
        public IntNode next;
        ...
    }
    ...
}


DLList<String> d2 = new DLList<>("hello");
```


## hw
### C level
1. done
2. only by defining object arrays, e.g:
```
Object[][] obj = {{1,2,3,4,5,6},
                   {"hello","world"},
                   {2.5,3.5,6.5},
                  {1,"Programme",10.0}};
```

### B level
1. 
    + [1,3,4,3]
    + [1,2,4,10]
    + p:null; d:[1,2,4,10]