import java.io.IOException;
import java.util.*;

class RunwaySchedule{
    private int flightID;
    private String flightName;
    private int takeOffTime;
    private int ticketprice;

    RunwaySchedule(int flightId, String flightName, int takeOffTime, int ticketprice){
        this.flightID=flightId;
        this.flightName=flightName;
        this.takeOffTime=takeOffTime;
        this.ticketprice=ticketprice;
    }

    // setter ->
    public void setflightId(int flightId){
        this.flightID=flightId;
    }
    public void setflightName(String flightName){
        this.flightName=flightName;
    }
    public void settakeOffTime(int takeOffTime){
        this.takeOffTime=takeOffTime;
    }
    public void setticketprice(int ticketprice){
        this.ticketprice=ticketprice;
    }

    // getter-->
    public int getflightId(){
        return flightID;
    }
    public String getflightName(){
        return flightName;
    }
    public int gettaleOffTime(){
        return takeOffTime;
    }
    public int getticketprice(){
        return ticketprice;
    }
}

public class FlightSolution {
    public static double calculateAverageGap(ArrayList<RunwaySchedule>flights){
        if(flights.size()<2){
            System.out.println("Size is not sufficient to calculate average gap");
            return 0.0;
        }

        int totalgap =0;
        for(int i=0; i<flights.size()-1; i++){
            int gap = flights.get(i+1).gettaleOffTime()- flights.get(i).gettaleOffTime();
            totalgap += gap;
        }

        return (double)totalgap/(flights.size()-1);
    }

    public static ArrayList<RunwaySchedule>AdjustFlightBasedOnTotalGap(ArrayList<RunwaySchedule>flights){

        ArrayList<RunwaySchedule>ans = new ArrayList<>();
        int totalgap = 0;
        for(int i=0; i<flights.size()-1; i++){
            totalgap += flights.get(i+1).gettaleOffTime() - flights.get(i).gettaleOffTime();
        }
        int lastflightsPrice = flights.get(flights.size()-1).getticketprice();
        if(totalgap<300 && lastflightsPrice<1000){
            flights.remove(flights.size()-1);
        }

        for(RunwaySchedule r : flights){
            ans.add(r);
        }

        if(ans.isEmpty()){
            System.out.println("No Runway Schedule found");
            return null;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Size should be whole number.");
            return;
        }

        ArrayList<RunwaySchedule> flights = new ArrayList<>();
        for(int i=0; i<n; i++){
            int flightId = sc.nextInt();
            sc.nextLine();
            String flightName = sc.nextLine();
            int takeOffTime = sc.nextInt();
            sc.nextLine();
            int ticketprice = sc.nextInt();

            flights.add(new RunwaySchedule(flightId, flightName, takeOffTime, ticketprice));

        }

        double avggap = calculateAverageGap(flights);
        System.out.println("The average gap is: "+avggap);

        ArrayList<RunwaySchedule>result = AdjustFlightBasedOnTotalGap(flights);
        for(RunwaySchedule r : result){
            System.out.println("Id: " + r.getflightId());
            System.out.println("Name: " + r.getflightName());
            System.out.println("TakeOffTime: "+ r.gettaleOffTime());
            System.out.println("Ticketprice: "+ r.getticketprice());
        }
    }
}

/*
Input 1-
5
101
IndiGo
100
800
102
AirIndia
180
1200
103
Vistara
250
900
104
SpiceJet
340
950
105
Akasa
420
700

Output 2-
The average gap is: 80.0
Id: 101
Name: IndiGo
TakeOffTime: 100
Ticketprice: 800
Id: 102
Name: AirIndia
TakeOffTime: 180
Ticketprice: 1200
Id: 103
Name: Vistara
TakeOffTime: 250
Ticketprice: 900
Id: 104
Name: SpiceJet
TakeOffTime: 340
Ticketprice: 950
Id: 105
Name: Akasa
TakeOffTime: 420
Ticketprice: 700

Input 2 -
4
201
IndiGo
100
700
202
AirIndia
150
1200
203
Vistara
200
800
204
SpiceJet
250
900

OutPut 2-
The average gap is: 50.0
Id: 201
Name: IndiGo
TakeOffTime: 100
Ticketprice: 700
Id: 202
Name: AirIndia
TakeOffTime: 150
Ticketprice: 1200
Id: 203
Name: Vistara
TakeOffTime: 200
Ticketprice: 800
 */