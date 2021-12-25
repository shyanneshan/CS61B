## Lecture 4
### improvement 3
private: restrict access

term: access control
a soft restriction in compiler

if declared as public, should exist forever

### improvement 4 Nested Classes and Overload
```
/** Returns the size of the list starting at IntNode p. */
private static int size(IntNode p) {
    if (p.next == null) {
        return 1;
    }

    return 1 + size(p.next);
}
```
in middleman SLList, there's no *rest*, we cannot recursively fix out the size directly. Instead, we creat a helper method that takes first(IntNode) as parameter which will recursively calculate the size.  

+ create a **private** helper method that interacts with the underlying naked recursive data structure

+ non-static inside the IntNode class itself **not recommended** 
+ static outside IntNode 

SLList  
-- IntNode  
  
SLList is what users use  
IntNode is what SLList use as a basic data stucture  

## hw
### C level
2. Reexplain what the sentinel node is and why it’s important. Ask yourself if your code would error if you removed the sentinel. Is the sentinel a necessary component of your IntList?  
like a header, standing at first of each list  
importance: avoiding exceptions
necessity: I don't quite get it right now;

3.What is the downside of not having a size variable and rather just calculate the size each time?
the time complexity is extremely high

### B level
1. in SLList.java new constructor with input:array
2. If the sentinel node was a null node, would it change anything or would the Intlist be able to function?
no, it doesn't matter

### A level
1. 
```
public class IntList {
   
    public int first;
   public IntList rest;
   public IntList(int f, IntList r){
      first = f;
      rest = r;
   }
   
   public void addAdjacent(){
      IntList p = this;
      IntList cur = this;
      while(cur.rest != null){
         
      if (cur.first == cur.rest.first){
         cur.first = cur.first*2;
         cur.rest = cur.rest.rest;
         cur = p;
         continue;
       }
         cur = cur.rest;
      }
      
   }

    public static void main(String[] args) {
       IntList intList = new IntList(3,null);
       intList = new IntList(2,intList);
       intList = new IntList(1,intList);
       intList = new IntList(1,intList);
       intList.addAdjacent();
    }
}
```

2. write a helper method to return the last node of the list
```

public class IntList {
   
    public int first;
   public IntList rest;
   public IntList(int f, IntList r){
      first = f;
      rest = r;
   }
   
   public void addAdjacent(){
      IntList p = this;
      IntList cur = this;
      while(cur.rest != null){
         
      if (cur.first == cur.rest.first){
         cur.first = cur.first*2;
         cur.rest = cur.rest.rest;
         cur = p;
         continue;
       }
         cur = cur.rest;
      }
      
   }
   public IntList last(){
      IntList p = this;
      IntList cur = this;
      while(cur.rest!=null){
         cur = cur.rest;
      }
      return cur;
   }
   public void addSquare(int x){
      IntList p = this;
      IntList cur = this;
      
      
      
      while(cur!=null){
         IntList tmp = cur.rest;
         cur.rest= new IntList(cur.first*cur.first,tmp);
         cur = cur.rest.rest;
      }
      last().rest = new IntList(x, null);
   }

    public static void main(String[] args) {
       IntList intList = new IntList(3,null);
       intList = new IntList(2,intList);
       intList = new IntList(1,intList);
       intList = new IntList(1,intList);
       intList.addSquare(5);
    }
}
```