/**
 * @author Shyanne Shan
 * @created 1/28/22/2022 - 6:17 PM
 */
public class OffByN implements CharacterComparator{
    private int N;
    public OffByN(int n){
        N = n;
    }

    @Override
    public boolean equalChars(char x, char y){
        return x - y == N || y - x == N;
    }
}
