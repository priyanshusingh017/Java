import java.util.*;

class Product {

    private int id;
    private String name;
    private double price;
    private String category;

    // parametrized constructor
    public Product(int id, String name, double price, String category) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
}

public class main1 {
    public static double findAverageOfPrice(Product[] arr , String Category){
        double total = 0 ; int count = 0;
        for(Product p : arr){
            if(p.getCategory().equals(Category)){
                total = total + p.getPrice();
                count++;
            }
        }

        return count == 0 ? 0.00 : total/count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];
        for(int i=0;i<n;i++){
            String[] data = sc.nextLine().trim().split(" ");

            products[i] = new Product(Integer.parseInt(data[0]) , data[1],Double.parseDouble(data[2]) , data[3]);
        }

        String searchCategory = sc.nextLine();

        double avg = findAverageOfPrice(products, searchCategory);
        System.out.printf("%.2f" , avg);

    }

}
