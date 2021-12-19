### Terminology
+ Class methods, a.k.a. static methods.
+ Instance methods, a.k.a. non-static methods.


### Exercise 1.2.1
```
wrong code?? this does not refer to anything 
public static Dog maxDog(Dog d1, Dog d2) {
    if (weightInPounds > d2.weightInPounds) {
        return this;
    }
    return d2;
}
```

### Exercise 1.2.2
```
public class DogLoop {
       public static void main(String[] args) {
      		Dog smallDog = new Dog(5);
      		Dog mediumDog = new Dog(25);
      		Dog hugeDog = new Dog(150);
    
      		Dog[] manyDogs = new Dog[4];  
            manyDogs[0] = smallDog;
      		manyDogs[1] = hugeDog;    	   
            manyDogs[2] = new Dog(130);
    
      		int i = 0;
      		while (i < manyDogs.length) {
          		Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
          		i = i + 1;
           }
       }
   }
   
```
compare every dog in the array to a 25-pound dog
0 5-pound V.S. 25-pound output:*bark*
1 150-pound V.S. 25-pound output:*woof*
2 130-pound V.S. 25-pound output:*woof*
3 Empty-Object V.S. 25-pound output: *error null-pointer*

