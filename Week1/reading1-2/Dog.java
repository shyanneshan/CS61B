/**
 * @author Shan
 */
public class Dog {
    //non-static variables
    public int weight;

    /*
    static variables
    all dogs share one scientific name
    when access, should be Dog.binomen
     */
    public static String binomen = "canis";

    public Dog(int w){
        weight = w;
    }



    public void makeNoise() {
        if(weight < 10){
            System.out.println("yip yip yip!");
        }else if (weight < 30){
            System.out.println("Bark,bark");
        }else{
            System.out.println("Wooof!");
        }
    }

    /*
    better method
    static methods that compare two exist Dog
     */
    public static Dog bigger(Dog d1, Dog d2){
        if(d1.weight> d2.weight){
            d1.makeNoise();
            return d1;
        }
        d2.makeNoise();
        return d2;
    }

    /*
    non-static method that compare itself and another Dog
     */
    public Dog bigger(Dog d2){
        if(weight> d2.weight) {
            return this;
        } else {
            return d2;
        }
    }

}