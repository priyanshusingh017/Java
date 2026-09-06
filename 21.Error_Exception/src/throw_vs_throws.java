class NegativeRadiusException extends Exception{

    public String toString(){
        return "Negative radius Exception";
    }

    public String  getMessage(){
        return "I am Negative radius Exception";
    }
}

public class throw_vs_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double area= Math.PI*r*r;
        return area;
    }
    public static int divide(int a,int b) throws ArithmeticException {
        int res=a/b;
        return res;
    }
    public static void main(String[] args) {

        try{
            int c = divide(1,0);
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }

        try {
            double area = area(-4);
            System.out.println(area);
        }
        catch (NegativeRadiusException e){
            System.out.println(e.toString());
        }
    }
}
