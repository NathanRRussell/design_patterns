package iterator.Airline;

public class Flight {
    public String flightNum;
    public String from;
    public String to;
    public int duration;
    public int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }
    
    public int getTransfers() {
        return transfers;
    }

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
