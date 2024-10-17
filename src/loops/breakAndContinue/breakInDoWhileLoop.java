package loops.breakAndContinue;

public class breakInDoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
            if (i == 3) break;
        } while (i <= 5);
    }
}
