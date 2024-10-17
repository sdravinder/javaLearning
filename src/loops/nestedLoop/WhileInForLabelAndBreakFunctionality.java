package loops.nestedLoop;

public class WhileInForLabelAndBreakFunctionality {
    public static void main(String[] args) {
        outerLoop:
        for(int i = 0; i < 10; i++){
            int j = 0;
            while(j <= 5){
                if(j == 3) break outerLoop;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
