public class finally_block {
    public static void main(String[] args) {

        int a=7;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        try{
            System.out.println(5/3);
        }
        finally{
            System.out.println("yes this is finally");
        }
    }
}
