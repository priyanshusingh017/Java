import java.util.Scanner;

class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}

public class practice_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and height: ");
        double radius = input.nextDouble();
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(radius, height);

        System.out.println("Area of the rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle is: " + rectangle.getPerimeter());

    }
}
