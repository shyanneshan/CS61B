/**
 * @author Shyanne Shan
 * @created 12/26/21/2021 - 8:03 PM
 */
public class AList {

    public static void main(String[] args) {
        Deck dingie = new Deck();
        dingie.cards[3] = 3;
        Deck pilates = new Deck();
        pilates.cards[1] = 2;
        int[] newArrWhoDis = {2, 2, 4, 1, 3};
        dingie.cards = pilates.cards;
        pilates.cards = newArrWhoDis;
        newArrWhoDis = null;
    }
}
