package Q4;

public class StudentTicket extends TrainTicket{
    public StudentTicket(String passengerName, double baseFare){
        super(passengerName, baseFare);

    }
    @Override
    public double getFinalPrice(){
        return baseFare*0.8;
    }
    @Override
    public String toString(){
        return "passenger: "+passengerName+" -> "+getFinalPrice()+" Baht";
    }
}
