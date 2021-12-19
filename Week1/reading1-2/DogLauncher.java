

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(20);
        //dog.makeNoise();
        Dog d2 = new Dog(30);
        d1.bigger(d2).makeNoise();

    }
}