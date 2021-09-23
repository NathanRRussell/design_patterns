package iterator.Airline;
import java.util.Iterator;

/**
 * The Flight Iterator
 * @author Nathan Russell
 */
public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

    /**
     * Initializes the flight
     * @param flights an array for flights
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * Checks if there is a next position in the array
     */
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Moves to the next position in the array
     */
    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }
}
