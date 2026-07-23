class MyEmployee{
    private int id;
    private String name;
    private int age;

    // setter -->
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // getter -->
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class main {
    public static void main(String[] args) {
        MyEmployee myEmployee = new MyEmployee();
        myEmployee.setId(100);
        myEmployee.setName("Priyanshu");
        myEmployee.setAge(20);
        System.out.println("Id :- "+myEmployee.getId());
        System.out.println("Name :- "+myEmployee.getName());
        System.out.println("Age :- "+myEmployee.getAge());
    }
}
