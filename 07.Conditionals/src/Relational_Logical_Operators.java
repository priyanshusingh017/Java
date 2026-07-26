public class Relational_Logical_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        // with if-else condition ->
        int ages = 20;

        if (ages >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible");
        }

        // Logical And -->
        int age = 25;
        boolean citizen = true;

        if (age >= 18 && citizen == true) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }

        // Logical OR -->


        boolean hasID = true;
        boolean hasPassport = false;
        if (hasID || hasPassport) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("Entry Denied");
        }

        // Logical NOT -->
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("Go Outside");
        } else {
            System.out.println("Stay Home");
        }


     /*
     Relational:
     >   greater
     <   smaller
     >=  greater/equal
     <=  smaller/equal
     ==  equal check
     !=  not equal

     Logical:
     &&  AND  → all conditions true
     ||  OR   → any one condition true
     !   NOT  → reverse answer

     */
    }
}
