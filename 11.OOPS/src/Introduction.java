class employee{
    int id;
    String name;
    int salary;

    public void printDetail(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }

    public int getSalary(){
        return salary;
    }
}
// ** in one java only one public class **
public class Introduction {
    public static void main(String[] args) {
        employee emp = new employee();
        employee jhon = new employee();

        emp.id = 12;
        emp.name="Priyanshu";
        emp.printDetail();

        jhon.id=13;
        jhon.name="Jhon";
        jhon.salary=12000;
        jhon.printDetail();
        System.out.println("salary:"+jhon.getSalary());
//        System.out.println("My id is :"+emp.id);
//        System.out.println("My name is : "+emp.name);
    }
}
