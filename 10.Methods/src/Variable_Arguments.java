public class Variable_Arguments {
    /*
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    // Variable Arguments (Varargs) - allow a method to accept zero or more arguments of the same type.

    returnType methodName(dataType... variableName){
            // code
        }
     */
    static int sum(int... numbers){

        int sum = 0;

        for(int num : numbers){
            sum += num;
        }

        return sum;
    }
    // Normal parameters must come before the varargs parameter.
    static void student(String name, int... marks){

        System.out.println("Name: " + name);

        for(int mark : marks){
            System.out.println(mark);
        }

    }

    public static void main(String[] args){

        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

        student("Priyanshu",90,85,80);

    }
}
