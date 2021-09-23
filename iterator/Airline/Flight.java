package iterator.Airline;

/**
 * A Flight
 * @author Nathan Russell
 */
public class Flight {
    public String flightNum;
    public String from;
    public String to;
    public int duration;
    public int transfers;

    /**
     * Initializes a flight
     * @param flightNum the number of the flight
     * @param from where the plane is coming from
     * @param to where the plane is going to
     * @param duration the length of the flight in hours and minutes
     * @param transfers the number of transfers on the flight
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * Gets where the plane is coming from
     * @return returns where the plane is coming from
     */
    public String getFrom() {
        return from;
    }

    /**
     * Gets where the plane is going to
     * @return returns where the plane is going to
     */
    public String getTo() {
        return to;
    }

    /**
     * Gets the duration of the flight
     * @return returns the number of minutes of the flight
     */
    public int getDuration() {
        return duration;
    }
    
    /**
     * Gets the number of transfers during the flight
     * @return returns the number of transfers during the flight
     */
    public int getTransfers() {
        return transfers;
    }

    /**
     * Returns a string of information of the flight based on the number of transfers
     */
    public String toString() {
        if(transfers == 0) {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes "+"\nDirect Flight";
        } 
        else if(transfers == 1) {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes "+"\n"+transfers+" Transfer";
        } 
        else {
            return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+duration/60+" hours "+duration%60+" minutes "+"\n"+transfers+" Transfers";
        }
    }
}
