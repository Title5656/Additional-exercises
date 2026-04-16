package Q4;

public class RegularTicket extends TrainTicket{
    public RegularTicket(String passengerName, Double baseFare){
        super(passengerName, baseFare);
        
    }
    @Override
    public double getFinalPrice(){
        return baseFare;
    }
    @Override
    public String toString(){
        return "passenger: "+passengerName+" -> "+getFinalPrice()+" Baht";
    }
}
