package loops.breakAndContinue;

public class breakInWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
            if (i == 3) break;
        }
    }
}
