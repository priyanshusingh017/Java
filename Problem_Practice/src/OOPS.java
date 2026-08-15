import java.util.*;

class Flight{
    int id;
    String Source;
    String destination;
    double price;

    Flight(int id, String Source, String destination, double price){
        this.id=id;
        this.Source=Source;
        this.destination=destination;
        this.price=price;
    }

    // setter -->
    public void setId(int id){
        this.id = id;
    }
    public void setSource(String Source){
        this.Source=Source;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setPrice(double price){
        this.price=price;
    }

    // getter -->
    public int getId(){
        return id;
    }
    public String getsource(){
        return Source;
    }
    public String getdestination(){
        return destination;
    }
    public double getprice() {
        return price;
    }
}

public class OOPS {
    public static ArrayList<Flight>expenseflight(ArrayList<Flight> flights){

        ArrayList<Flight> result = new ArrayList<>();
        for(Flight f : flights){
            if(f.getprice()>5000){
                result.add(f);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Flight> flights = new ArrayList<>();

        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String source = sc.nextLine();
            String destination = sc.nextLine();
            double price = sc.nextDouble();

            flights.add(new Flight(id,source,destination,price));
        }

        ArrayList<Flight> ans = expenseflight(flights);
        for(Flight f : ans){
            System.out.println("ID: "+f.getId());
            System.out.println("Source: "+f.getsource());
            System.out.println("Destination: "+f.getdestination());
            System.out.println("Price: "+f.getprice());
        }

    }
}
