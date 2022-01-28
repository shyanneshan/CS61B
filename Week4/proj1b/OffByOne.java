/**
 * @author Shyanne Shan
 * @created 1/28/22/2022 - 5:45 PM
 */
public class OffByOne implements CharacterComparator {

    @Override
    public boolean equalChars(char x, char y) {
        return x - y == 1 || x - y == -1;
    }
}
