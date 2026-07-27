// Q1 -->
class circle{
    private double radius;

    circle(double r){
        this.radius=r;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}

class Cylinder extends circle{
    private double height;

    Cylinder(double r , double h){
        super(r);
        this.height=h;
    }

    public double volume(){
        return super.area()*height;
    }
}
// Q2 -->
class Rectangle{
    private double length;
    private double width;
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }

    public double area(){
        return length*width;
    }
}

class cuboid extends Rectangle{
    private double height;
    cuboid(double l,double w , double h){
        super(l,w);
        this.height=h;
    }

    public double volume(){
        return super.area()*height;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder(10.0,1.0);
        System.out.println(cylinder.area());
        System.out.println(cylinder.volume());

        cuboid c = new cuboid(5,4,2);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
