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


