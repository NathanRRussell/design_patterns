package iterator.Airline;

/**
 * An Airline
 * @author Nathan Russell
 */
public class Airline {
    public String title;
    public Flight[] flights;
    public int size = 0;

    /**
     * Initializes a flight and its array
     * @param title the title of a flight
     */
    public Airline(String title) {
        flights = new Flight[2];
        this.title = title;
    }

    /**
     * Adds a flight to the array
     * @param flightNum the number of the flight
     * @param from where the plane is coming from
     * @param to where the plane is going to
     * @param duration the length of the flight in hours and minutes
     * @param transfers the number of transfers on the flight
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
            if(flights.length==size) {
                flights = growArray(flights);
            }
            flights[size] = new Flight(flightNum, from, to, duration, transfers);
            size++;
    }

    /**
     * Gets the title of the flight
     * @return returns the title of the flight
     */
    public String getTitle() {
        return title;
    }

    /**
     * Extends the initial array if space is needed for more flights
     * @param flights an array of flights
     * @return returns an array with room for more flights
     */
    public Flight[] growArray(Flight[] flights) {
        Flight[] moreFlights = new Flight[flights.length*2];
        for(int i=0; i<flights.length;i++) {
            moreFlights[i]=flights[i];
        }
        return moreFlights;
    }

    /**
     * Creates the iterator
     * @return returns a new iterator passing in the flights array
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}
