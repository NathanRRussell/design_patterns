package iterator.Airline;

public class Airline {
    public String title;
    public Flight[] flights;
    public int size = 0;

    public Airline(String title) {
        flights = new Flight[2];
        this.title = title;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
            if(flights.length==size) {
                flights = growArray(flights);
            }
            flights[size] = new Flight(flightNum, from, to, duration, transfers);
            size++;
    }

    public String getTitle() {
        return title;
    }
    
    public Flight[] growArray(Flight[] flights) {
        Flight[] moreFlights = new Flight[flights.length*2];
        for(int i=0; i<flights.length;i++) {
            moreFlights[i]=flights[i];
        }
        return moreFlights;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}
