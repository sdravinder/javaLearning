package loops.breakAndContinue;

public class ContinueInForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 2 || i == 8 || i >= 15) continue;
            System.out.println("Gave toffee to " + i);
        }
    }
}

