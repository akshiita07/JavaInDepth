package Day8;

public class TernaryOperators {
    public static int findMin(int x, int y){
        int ans=(x<y)?x:y;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Min is= "+ findMin(3,5));
    }
}
