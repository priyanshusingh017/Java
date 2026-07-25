import java.util.Scanner;

class Cylinder{
    private double radius;
    private double height;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getHeight(){
        return this.height;
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

}

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height: " );
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);

        double area = cylinder.calculateSurfaceArea();

        System.out.println("Area :- " + area);

        double volume = cylinder.calculateVolume();
        System.out.println("Volume :- " + volume );
    }
}
