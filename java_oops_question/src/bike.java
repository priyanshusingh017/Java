import java.util.*;

class Flights{
    private int id;
    private String source;
    private String destination;
    private double price;

    // parametrized constructor -->
    Flights(int id, String source, String destination, double price){
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    // setter -->
    public void setId(int id){
        this.id = id;
    }
    public void setSource(String source){
        this.source = source;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setPrice(double price){
        this.price = price;
    }

    // getter -->
    public int getId(){
        return id;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public double getPrice(){
        return price;
    }
}


public class bike {
    public static ArrayList<Flights> expenseFlight(ArrayList<Flights> flights){

        double expensePrice = Double.MIN_VALUE;

        ArrayList<Flights> result = new ArrayList<>();
        for( Flights f:flights){
            if(f.getPrice()>expensePrice){
                expensePrice=f.getPrice();
                result.clear();
                result.add(f);
            }
        }

        return result;
    }
    public static ArrayList<Flights> cheapestFlight(ArrayList<Flights> flights){
        double cheapestPrice = Double.MAX_VALUE;
        ArrayList<Flights> result = new ArrayList<>();
        for( Flights f:flights){
            if(f.getPrice()<cheapestPrice){
                cheapestPrice=f.getPrice();
                result.clear();
                result.add(f);
            }
        }
        return result;
    }

    public static double averagePrice(ArrayList<Flights> flights){
        double sum=0;
        for(Flights f:flights){
            sum+=f.getPrice();
        }
        return (sum/flights.size());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Flights> flight = new ArrayList<>();
        for(int i=0; i<n; i++){
            int id =sc.nextInt();
            sc.nextLine();
            String source = sc.nextLine();
            String destination = sc.nextLine();
            double price = sc.nextDouble();

            flight.add(new Flights(id,source,destination,price));
        }

        ArrayList<Flights> ans = expenseFlight(flight);
        ArrayList<Flights> cheapest = cheapestFlight(flight);
        System.out.println("Expensive flights:");
        for(Flights f:ans){
            System.out.println("ID: "+f.getId());
            System.out.println("SOURCE: "+f.getSource());
            System.out.println("DESTINATION: "+f.getDestination());
            System.out.println("PRICE: "+f.getPrice());
        }
        System.out.println("Cheapest flights:");
        for(Flights f:cheapest){
            System.out.println("ID: "+f.getId());
            System.out.println("SOURCE: "+f.getSource());
            System.out.println("DESTINATION: "+f.getDestination());
            System.out.println("PRICE: "+f.getPrice());
        }
        double averagePrice = averagePrice(flight);
        System.out.println("Average price: "+averagePrice);
    }
}
