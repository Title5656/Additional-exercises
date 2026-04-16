package Q4;

public abstract class TrainTicket {
    String passengerName;
    double baseFare;
    public TrainTicket(String passengerName, double baseFare) {
        if (baseFare < 0) {
            throw new IllegalArgumentException("Invalid base fare: " + baseFare);
        }
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }
    

public abstract double getFinalPrice();     
}



