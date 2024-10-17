package loops.breakAndContinue;

public class ContinueInWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) continue;
            System.out.println(i);
            i++;
        }
    }
}
