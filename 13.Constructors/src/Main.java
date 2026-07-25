import java.util.Scanner;

class Myemployee{
    private int id;
    private String name;
    private double salary;

    // parameterized constructor
    public Myemployee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getter -->
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of input taken - ");
        int n  = sc.nextInt();

        Myemployee[] emp = new Myemployee[n];

        for(int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Myemployee(id, name, salary);
        }

        for(int i=0;i<n;i++){
            System.out.println(emp[i].getId());
            System.out.println(emp[i].getName());
            System.out.println(emp[i].getSalary());
        }
    }
}
