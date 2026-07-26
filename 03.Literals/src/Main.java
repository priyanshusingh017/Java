public class Main {
  public static void main(String[] args){

    // 1. Integer Literals
    int decimal = 25;
    int binary = 0b11001;
    int octal = 031;
    int hexadecimal = 0x19;

    // 2. Floating-Point Literals
    float pi = 3.14f;
    double price = 99.99;
    double scientific = 1.5e3;

    // 3. Character Literals
    char grade = 'A';
    char symbol = '$';
    char unicode = '\u2665';

    // 4. String Literals
    String name = "Priyanshu";
    String city = "Chennai";

    // 5. Boolean Literals
    boolean isJavaFun = true;
    boolean isLoggedIn = false;

    // 6. Null Literal
    String address = null;

    // Display Output
    System.out.println("===== Integer Literals =====");
    System.out.println("Decimal: " + decimal);
    System.out.println("Binary: " + binary);
    System.out.println("Octal: " + octal);
    System.out.println("Hexadecimal: " + hexadecimal);

    System.out.println("\n===== Floating-Point Literals =====");
    System.out.println("Float: " + pi);
    System.out.println("Double: " + price);
    System.out.println("Scientific Notation: " + scientific);

    System.out.println("\n===== Character Literals =====");
    System.out.println("Grade: " + grade);
    System.out.println("Symbol: " + symbol);
    System.out.println("Unicode: " + unicode);

    System.out.println("\n===== String Literals =====");
    System.out.println("Name: " + name);
    System.out.println("City: " + city);

    System.out.println("\n===== Boolean Literals =====");
    System.out.println("Is Java Fun? " + isJavaFun);
    System.out.println("Is Logged In? " + isLoggedIn);

    System.out.println("\n===== Null Literal =====");
    System.out.println("Address: " + address);

    System.out.println("\n===== Escape Sequences =====");
    System.out.println("Hello\nJava");
    System.out.println("Name\tAge");
    System.out.println("He said, \"Welcome to Java!\"");
    System.out.println("Path: C:\\Java");
  }
}