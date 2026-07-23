public class break_and_continue {
    public static void main(String[] args) {

        System.out.println("Example of break --> ");
        // break -->
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("Example of continue --> ");
        // continue -->
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        /*
               break
                 ↓
           "Bas karo loop"
           (stop everything)

             continue
                ↓
          "Is round ko chhod do"
            (skip current round)
         */
    }
}
