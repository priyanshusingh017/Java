import java.util.*;

class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId , String resortName, String category, double price, double rating){
        this.resortId = resortId;
        this.resortName=resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    // setters -->
    public void setResortId(int resortId){
        this.resortId = resortId;
    }
    public void setResortName(String resortName){
        this.resortName = resortName;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setRating(double rating){
        this.rating = rating;
    }

    //getter -->
    public int getResortId(){
        return resortId;
    }
    public String getResortName(){
        return resortName;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public double getRating(){
        return rating;
    }
}

public class main4 {
    public static double Avg_resort( Resort []arr , String resortCategory){
        double avgcategory =0; int count=0;
        for(Resort r:arr){
            if(r.getCategory().equals(resortCategory) && r.getRating()>4){
                avgcategory+=r.getPrice();
                count++;
            }
        }
        return avgcategory==0 ? 0.0 : avgcategory/count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Resort[] resorts = new Resort[4];
        for(int i=0; i<resorts.length; i++){
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            sc.nextLine();
            resorts[i] = new Resort(resortId, resortName, category, price, rating);
        }
        String category_id = sc.nextLine();

        double avgPrice = Avg_resort(resorts, category_id);

        if(avgPrice > 0){
            System.out.println("Avg price " + avgPrice);
        }
        else{
            System.out.println("There are no such available resort");
        }
    }
}
