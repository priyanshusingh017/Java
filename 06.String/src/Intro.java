import java.sql.SQLOutput;

public class Intro {

    public static void main(String[]args){

        String name="Priyanshu";
        // String is immutable and can't be changed.
        System.out.printf("The value of name is %s",name + "\n");
        // -> %d => for int ; %f => float ; %c => char ; %s => String
        int a = 6;
        float b = 6.54f;
        System.out.printf("The value of a is %d and b is %5.2f",a,b);
        // 5.2f means with space and number include its print 2 space and 3 number and after decimal (.) upto 2 places.
    }
}
